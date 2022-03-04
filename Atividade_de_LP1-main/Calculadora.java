package calcu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfcalcu extends JFrame {

	private JPanel contentPane;
	private JTextField txtvalor1;
	private JTextField txtvalor2;
	private JTextField txttotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfcalcu frame = new interfcalcu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfcalcu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblvalor1 = new JLabel("Primeiro Valor:");
		lblvalor1.setFont(new Font("Swis721 Cn BT", Font.PLAIN, 20));
		lblvalor1.setBounds(10, 11, 149, 43);
		contentPane.add(lblvalor1);
		
		JLabel lblvalor2 = new JLabel("Segundo Valor:");
		lblvalor2.setFont(new Font("Swis721 Cn BT", Font.PLAIN, 20));
		lblvalor2.setBounds(10, 65, 149, 43);
		contentPane.add(lblvalor2);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Swis721 Cn BT", Font.PLAIN, 20));
		lblTotal.setBounds(10, 119, 149, 43);
		contentPane.add(lblTotal);
		
		txtvalor1 = new JTextField();
		txtvalor1.setBounds(156, 19, 109, 35);
		contentPane.add(txtvalor1);
		txtvalor1.setColumns(10);
		
		txtvalor2 = new JTextField();
		txtvalor2.setColumns(10);
		txtvalor2.setBounds(156, 65, 109, 35);
		contentPane.add(txtvalor2);
		
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(80, 119, 109, 35);
		contentPane.add(txttotal);
		
		JButton btnsomar = new JButton("+");
		btnsomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botao somar +
				double n1, n2, total;
				
				//recebendo os dados dos campos de texto
				n1 = Double.parseDouble(txtvalor1.getText());
				n2 = Double.parseDouble(txtvalor2.getText());
				
				//calcular o total
				total = n1 + n2;
				
				//colocar o total na caixa de saída de resultado
				txttotal.setText(String.valueOf(total));
				
				
				
			}
		});
		btnsomar.setBounds(310, 15, 102, 35);
		contentPane.add(btnsomar);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botao subtrair
				double n1, n2, total;
				
				//recebendo os dados dos campos de texto
				n1 = Double.parseDouble(txtvalor1.getText());
				n2 = Double.parseDouble(txtvalor2.getText());
				
				//calcular o total
				total = n1 - n2;
				
				//colocar o total na caixa de saída de resultado
				txttotal.setText(String.valueOf(total));
			}
		});
		btnsub.setBounds(310, 61, 102, 35);
		contentPane.add(btnsub);
		
		JButton btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botao multiplicar
				double n1, n2, total;
				
				//recebendo os dados dos campos de texto
				n1 = Double.parseDouble(txtvalor1.getText());
				n2 = Double.parseDouble(txtvalor2.getText());
				
				//calcular o total
				total = n1 * n2;
				
				//colocar o total na caixa de saída de resultado
				txttotal.setText(String.valueOf(total));
			}
		});
		btnmulti.setBounds(310, 107, 102, 35);
		contentPane.add(btnmulti);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//botao dividir
				double n1, n2, total;
				
				//recebendo os dados dos campos de texto
				n1 = Double.parseDouble(txtvalor1.getText());
				n2 = Double.parseDouble(txtvalor2.getText());
				
				//calcular o total
				total = n1 / n2;
				
				//colocar o total na caixa de saída de resultado
				txttotal.setText(String.valueOf(total));
			}
		});
		btndiv.setBounds(310, 153, 102, 35);
		contentPane.add(btndiv);
		
		JButton btnsair = new JButton("Sair");
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botao sair
				System.exit(0);
			}
		});
		btnsair.setBounds(0, 184, 89, 23);
		contentPane.add(btnsair);
	}
}
