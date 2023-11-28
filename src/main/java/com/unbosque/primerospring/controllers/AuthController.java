package com.unbosque.primerospring.controllers;

import com.unbosque.primerospring.dao.UsuarioDAO;
import com.unbosque.primerospring.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UsuarioDAO usuarioDAO;



    @RequestMapping(value ="api/login", method = RequestMethod.POST)
    public Usuario login(@RequestBody Usuario usuario){
       return usuarioDAO.obtenerUsuario(usuario);

    }
}
