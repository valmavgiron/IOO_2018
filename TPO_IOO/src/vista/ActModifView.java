package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import modelo.Actividad;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ActModifView {

	public JFrame frmActividades;
	private JTextField txtTitulo;
	private JTextField txtDesc;
	private JTextField txtDia;
	private JTextField txtHora;
	private Actividad act;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActModifView window = new ActModifView();
					window.frmActividades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ActModifView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmActividades = new JFrame();
		frmActividades.setTitle("Actividades");
		frmActividades.setBounds(100, 100, 398, 438);
		frmActividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmActividades.getContentPane().setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		frmActividades.getContentPane().add(lblTtulo);
		lblTtulo.setBounds(21,72,63,28);
		lblTtulo.setVisible(false);
	
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		frmActividades.getContentPane().add(lblDescripcin);
		lblDescripcin.setBounds(21,126,63,28);
		lblDescripcin.setVisible(false);
				
		JLabel lblDia = new JLabel("Dia");
		frmActividades.getContentPane().add(lblDia);
		lblDia.setBounds(21,185,63,28);
		lblDia.setVisible(false);
		
		JLabel lblHora = new JLabel("Hora");
		frmActividades.getContentPane().add(lblHora);
		lblHora.setBounds(21,242,63,28);
		lblHora.setVisible(false);
		
		txtTitulo = new JTextField();
		frmActividades.getContentPane().add(txtTitulo);
		txtTitulo.setBounds(119,72,210,28);
		txtTitulo.setVisible(false);
		
		txtDesc = new JTextField();
		frmActividades.getContentPane().add(txtDesc);
		txtDesc.setBounds(119,126,210,28);
		txtDesc.setVisible(false);
		
		txtDia = new JTextField();
		frmActividades.getContentPane().add(txtDia);
		txtDia.setBounds(119,185,210,28);
		txtDia.setVisible(false);
		
		txtHora = new JTextField();
		frmActividades.getContentPane().add(txtHora);
		txtHora.setBounds(119,242,210,28);
		txtHora.setVisible(false);
		
		JButton btnAceptar = new JButton("Aceptar");
		frmActividades.getContentPane().add(btnAceptar);
		btnAceptar.setBounds(21, 295, 90, 28);
		btnAceptar.setVisible(false);
		
		JButton btnCancelar = new JButton("Cancelar");
		frmActividades.getContentPane().add(btnCancelar);
		btnCancelar.setBounds(239, 295, 90, 28);
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frmActividades.dispose();
			}
			
		});
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(21, 23, 63, 28);
		frmActividades.getContentPane().add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(119, 20, 140, 28);
		frmActividades.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(271, 20, 90, 28);
		frmActividades.getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				lblTtulo.setVisible(true);
				lblDescripcin.setVisible(true);
				lblDia.setVisible(true);
				lblHora.setVisible(true);
				txtTitulo.setVisible(true);
				txtDesc.setVisible(true);
				txtDia.setVisible(true);
				txtHora.setVisible(true);
				btnAceptar.setVisible(true);
			}
			
		});
		
	}
}
