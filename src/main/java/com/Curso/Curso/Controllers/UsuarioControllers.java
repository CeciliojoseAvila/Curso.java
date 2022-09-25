package com.Curso.Curso.Controllers;

import com.Curso.Curso.Modelos.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControllers {

    @RequestMapping (value = "usuarios")

    public List<Usuario> getUsuarios (){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("CECI");
        usuario.setApellido("AVIL");
        usuario.setEmail("CECI@GMAIL.COM");
        usuario.setTeléfono("3253256");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNombre("NICO");
        usuario2.setApellido("ARRAY");
        usuario2.setEmail("NICO@GMAIL.COM");
        usuario2.setTeléfono("222222222");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNombre("ALBERT");
        usuario3.setApellido("BACAN");
        usuario3.setEmail("ALBERTTT@GMAIL.COM");
        usuario3.setTeléfono("33333333");

        Usuario usuario4 = new Usuario();
        usuario4.setId(4);
        usuario4.setNombre("JAVI");
        usuario4.setApellido("AJA");
        usuario4.setEmail("JAVIAJA@GMAIL.COM");
        usuario4.setTeléfono("5555555556");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
    return usuarios;

    }
    @RequestMapping (value = "usuario/123")

    public Usuario editar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("CECI");
        usuario.setApellido("AVIL");
        usuario.setEmail("CECI@GMAIL.COM");
        usuario.setTeléfono("3253256");

        return usuario;
}

    @RequestMapping (value = "usuario/12")

    public Usuario eliminar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("CECI");
        usuario.setApellido("AVIL");
        usuario.setEmail("CECI@GMAIL.COM");
        usuario.setTeléfono("3253256");

        return usuario;
}
    @RequestMapping (value = "usuario/1234")

    public Usuario buscar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("CECI");
        usuario.setApellido("AVIL");
        usuario.setEmail("CECI@GMAIL.COM");
        usuario.setTeléfono("3253256");

        return usuario;

}
}