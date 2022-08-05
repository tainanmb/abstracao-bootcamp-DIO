import java.time.LocalDate;
import java.util.*;

import model.*;

public class Main {
	public static void main(String[] args) {

		// Instancia dos cursos
		Course curso_Angular = new Course("Angular", "Desenvolvimento de SPA com angular.", 25);
		Course curso_JavaScript = new Course("JavaScript", "Introdução ao JavaScript.", 25);

		// Instancia da mentoria
		LocalDate data = LocalDate.of(2022, 8, 01);
		Mentoring mentoria = new Mentoring("TypeScript", "Introdução ao TypeScript.", data);

		// Criando Lista de conteúdo com os cursos e mentoria definidos acima
		Set<Content> conteudos = new LinkedHashSet<>();
		conteudos.add(curso_Angular);
		conteudos.add(curso_JavaScript);
		conteudos.add(mentoria);

		// Instancia do bootcamp
		Bootcamp bootcampAngular = new Bootcamp("Angular Framework", "Desenvolvimento de SPA com Angular e TypeScript",
				conteudos);

		// Instancia dos desenvolvedores
		Dev dev1 = new Dev("Anderson Ribeiro");
		Dev dev2 = new Dev("Luis Gustavo Souza");

		// Inscrição dos desenvolvedores no bootcamp
		dev1.subscribeBootcamp(bootcampAngular);
		dev2.subscribeBootcamp(bootcampAngular);

		// Avanço dos desenvolvedores até o momento
		dev1.advance();
		dev2.advance();
		dev2.advance();
		
		
		System.out.println(bootcampAngular + "\n" + "------------------------------------------------------");
		System.out.println(dev1 + "\n" + "------------------------------------------------------");
		System.out.println(dev2 + "\n" + "------------------------------------------------------");

	}

}
