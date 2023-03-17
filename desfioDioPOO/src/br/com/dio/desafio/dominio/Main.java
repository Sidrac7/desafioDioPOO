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
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
	}

}
