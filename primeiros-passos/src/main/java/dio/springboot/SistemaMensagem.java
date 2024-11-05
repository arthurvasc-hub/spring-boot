package dio.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
@Autowired
    private Remetente noReply;
@Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noReply);
        System.out.println("Seu cadastro foi aprovado");
    }
    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@gmail.com");
        System.out.println(techTeam);
        System.out.println("Bem vindo ao time");

    }


}
