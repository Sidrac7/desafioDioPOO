package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	
	public int getCaragaHoraria() {
		return cargaHoraria;
	}
	public void setCaragaHoraria(int caragaHoraria) {
		this.cargaHoraria = caragaHoraria;
	}
	@Override
	public double calcularXp() {
		
		return XO_PADRAO+20;
	}
	@Override
	public String toString() {
		return super.toString()+"Curso [cargaHoraria=" + cargaHoraria +"]";
	}
	
	
	
	
}
