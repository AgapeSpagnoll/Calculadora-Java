package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;

public class CalcApp {

	private JFrame frmCalculadora;
	private JTextField display;

	private JButton btn_Limpar;
	private JButton btn_BackSpace;
	private JButton btn_Soma;
	private JButton btn_Div;
	private JButton btn_Sub;
	private JButton btn_Mult;
	private JButton btn_Ponto;
	private JButton btn_Igual;

	private JButton btn_Um;
	private JButton btn_Dois;
	private JButton btn_Tres;
	private JButton btn_Quatro;
	private JButton btn_Cinco;
	private JButton btn_Seis;
	private JButton btn_Sete;
	private JButton btn_Oito;
	private JButton btn_Nove;
	private JButton btn_Zero;

	double primeiro;
	double segundo;
	double resultado;
	String operacao;
	String resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp window = new CalcApp();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/* Criando a JANELA da calculadora */
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setForeground(new Color(0, 0, 0));
		frmCalculadora.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frmCalculadora.getContentPane().setBackground(new Color(60, 60, 60));
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\agape\\OneDrive\\Documentos\\SISTEMAS DE INFORMAÇÃO -FAESA\\1º PERIODO\\Tópicos Especiais\\CalcApp\\Icon\\IconCalc.svg"));
		frmCalculadora.setFont(new Font("Tahoma", Font.PLAIN, 25)); /*Aqui está definido a fonte padrão. */
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setResizable(false); /* Não quero que o usuário possa modificar o tamanho da calculadora. */
		frmCalculadora.setBounds(100, 100, 320, 450);  /* X,Y, Largura,Altura */
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		

		/* Criando o DISPLAY da calculadora */
		display = new JTextField();
		display.setEditable(false);
		display.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		display.setForeground(new Color(255, 255, 255));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		display.setBackground(new Color(47, 79, 79));
		display.setBounds(21, 13, 276, 69);
		frmCalculadora.getContentPane().add(display);
		display.setColumns(10);

		
		/*Criando os botões númericos*/
		btn_Zero = new JButton("0");
		btn_Zero.setForeground(new Color(255, 255, 255));
		btn_Zero.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Zero.setBackground(new Color(86, 86, 86));
		btn_Zero.setBounds(21, 347, 121, 50);
		frmCalculadora.getContentPane().add(btn_Zero);

		btn_Um = new JButton("1");
		btn_Um.setForeground(new Color(255, 255, 255));
		btn_Um.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Um.setBackground(new Color(86, 86, 86));
		btn_Um.setBounds(21, 284, 50, 50);
		frmCalculadora.getContentPane().add(btn_Um);

		btn_Dois = new JButton("2");
		btn_Dois.setForeground(new Color(255, 255, 255));
		btn_Dois.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Dois.setBackground(new Color(86, 86, 86));
		btn_Dois.setBounds(92, 284, 50, 50);
		frmCalculadora.getContentPane().add(btn_Dois);

		btn_Tres = new JButton("3");
		btn_Tres.setForeground(new Color(255, 255, 255));
		btn_Tres.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Tres.setBackground(new Color(86, 86, 86));
		btn_Tres.setBounds(163, 284, 50, 50);
		frmCalculadora.getContentPane().add(btn_Tres);

		btn_Quatro = new JButton("4");
		btn_Quatro.setForeground(new Color(255, 255, 255));
		btn_Quatro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Quatro.setBackground(new Color(86, 86, 86));
		btn_Quatro.setBounds(21, 221, 50, 50);
		frmCalculadora.getContentPane().add(btn_Quatro);

		btn_Cinco = new JButton("5");
		btn_Cinco.setForeground(new Color(255, 255, 255));
		btn_Cinco.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Cinco.setBackground(new Color(86, 86, 86));
		btn_Cinco.setBounds(92, 221, 50, 50);
		frmCalculadora.getContentPane().add(btn_Cinco);

		btn_Seis = new JButton("6");
		btn_Seis.setForeground(new Color(255, 255, 255));
		btn_Seis.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Seis.setBackground(new Color(86, 86, 86));
		btn_Seis.setBounds(163, 221, 50, 50);
		frmCalculadora.getContentPane().add(btn_Seis);

		btn_Sete = new JButton("7");
		btn_Sete.setForeground(new Color(255, 255, 255));
		btn_Sete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Sete.setBackground(new Color(86, 86, 86));
		btn_Sete.setBounds(21, 158, 50, 50);
		frmCalculadora.getContentPane().add(btn_Sete);

		btn_Oito = new JButton("8");
		btn_Oito.setForeground(new Color(255, 255, 255));
		btn_Oito.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Oito.setBackground(new Color(86, 86, 86));
		btn_Oito.setBounds(92, 158, 50, 50);
		frmCalculadora.getContentPane().add(btn_Oito);

		btn_Nove = new JButton("9");
		btn_Nove.setForeground(new Color(255, 255, 255));
		btn_Nove.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Nove.setBackground(new Color(86, 86, 86));
		btn_Nove.setBounds(163, 158, 50, 50);
		frmCalculadora.getContentPane().add(btn_Nove);
		
		
		
