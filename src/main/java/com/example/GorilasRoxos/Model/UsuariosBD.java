package com.example.GorilasRoxos.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class UsuariosBD {
    @Id
    private String id;
    private String email;
    private String senha;
}
