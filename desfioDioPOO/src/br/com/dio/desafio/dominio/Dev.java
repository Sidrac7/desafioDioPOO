package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosCocluidos = new LinkedHashSet<>();

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}

	public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}

	public Set<Conteudo> getConteudosCocluidos() {
		return conteudosCocluidos;
	}

	public void setConteudosCocluidos(Set<Conteudo> conteudosCocluidos) {
		this.conteudosCocluidos = conteudosCocluidos;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(conteudosCocluidos, conteudosInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosCocluidos, other.conteudosCocluidos)
				&& Objects.equals(conteudosInscrito, other.conteudosInscrito) && Objects.equals(nome, other.nome);
	}

	public void inscreverBootCamp(BootCamp bootCamp) {
		this.conteudosInscrito.addAll(bootCamp.getConteudos());
	    bootCamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosCocluidos.add(conteudo.get());
			this.conteudosInscrito.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum bootCamp");
		}
		
	}
	
	public double calcularXp() {
		return this.conteudosCocluidos.stream().mapToDouble(conteudo ->conteudo.calcularXp()).sum();
	}
}
