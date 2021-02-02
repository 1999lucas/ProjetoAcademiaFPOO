package br.edu.calculo.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private String nivelAtividade;
	
	private String genero;
	
	private double altura;
	private double peso;
	
	private LocalDate dataNascimento;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivelAtividade() {
		return nivelAtividade;
	}

	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}

	// Altura
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}
	
	
	// Peso
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	
	
	// Gênero
	public void setGenero (String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	// Obter a idade da pessoa
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, hoje);
		return periodo.getYears();
	}
	
	
	// Índice de Massa Corporal (IMC)
	public double getImc() {
		return this.peso/(this.altura*this.altura);
	}
	
	public String getStatusImc() {
		if (this.getImc() <= 18.6) {
			return "Abaixo do peso";
		} else if (this.getImc() > 18.6 && this.getImc() < 25) {
			return "Peso ideal";
		} else if (this.getImc() >= 25 && this.getImc() < 30) {
			return "Levemente acima do peso";
		} else if (this.getImc() >= 30 && this.getImc() < 35) {
			return "Obesidade grau I";
		} else if (this.getImc() >= 35 && this.getImc() <= 40) {
			return "Obesidade grau II (Severa)";
		} else {
			return "Obesidade III (Morbida)";
		}
	}
	
	
	// NCD
	public double calcularNcd() {
		
		
		
		
		return 0;
	}
}

	