		/*Criando os botões para as operações*/
		btn_Div = new JButton("/");
		btn_Div.setForeground(new Color(255, 255, 255));
		btn_Div.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Div.setBackground(new Color(86, 86, 86));
		btn_Div.setBounds(163, 95, 50, 50);
		frmCalculadora.getContentPane().add(btn_Div);

		btn_Mult = new JButton("*");
		btn_Mult.setForeground(new Color(255, 255, 255));
		btn_Mult.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Mult.setBackground(new Color(86, 86, 86));
		btn_Mult.setBounds(234, 95, 50, 50);
		frmCalculadora.getContentPane().add(btn_Mult);

		btn_Sub = new JButton("-");
		btn_Sub.setForeground(new Color(255, 255, 255));
		btn_Sub.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Sub.setBackground(new Color(86, 86, 86));
		btn_Sub.setBounds(234, 158, 50, 50);
		frmCalculadora.getContentPane().add(btn_Sub);

		btn_Soma = new JButton("+");
		btn_Soma.setForeground(Color.WHITE);
		btn_Soma.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Soma.setBackground(new Color(86, 86, 86));
		btn_Soma.setBounds(234, 221, 50, 50);
		frmCalculadora.getContentPane().add(btn_Soma);

		btn_Ponto = new JButton(".");
		btn_Ponto.setForeground(new Color(255, 255, 255));
		btn_Ponto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Ponto.setBackground(new Color(86, 86, 86));
		btn_Ponto.setBounds(163, 347, 50, 50);
		frmCalculadora.getContentPane().add(btn_Ponto);

		btn_Limpar = new JButton("C");
		btn_Limpar.setForeground(new Color(255, 255, 255));
		btn_Limpar.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btn_Limpar.setBackground(new Color(86, 86, 86));
		btn_Limpar.setBounds(21, 95, 50, 50);
		frmCalculadora.getContentPane().add(btn_Limpar);

		btn_BackSpace = new JButton("←");
		btn_BackSpace.setForeground(new Color(255, 255, 255));
		btn_BackSpace.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_BackSpace.setBackground(new Color(86, 86, 86));
		btn_BackSpace.setBounds(92, 95, 50, 50);
		frmCalculadora.getContentPane().add(btn_BackSpace);

		btn_Igual = new JButton("=");
		btn_Igual.setForeground(new Color(255, 255, 255));
		btn_Igual.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_Igual.setBackground(new Color(85, 107, 47));
		btn_Igual.setBounds(234, 284, 50, 115);
		frmCalculadora.getContentPane().add(btn_Igual);

		/* Adicionando  as acões (ActionListeners) aos botões numéricos */

		btn_Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});

		btn_Um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});

		btn_Dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});

		btn_Tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});

		btn_Quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});

		btn_Cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});

		btn_Seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});

		btn_Sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});

		btn_Oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});

		btn_Nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});

		btn_Ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + ".");
			}
		});

		/* Adicionando ações (ActionListeners) para as operações */

		btn_Soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().isEmpty()) {
					primeiro =  Double.parseDouble(display.getText()); 
					operacao = "+";
					display.setText(display.getText() + " + "); // Mostra o primeiro número e a operação
				}
			}
		});

		btn_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().isEmpty()) {
					primeiro = Double.parseDouble(display.getText());
					operacao = "-";
					display.setText(display.getText() + " - "); // Mostra o primeiro número e a operação
				}
			}
		});

		btn_Mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().isEmpty()) {
					primeiro = Double.parseDouble(display.getText()); 
					operacao = "*";
					display.setText(display.getText() + " * "); // Mostra o primeiro número e a operação
				}
			}
		});

		btn_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().isEmpty()) {
					primeiro = Double.parseDouble(display.getText()); 
					operacao = "/";
					display.setText(display.getText() + " / "); // Mostra o primeiro número e a operação
				}
			}
		});

		btn_Igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] partes = display.getText().split(" ");
				if (partes.length == 3) { // Espera "número operação número"
					segundo = Double.parseDouble(partes[2]); // Pega o segundo número

					switch (partes[1]) {

					case "+":
						resultado = primeiro + segundo;
						break;

					case "-":
						resultado = primeiro - segundo;
						break;

					case "*":
						resultado = primeiro * segundo;
						break;

					case "/":
						if (segundo != 0) {
							resultado = primeiro / segundo;
						} else {
							display.setText("Erro: Divisão por zero");
							return;
						}
						break;
					}
					resposta = String.format("%.0f", resultado);
					display.setText(resposta);
				}
			}
		});

		// Lógica para o botão de limpar
		btn_Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
				primeiro = 0;
				segundo = 0;
			}
		});

		// Lógica para o botão de backspace
		btn_BackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = display.getText();
				if (!text.isEmpty()) {
					display.setText(text.substring(0, text.length() - 1));
				}

			}
		});

	}
}
