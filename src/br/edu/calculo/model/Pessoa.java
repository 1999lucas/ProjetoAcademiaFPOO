package br.edu.calculo.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private String nivelAtividade;
	
	private char genero;
	
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
	
	/**
	 * @return
	 */
	public double getStatusNivelAtividade() {
			
			if(this.getNivelAtividade() == "NENHUMA" && this.getGenero() == 'M'){
				return this.calcularNcd();
				} else if(this.getNivelAtividade() == "LEVE" && this.getGenero() == 'M') {
				return this.calcularNcd() * 1.5;
				} else if(this.getNivelAtividade() == "MODERADA" && this.getGenero() == 'M') {
				return this.calcularNcd() * 1.8;
				} else if(this.getNivelAtividade() == "INTENSA" && this.getGenero() == 'M') {
				return this.calcularNcd() * 2.1;
				} else if(this.getNivelAtividade() == "NENHUMA" && this.getGenero() == 'F'){
				return this.calcularNcd();
				} else if(this.getNivelAtividade() == "LEVE" && this.getGenero() == 'F') {
				return this.calcularNcd() * 1.6;
				} else if(this.getNivelAtividade() == "MODERADA" && this.getGenero() == 'F') {
				return this.calcularNcd() * 1.6;
				} else if(this.getNivelAtividade() == "INTENSA" && this.getGenero() == 'F') {
				return this.calcularNcd() * 1.8;
				} else {
				return 00;
				}
				
			
			
			
			
		}
	

	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
		if (this.getGenero() == 'M' && this.getNivelAtividade() == "NENHUMA") {
		} else if(this.getGenero() == 'M' && this.getNivelAtividade() == "LEVE") {
		} else if(this.getGenero() == 'M' && this.getNivelAtividade() == "MODERADA") {
		} else if(this.getGenero() == 'M' && this.getNivelAtividade() == "INTENSA") {
		} else if(this.getGenero() == 'F' && this.getNivelAtividade() == "NENHUMA")	{
		} else if(this.getGenero() == 'F' && this.getNivelAtividade() == "LEVE") {
		} else if(this.getGenero() == 'F' && this.getNivelAtividade() == "MODERADA") {
		} else if(this.getGenero() == 'F' && this.getNivelAtividade() == "INTENSA") {	
		}else {
			System.out.println("Especifique seu nível de atividade ");
		}
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
	public void setGenero (char genero) {
		this.genero = genero;
	}
	
	public char getGenero() {
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
		if(this.getGenero() == 'M' && this.getIdade() >= 14 && this.getIdade() <= 30) {
			return 15.3 * this.getPeso() + 679;
			} else if(this.getGenero() == 'M' && this.getIdade() > 30 && this.getIdade() <= 60) {
			return 11.6 * this.getPeso() + 879;
			} else if(this.getGenero() == 'M' && this.getIdade() > 60) {
			return 13.5 * this.getPeso() + 487;
			} else if(this.getGenero() == 'F' && this.getIdade() >= 14 && this.getIdade() <= 30){
			return 14.7 * this.getPeso() + 496;
			} else if(this.getGenero() == 'F' && this.getIdade() > 30 && this.getIdade() <= 60) {
			return 8.7 * this.getPeso() + 829;
			} else if(this.getGenero() == 'F' && this.getIdade() > 60) {
			return 10.5 * this.getPeso() + 596;
			} else {
			return 0;
			}
			}

}	

