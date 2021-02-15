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
			telaCalculo.setTitle("C�lculo de IMC e NCD");
			telaCalculo.setLayout(null);
			
			//Cria��o do Label "Nome"
			JLabel labelNome = new JLabel();
			labelNome.setText("Nome:"); 
			labelNome.setBounds(10,10,80,30); // Posi��o da palavra nome na janela
			
			//Cria��o do Campo de Inser��o de Dados "Nome"//
			JTextField textNome = new JTextField();
			textNome.setBounds(60, 10, 300, 30);
			
			//Cria��o do Label "Data de Nascimento"
			JLabel labeldataNascimento = new JLabel();
			labeldataNascimento.setText("Data de Nascimento:");
			labeldataNascimento.setBounds(10, 60, 117, 30);
			
			//Cria��o do Campo de Inser��o de Dados "Data de Nascimento"
			JTextField textdataNascimento = new JTextField();
			textdataNascimento.setBounds(140, 60, 220, 30);
			
			//Cria��o do Label "G�nero"
			JLabel labelGenero = new JLabel();
			labelGenero.setText("G�nero:");
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
