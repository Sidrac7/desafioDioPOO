package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JAVA");
		curso1.setDescricao("Descrição");
		curso1.setCaragaHoraria(25);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Kotlin");
		curso2.setDescricao("Descrição Kotlin");
		curso2.setCaragaHoraria(25);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria JAVA");
		mentoria.setDescricao("Desrição da Mentoria");
		mentoria.setData(LocalDate.now());
		
		
		/*
		 * System.out.println(curso1.toString()); System.out.println(curso2.toString());
		 * System.out.println(mentoria);
		 */
		BootCamp botcamp = new BootCamp();
		botcamp.setNome("BOOTCAMP BANCO PAN");
		botcamp.setDescricao("Dio Java Development");
		botcamp.getConteudos().add(curso1);
		botcamp.getConteudos().add(curso2);
		botcamp.getConteudos().add(mentoria);
		
		Dev sidrac = new Dev();
		sidrac.setNome("Sidrac ");
		sidrac.inscreverBootCamp(botcamp);
		System.out.println("Conteudos inscritos "+sidrac.getConteudosInscrito());
		System.out.println("XP "+sidrac.calcularXp());

		sidrac.progredir();
		System.out.println("Conteudos inscritos "+sidrac.getConteudosInscrito());
		System.out.println("XP "+sidrac.calcularXp());
		sidrac.progredir();
		
		System.out.println("Conteudos Concluidos "+sidrac.getConteudosCocluidos());
        System.out.println("XP "+sidrac.calcularXp());
		
        
        System.out.println("=======================");
		Dev marcio = new Dev();
		marcio.setNome("Marcio ");
		marcio.inscreverBootCamp(botcamp);
		System.out.println("Conteudos inscritos "+marcio.getConteudosInscrito());
		marcio.progredir();
		System.out.println("Conteudos Concluidos "+marcio.getConteudosCocluidos());
        System.out.println("XP "+marcio.calcularXp());

		
		
		


	}

}
