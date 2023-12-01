package com.unbosque.primerospring.controllers;

import com.unbosque.primerospring.dao.FacturaDAO;
import com.unbosque.primerospring.dao.RolFullDAO;
import com.unbosque.primerospring.dao.UsuarioDAO;
import com.unbosque.primerospring.models.Factura;
import com.unbosque.primerospring.models.FacturaResponse;
import com.unbosque.primerospring.models.RolComplete;
import com.unbosque.primerospring.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private RolFullDAO roldao;



    @RequestMapping(value ="api/usuarios")
    public List<Usuario> getUsuarios(){

        return usuarioDAO.getUsuarios();
    }

    @RequestMapping(value ="api/rol")
    public List<RolComplete> getRol(){
        return roldao.getRol();
    }


    @RequestMapping(value ="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash2= argon2.hash(1,1024,1, usuario.getPassword());
        usuario.setPassword(hash2);
      usuarioDAO.registrar(usuario);
    }
    @RequestMapping(value ="api/usuarios/{id}" , method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable long id){
        usuarioDAO.eliminar(id);

    }

}
