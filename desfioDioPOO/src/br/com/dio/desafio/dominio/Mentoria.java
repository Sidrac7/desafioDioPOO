package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XO_PADRAO+10;
	}
	@Override
	public String toString() {
		return super.toString()+"Mentoria [data=" + data + "]";
	}
	
	
	
}
