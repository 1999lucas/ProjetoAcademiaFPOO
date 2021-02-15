package br.edu.calculo.gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.calculo.model.nivelDeAtividade;
import br.edu.calculo.model.Pessoa;

public class FrameCalculo {
	
		public void criarTela() {
			
			JFrame telaCalculo = new JFrame();
			telaCalculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaCalculo.setSize(500, 300); // Tamanho da Janela
			telaCalculo.setTitle("Cálculo de IMC e NCD");
			telaCalculo.setLayout(null);
			
			//Criação do Label "Nome"
			JLabel labelNome = new JLabel();
			labelNome.setText("Nome:"); 
			labelNome.setBounds(10,10,80,30); // Posição da palavra nome na janela
			
			//Criação do Campo de Inserção de Dados "Nome"//
			JTextField textNome = new JTextField();
			textNome.setBounds(60, 10, 300, 30);
			
			//Criação do Label "Data de Nascimento"
			JLabel labeldataNascimento = new JLabel();
			labeldataNascimento.setText("Data de Nascimento:");
			labeldataNascimento.setBounds(10, 60, 117, 30);
			
			//Criação do Campo de Inserção de Dados "Data de Nascimento"
			JTextField textdataNascimento = new JTextField();
			textdataNascimento.setBounds(140, 60, 220, 30);
			
			//Criação do Label "Gênero"
			JLabel labelGenero = new JLabel();
			labelGenero.setText("Gênero:");
			labelGenero.setBounds(10, 110, 60, 30);
			
			//Adicionar e Exibir elementos na tela
			telaCalculo.getContentPane().add(labelNome);
			telaCalculo.getContentPane().add(textNome);
			telaCalculo.getContentPane().add(labeldataNascimento);
			telaCalculo.getContentPane().add(textdataNascimento);
			telaCalculo.getContentPane().add(labelGenero);
			telaCalculo.setVisible(true);
		}

}	
