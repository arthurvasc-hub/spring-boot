package dio.web.api.controller;


import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> getUsers(){
        return repository.findAll();
    };

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") Integer id){
        return repository.findById(id);

    }

    @GetMapping("/{username}")
    public Usuario findByUsername(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
