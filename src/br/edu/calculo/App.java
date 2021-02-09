package br.edu.calculo;

import java.time.LocalDate;


import br.edu.calculo.gui.FrameCalculo;
import br.edu.calculo.model.Pessoa;

public class App {

	public static void main(String[] args) {
		
		FrameCalculo telaCalculo = new FrameCalculo();
		telaCalculo.criarTela();
	
		
		Pessoa aluno = new Pessoa();
		aluno.setNome("Maria");
		aluno.setDataNascimento(LocalDate.of(1990, 05, 15));
		aluno.setPeso(170);
		aluno.setAltura(1.80);
		aluno.setGenero('F');
		System.out.println(aluno.getIdade());
		System.out.println(aluno.getImc());
		System.out.println(aluno.getStatusImc());
		aluno.setNivelAtividade("MODERADA");
		System.out.println("Nivel de atividade: " + aluno.getNivelAtividade());
		System.out.println("NDC: " + aluno.getStatusNivelAtividade());
		

		
	}
}