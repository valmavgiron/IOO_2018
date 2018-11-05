package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SocioView {

	private JFrame frmNuevoSocio;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDomicio;
	private JTextField txtTelefono;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SocioView window = new SocioView();
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
	public SocioView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevoSocio = new JFrame();
		frmNuevoSocio.setTitle("Nuevo Socio");
		frmNuevoSocio.setBounds(100, 100, 505, 446);
		frmNuevoSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmNuevoSocio.getContentPane().setLayout(springLayout);
		
		txtNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 27, SpringLayout.NORTH, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 141, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		frmNuevoSocio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombre, 30, SpringLayout.NORTH, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		frmNuevoSocio.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		springLayout.putConstraint(SpringLayout.NORTH, lblApellido, 24, SpringLayout.SOUTH, lblNombre);
		frmNuevoSocio.getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		frmNuevoSocio.getContentPane().add(lblTelefono);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		springLayout.putConstraint(SpringLayout.NORTH, lblTelefono, 22, SpringLayout.SOUTH, lblDomicilio);
		springLayout.putConstraint(SpringLayout.NORTH, lblDomicilio, 24, SpringLayout.SOUTH, lblApellido);
		frmNuevoSocio.getContentPane().add(lblDomicilio);
		
		txtApellido = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtApellido, 21, SpringLayout.SOUTH, txtNombre);
		frmNuevoSocio.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDomicio = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtDomicio, 15, SpringLayout.SOUTH, txtApellido);
		frmNuevoSocio.getContentPane().add(txtDomicio);
		txtDomicio.setColumns(10);
		
		txtTelefono = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTelefono, 19, SpringLayout.SOUTH, txtDomicio);
		frmNuevoSocio.getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmail, 24, SpringLayout.SOUTH, lblTelefono);
		springLayout.putConstraint(SpringLayout.WEST, lblApellido, 0, SpringLayout.WEST, lblEmail);
		springLayout.putConstraint(SpringLayout.WEST, lblDomicilio, 0, SpringLayout.WEST, lblEmail);
		springLayout.putConstraint(SpringLayout.WEST, lblTelefono, 0, SpringLayout.WEST, lblEmail);
		springLayout.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblNombre);
		frmNuevoSocio.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtApellido, 0, SpringLayout.WEST, txtEmail);
		springLayout.putConstraint(SpringLayout.WEST, txtDomicio, 0, SpringLayout.WEST, txtEmail);
		springLayout.putConstraint(SpringLayout.WEST, txtTelefono, 0, SpringLayout.WEST, txtEmail);
		springLayout.putConstraint(SpringLayout.NORTH, txtEmail, 15, SpringLayout.SOUTH, txtTelefono);
		springLayout.putConstraint(SpringLayout.WEST, txtEmail, 0, SpringLayout.WEST, txtNombre);
		frmNuevoSocio.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.WEST, btnAceptar, 10, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAceptar, -61, SpringLayout.SOUTH, frmNuevoSocio.getContentPane());
		frmNuevoSocio.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnAceptar);
		frmNuevoSocio.getContentPane().add(btnCancelar);
		
		JButton btnAgregaCert = new JButton("Agregar CM");
		springLayout.putConstraint(SpringLayout.WEST, btnCancelar, 48, SpringLayout.EAST, btnAgregaCert);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAgregaCert, -61, SpringLayout.SOUTH, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnAgregaCert, 0, SpringLayout.WEST, txtNombre);
		btnAgregaCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmNuevoSocio.getContentPane().add(btnAgregaCert);
	}
}
