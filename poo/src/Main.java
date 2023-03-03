import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setNome("Debugging com Java");
		curso1.setDescricao("Nesse curso aprenderemos como usar a ferramenta de Debug");
		curso1.setCargaHoraria(1);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setNome("Boas práticas Java");
		mentoria1.setDescricao("Descrição muito bem escrita");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(mentoria1);
		
	}
}