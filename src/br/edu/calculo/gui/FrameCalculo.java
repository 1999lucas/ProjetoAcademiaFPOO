package br.edu.calculo.gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;


import br.edu.calculo.model.Pessoa;

public class FrameCalculo {
	
		public void criarTela() throws ParseException {
			
			JFrame telaCalculo = new JFrame();
			telaCalculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaCalculo.setSize(800, 350); // Tamanho da Janela
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
			labeldataNascimento.setBounds(10, 50, 117, 30);
			
			//Criação do Campo de Inserção de Dados "Data de Nascimento"
			JTextField textdataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
			textdataNascimento.setBounds(140, 50, 220, 30);
			
			//Criação do Label "Gênero"
			JLabel labelGenero = new JLabel();
			labelGenero.setText("Gênero:");
			labelGenero.setBounds(10, 90, 60, 30);
			
			//**Radio Sexo M	
			JRadioButton radioMasculino = new JRadioButton();
			radioMasculino.setText("Masculino");
			radioMasculino.setBounds(180,90,150,30);
			
			//**Radio Sexo F		
			JRadioButton radioFeminino = new JRadioButton();
			radioFeminino.setText("Feminino");	
			radioFeminino.setBounds(60,90,120,30);
			
			//**Radio Button Group*** -> Impede que duas opções sejam selecionadas ao mesmo tempo.
			ButtonGroup radioGroup = new ButtonGroup();
	        radioGroup.add(radioMasculino);
	        radioGroup.add(radioFeminino);
			
			//Criação do Label "Peso"
			JLabel labelPeso = new JLabel();
			labelPeso.setText("Peso:");
			labelPeso.setBounds(10, 130, 60, 30);
			
			//Criação do Campo de Inserção de Dados "Peso"
			JTextField textPeso = new JTextField();
			textPeso.setBounds(140, 130, 220, 30);
			
			//Criação do Label "Altura"
			JLabel labelAltura = new JLabel();
			labelAltura.setText("Altura:");
			labelAltura.setBounds(10, 170, 60, 30);
			
			//Criação do Campo de Inserção de Dados "Altura"
			JTextField textAltura = new JTextField();
			textAltura.setBounds(140, 170, 220, 30);
		
			//JComboBox -> Janela com múltiplas escolhas
			String niveisDeAtividade[] = {"Nenhuma", "Leve","Moderado", "Intenso", "Selecione um nível de atividade"};
	        JComboBox<String> combo = new JComboBox<String>(niveisDeAtividade);
	        combo.setBounds(10, 220, 225, 30);
	        combo.setSelectedItem(niveisDeAtividade[4]);
	        
	        //Botão Calcular
	        JButton buttonCalcular = new JButton();
	        buttonCalcular.setText("CALCULAR");
	        buttonCalcular.setBounds(10, 260, 130, 40);
	        
	        //Botão Limpar
	        JButton buttonLimpar = new JButton();
	        buttonLimpar.setText("LIMPAR");
	        buttonLimpar.setBounds(150, 260, 130, 40);
	        
	        //Título "Resultados"
	        JLabel labelResultados = new JLabel();
	        labelResultados.setText("Resultados:");
	        labelResultados.setFont(new Font("Century Gothic,", 1, 26));
	        labelResultados.setBounds(400, 10, 200, 30);
	        labelResultados.setForeground(Color.BLUE);
	        
	        JLabel labelResultadoNome = new JLabel();
	        labelResultadoNome.setText("Nome: ");
	        labelResultadoNome.setBounds(400, 60, 400, 30); 
	        
	        JLabel labelResultadoIdade = new JLabel();
	        labelResultadoIdade.setText("Idade: ");
	        labelResultadoIdade.setBounds(400, 90, 400, 30); 
	        
	        JLabel labelResultadoIMC = new JLabel();
	        labelResultadoIMC.setText("IMC: ");
	        labelResultadoIMC.setBounds(400, 120, 400, 30);
	        
	        JLabel labelResultadoStatusIMC = new JLabel();
	        labelResultadoStatusIMC.setText("Status do IMC: ");
	        labelResultadoStatusIMC.setBounds(400, 150, 400, 30); 
	        
	        JLabel labelResultadoNCD = new JLabel();
	        labelResultadoNCD.setText("NCD: ");
	        labelResultadoNCD.setBounds(400, 180, 210, 30); 
	        
	        //Botão calcular e suas ações
	        buttonCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Pessoa aluno1 = new Pessoa();
					aluno1.setNome(textNome.getText());
				
					labelResultadoNome.setText("Nome: "+aluno1.getNome());
					
					String dia = textdataNascimento.getText().substring(0, 2);
					String mes = textdataNascimento.getText().substring(3, 5);
					String ano = textdataNascimento.getText().substring(6, 10);
	
					aluno1.setDataNascimento(LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia)));
			
				    labelResultadoIdade.setText("Idade: " + aluno1.getIdade());
					aluno1.setPeso(Double.parseDouble(textPeso.getText()));
					aluno1.setAltura(Double.parseDouble(textAltura.getText()));
					labelResultadoIMC.setText("IMC: " + String.format("%.2f",aluno1.getImc()));
				    labelResultadoStatusIMC.setText("Status do IMC: " + String.valueOf(aluno1.getStatusImc()));
				    
				    aluno1.setGenero(radioMasculino.isSelected()?'M':'F');
				    aluno1.setNivelAtividade(combo.getSelectedItem().toString());
				    
				    labelResultadoNCD.setText("NCD: " + String.format("%.2f", aluno1.calcularNcd()));
				}
			});
	        
	        	buttonLimpar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						textNome.setText("");
						textdataNascimento.setText("");
						textPeso.setText("");
						textAltura.setText("");
						
						labelResultadoNome.setText("Nome: ");
						labelResultadoIdade.setText("Idade: ");
						labelResultadoIMC.setText("IMC: ");
						labelResultadoStatusIMC.setText("Status do IMC: ");
						labelResultadoNCD.setText("NCD: ");
						
						
					}
				});;
			
			//ADICIONAR E EXIBIR ELEMENTOS NA TELA
			telaCalculo.getContentPane().add(labelNome);
			telaCalculo.getContentPane().add(textNome);
			telaCalculo.getContentPane().add(labeldataNascimento);
			telaCalculo.getContentPane().add(textdataNascimento);
			telaCalculo.getContentPane().add(labelGenero);
			telaCalculo.getContentPane().add(radioFeminino);
			telaCalculo.getContentPane().add(radioMasculino);
			telaCalculo.getContentPane().add(labelPeso);
			telaCalculo.getContentPane().add(textPeso);
			telaCalculo.getContentPane().add(labelAltura);
			telaCalculo.getContentPane().add(textAltura);
			telaCalculo.getContentPane().add(combo);
			telaCalculo.getContentPane().add(buttonCalcular);
			telaCalculo.getContentPane().add(buttonLimpar);
			telaCalculo.getContentPane().add(labelResultados);
			telaCalculo.getContentPane().add(labelResultadoNome);
			telaCalculo.getContentPane().add(labelResultadoIdade);
			telaCalculo.getContentPane().add(labelResultadoIMC);
			telaCalculo.getContentPane().add(labelResultadoStatusIMC);
			telaCalculo.getContentPane().add(labelResultadoNCD);
			telaCalculo.getContentPane().add(labelResultadoNCD);
			
			telaCalculo.setVisible(true);
		}

}	
