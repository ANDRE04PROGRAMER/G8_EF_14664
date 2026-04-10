package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea txtS;
	private JButton btnBuscar;
	private JButton btnAdicionar;
	private JButton btnReportar;
	private JTextField txtUNO;
	private JTextField txtDOS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		getContentPane().setLayout(null);
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 108, 416, 171);
			getContentPane().add(txtS);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(132, 78, 84, 20);
			getContentPane().add(btnBuscar);
		}
		{
			btnAdicionar = new JButton("Adicionar");
			btnAdicionar.setBounds(132, 53, 84, 20);
			getContentPane().add(btnAdicionar);
		}
		{
			btnReportar = new JButton("Reportar");
			btnReportar.setBounds(132, 23, 84, 20);
			getContentPane().add(btnReportar);
		}
		{
			txtUNO = new JTextField();
			txtUNO.setBounds(26, 24, 96, 18);
			getContentPane().add(txtUNO);
			txtUNO.setColumns(10);
		}
		{
			txtDOS = new JTextField();
			txtDOS.setBounds(26, 54, 96, 18);
			getContentPane().add(txtDOS);
			txtDOS.setColumns(10);
		}

	}
}
