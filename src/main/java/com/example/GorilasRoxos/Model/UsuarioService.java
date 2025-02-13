package com.example.GorilasRoxos.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public List<UsuariosBD> encontrarTodos() {
        return repo.findAll();
    }

    public UsuariosBD salvar(UsuariosBD usuario) {
        return repo.save(usuario);
    }

    // Outros métodos para buscar, atualizar e deletar usuários
}
