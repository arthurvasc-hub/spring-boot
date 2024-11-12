package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na caamda de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");

    System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("arthurvasc", "arthur008"));
        usuarios.add(new Usuario("arthurvasc2", "arthur008"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("Find/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("arthurvasc", "arthur008");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("Find/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("arthurvasc", "arthur008");
    }
}
