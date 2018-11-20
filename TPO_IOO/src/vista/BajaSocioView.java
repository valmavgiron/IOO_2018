package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BajaSocioView {

	public JFrame frmNuevoSocio;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDomicio;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BajaSocioView window = new BajaSocioView();
					window.frmNuevoSocio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BajaSocioView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevoSocio = new JFrame();
		frmNuevoSocio.setTitle("Nuevo Socio");
		frmNuevoSocio.setBounds(100, 100, 435, 444);
		frmNuevoSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuevoSocio.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		frmNuevoSocio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setBounds(119,54,180,28);
		txtNombre.setEnabled(false);
		
		JLabel lblNombre = new JLabel("Nombre");
		frmNuevoSocio.getContentPane().add(lblNombre);
		lblNombre.setBounds(19,54,120,28);
				
		JLabel lblApellido = new JLabel("Apellido");
		frmNuevoSocio.getContentPane().add(lblApellido);
		lblApellido.setBounds(19,95,120,28);
				
		JLabel lblTelefono = new JLabel("Telefono");
		frmNuevoSocio.getContentPane().add(lblTelefono);
		lblTelefono.setBounds(19,177,120,28);
				
		JLabel lblDomicilio = new JLabel("Domicilio");
		frmNuevoSocio.getContentPane().add(lblDomicilio);
		lblDomicilio.setBounds(19,136,120,28);
				
		txtApellido = new JTextField();
		frmNuevoSocio.getContentPane().add(txtApellido);
		txtApellido.setBounds(119,95,180,28);
		txtApellido.setEnabled(false);
		
		txtDomicio = new JTextField();
		frmNuevoSocio.getContentPane().add(txtDomicio);
		txtDomicio.setBounds(119,136,180,28);
		txtDomicio.setEnabled(false);
		
		txtTelefono = new JTextField();
		frmNuevoSocio.getContentPane().add(txtTelefono);
		txtTelefono.setBounds(119,177,180,28);
		txtTelefono.setEnabled(false);
		
		JLabel lblEmail = new JLabel("Email");
		frmNuevoSocio.getContentPane().add(lblEmail);
		lblEmail.setBounds(19,218,120,28);
				
		txtEmail = new JTextField();
		frmNuevoSocio.getContentPane().add(txtEmail);
		txtEmail.setBounds(119,218,180,28);
		txtEmail.setEnabled(false);
		
		JButton btnAceptar = new JButton("Aceptar");
		frmNuevoSocio.getContentPane().add(btnAceptar);
		btnAceptar.setBounds(19,310,100,28);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(259,324,100,28);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNuevoSocio.dispose();
			}
		});
		frmNuevoSocio.getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Id Codigo");
		lblNewLabel.setBounds(19, 13, 56, 28);
		frmNuevoSocio.getContentPane().add(lblNewLabel);
				
		txtCodigo = new JTextField();
		txtCodigo.setBounds(119, 13, 150, 28);
		frmNuevoSocio.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(281, 15, 97, 25);
		frmNuevoSocio.getContentPane().add(btnBuscar);
	}
}
