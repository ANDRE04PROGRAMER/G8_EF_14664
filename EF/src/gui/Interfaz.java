package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloProducto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.crypto.AEADBadTagException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class Interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextArea txtS;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PRODUCTO");
			lblNewLabel.setBounds(10, 25, 56, 14);
			contentPane.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(89, 22, 86, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			btnNewButton = new JButton("REPORTAR");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 60, 111, 23);
			contentPane.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 105, 481, 170);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	ArregloProducto ae =new ArregloProducto();
	private JScrollPane scrollPane;
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		
	}
	void Listado() {
		Imprimir("Codigo\tNombre\tMarca\tCategoria\tStock\tPrecio Costo\tPrecio Venta");
		for (int i = 0;i<ae.Tamaño();i++) {
			Imprimir(""+ae.Obtener(i).getCodigo()+"\t"+ae.Obtener(i).getNombre()
					+"\t"+ae.Obtener(i).getMarca()+"\t"+ae.Obtener(i).getCategoria()
					+"\t"+ae.Obtener(i).getStock()+"\t"+ae.Obtener(i).getPrecioC()
					+"\t"+ae.Obtener(i).getPrecioV());
		}
	}
	
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
}
