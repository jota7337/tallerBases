package com.unbosque.primerospring.dao;

import com.unbosque.primerospring.models.Usuario;


import java.util.List;

public interface UsuarioDAO {


     List<Usuario> getUsuarios();

     void eliminar(long id);

     void registrar(Usuario usuario);

     Usuario obtenerUsuario(Usuario usuario);

     void mostrarRol(long id);
}
