package sas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sas frame = new sas();
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
	public sas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese Nombre de usuario xd");
		lblNewLabel.setBounds(21, 24, 175, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota1");
		lblNewLabel_1.setBounds(10, 111, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2");
		lblNewLabel_2.setBounds(150, 111, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(48, 108, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 108, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3");
		lblNewLabel_3.setBounds(291, 111, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre xd");
		lblNewLabel_4.setBounds(21, 176, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Resultados xd");
		lblNewLabel_5.setBounds(21, 218, 113, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Resultado xd");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			int d,d2,d3;
			  double r;
			   d=Integer.parseInt(textField.getText());
			    d2=Integer.parseInt(textField.getText());
			      d3=Integer.parseInt(textField.getText());
			      r=(d+d2+d3)/3; 
			
			       if(r>=6)
			       {
			JOptionPane.showMessageDialog(null,"Ay perro, Aprobaste xd");
			
			       }
			       else if(r<=5)
			       {
			    	   JOptionPane.showMessageDialog(null,"Reprobaste POR BOT XD");
			
			       }
			       
			       textField_4.setText(String.valueOf(r));
			       lblNewLabel_5.setText( (String.valueOf(textField.getText())));
			       
			}
		});
		btnNewButton.setBounds(294, 214, 113, 23);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 21, 183, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 215, 138, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Salir xd");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(291, 172, 116, 23);
		contentPane.add(btnNewButton_1);
	}
}
