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
	
	//***GETTERS E SETTERS***
	
	//Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;	
	}
	//***Nível de Atividade***
	public String getStatusNivelAtividade() {
		return nivelAtividade;	
	}
	
	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
		if(this.getStatusNivelAtividade().equals("Nenhuma") && this.getGenero() == 'M') {
			
		} else if (this.getStatusNivelAtividade().equals("Leve") && this.getGenero() == 'M') {
			
		} else if (this.getStatusNivelAtividade().equals("Moderado") && this.getGenero() == 'M') {
			
		} else if (this.getStatusNivelAtividade().equals("Intenso") && this.getGenero() == 'M') {
			
		} else if(this.getStatusNivelAtividade().equals("Nenhuma") && this.getGenero() == 'F') {
			
		} else if (this.getStatusNivelAtividade().equals("Leve") && this.getGenero() == 'F') {
			
		}else if (this.getStatusNivelAtividade().equals("Moderado") && this.getGenero() == 'F') {
			
		}else if (this.getStatusNivelAtividade().equals("Intenso") && this.getGenero() == 'F') {
			
		}else {
			System.out.println("Especifique o nível de atividade");
		}
	}
	
	//***Altura***
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}
	
	//***Peso***
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	
	//***Gênero***
	public void setGenero (char genero) {
		this.genero = genero;
		if(this.getGenero() == 'F') {
			
		}else if(this.getGenero() == 'M') {
			
		}else {
			System.out.println("Especifique o sexo");
		}
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
		
		double ncd = 0;
		
		if(this.getGenero() == 'M' && this.getIdade() >=18 && this.getIdade() <=30) {
			ncd = 15.3 * this.getPeso() + 679; 
		}else if(this.getGenero() == 'M' && this.getIdade() >30 && this.getIdade() <=60) {
			ncd = 11.6 * this.getPeso() + 879;
		}else if(this.getGenero() == 'M' && this.getIdade() >60 ) {
			ncd = 13.5 * this.getPeso() + 487;
		}else if (this.getGenero() == 'F' && this.getIdade() >=18 && this.getIdade() <=30) {
			ncd = 14.7 * this.getPeso() + 496;
		}else if (this.getGenero() == 'F' && this.getIdade() >=30 && this.getIdade() <=60) {
			ncd = 8.7 * this.getPeso() + 829;
		}else if (this.getGenero() == 'F' && this.getIdade() >60) {
			ncd = 10.5 * this.getPeso() + 596;
		}else {
			ncd=0;
		} if(this.getStatusNivelAtividade().equals("Nenhuma") && this.getGenero() == 'M') {
			
		} else if (this.getStatusNivelAtividade().equals("Leve") && this.getGenero() == 'M') {
			ncd *= 1.5;
		}else if (this.getStatusNivelAtividade().equals("Moderado") && this.getGenero() == 'M') {
			ncd *= 1.8;
		}else if (this.getStatusNivelAtividade().equals("Intenso") && this.getGenero() == 'M') {
			ncd *= 2.1;
		}
		
		if(this.getStatusNivelAtividade().equals("Nenhuma") && this.getGenero() == 'F') {
			
		} else if (this.getStatusNivelAtividade().equals("Leve") && this.getGenero() == 'F') {
			ncd *= 1.6;
		}else if (this.getStatusNivelAtividade().equals("Moderado") && this.getGenero() == 'F') {
			ncd *= 1.6;
		}else if (this.getStatusNivelAtividade().equals("Intenso") && this.getGenero() == 'F') {
			ncd *= 1.8;
		}
		return ncd;
	}
}