package com.unbosque.primerospring.dao;

import com.unbosque.primerospring.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDAO{
    @PersistenceContext
   private EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(long id) {
        Usuario usuario =entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);

    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Usuario usuario) {

        String query = "FROM Usuario where email = :email ";
      Optional<Usuario> lista= entityManager.createQuery(query)
               .setParameter("email",usuario.getEmail())
               .getResultList()
              .stream()
               .findFirst();

      if(lista.isEmpty()){
          return new Usuario();
      }

      String pasworhas=lista.get().getPassword();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

         if( argon2.verify(pasworhas, usuario.getPassword())){
             return lista.get();
         }else{
             return  new Usuario();
         }
    }
}
