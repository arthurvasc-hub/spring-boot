package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {SpringApplication.run(PrimeirosPassosApplication.class, args);

		}
	// Método separado para definir o Bean
	@Bean
	public CommandLineRunner run(SistemaMensagem s) throws Exception {
		return args -> {
			s.enviarConfirmacaoCadastro();
			s.enviarMensagemBoasVindas();
			s.enviarConfirmacaoCadastro();
		};
	}
	}


