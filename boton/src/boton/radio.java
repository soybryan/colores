package boton;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class radio {

	private JFrame frmBotonRadio;
	private JLabel lblcolor;
	private JRadioButton radmorado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio window = new radio();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public radio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setTitle("BOTON RADIO");
		frmBotonRadio.setBounds(100, 100, 632, 348);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);
		frmBotonRadio.getContentPane().setLayout(null);
		
		lblcolor = new JLabel("");
		lblcolor.setOpaque(true);
		lblcolor.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblcolor.setBounds(330, 31, 252, 218);
		frmBotonRadio.getContentPane().add(lblcolor);
		
		JRadioButton radrojo = new JRadioButton("ROJO");
		radrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(Color.RED);
			}
		});
		radrojo.setFont(new Font("Tahoma", Font.BOLD, 14));
		radrojo.setBounds(36, 7, 109, 23);
		frmBotonRadio.getContentPane().add(radrojo);
		
		JRadioButton radverde = new JRadioButton("VERDE");
		radverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(Color.GREEN);
			}
		});
		radverde.setFont(new Font("Tahoma", Font.BOLD, 14));
		radverde.setBounds(36, 31, 109, 23);
		frmBotonRadio.getContentPane().add(radverde);
		
		JRadioButton radazul = new JRadioButton("AZUL");
		radazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(Color.BLUE);
			}
		});
		radazul.setFont(new Font("Tahoma", Font.BOLD, 14));
		radazul.setBounds(36, 57, 109, 23);
		
		
		radmorado = new JRadioButton("MORADO");
		radmorado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(new Color(87, 35, 100));
			}
		});
		radmorado.setFont(new Font("Tahoma", Font.BOLD, 14));
		radmorado.setBounds(36, 83, 109, 23);
		frmBotonRadio.getContentPane().add(radmorado);
		
		JRadioButton radRosa = new JRadioButton("ROSA");
		radRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(Color.pink);
	
			}
		});
		radRosa.setFont(new Font("Tahoma", Font.BOLD, 14));
		radRosa.setBounds(36, 109, 109, 23);
		frmBotonRadio.getContentPane().add(radRosa);
		
		JRadioButton radCafef = new JRadioButton("CAFE");
		radCafef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(new Color(161, 130, 98));
				

			}
		});
		radCafef.setFont(new Font("Tahoma", Font.BOLD, 14));
		radCafef.setBounds(36, 135, 109, 23);
		frmBotonRadio.getContentPane().add(radCafef);
		
		JRadioButton radnegro = new JRadioButton("NEGRO");
		radnegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcolor.setBackground(Color.BLACK);
				
			}
		});
		radnegro.setFont(new Font("Tahoma", Font.BOLD, 14));
		radnegro.setBounds(36, 161, 109, 23);
		frmBotonRadio.getContentPane().add(radnegro);
frmBotonRadio.getContentPane().add(radazul);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radazul);
		grupo.add(radrojo);
		grupo.add(radverde);
		grupo.add(radmorado);
	    grupo.add(radRosa);
		grupo.add(radCafef);
		grupo.add(radnegro);
	}
}
