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
	private JTextField txtIdSocio;

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
		frmNuevoSocio.setBounds(100, 100, 450, 403);
		frmNuevoSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmNuevoSocio.getContentPane().setLayout(springLayout);
		
		txtNombre = new JTextField();
		frmNuevoSocio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		springLayout.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, -3, SpringLayout.NORTH, lblNombre);
		frmNuevoSocio.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombre, -25, SpringLayout.NORTH, lblApellido);
		springLayout.putConstraint(SpringLayout.WEST, lblApellido, 0, SpringLayout.WEST, lblNombre);
		frmNuevoSocio.getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		springLayout.putConstraint(SpringLayout.WEST, lblTelefono, 5, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		frmNuevoSocio.getContentPane().add(lblTelefono);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		springLayout.putConstraint(SpringLayout.WEST, lblDomicilio, 7, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblDomicilio, -22, SpringLayout.NORTH, lblTelefono);
		frmNuevoSocio.getContentPane().add(lblDomicilio);
		
		txtApellido = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtApellido, 94, SpringLayout.EAST, lblApellido);
		springLayout.putConstraint(SpringLayout.NORTH, lblApellido, 3, SpringLayout.NORTH, txtApellido);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 0, SpringLayout.WEST, txtApellido);
		frmNuevoSocio.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDomicio = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtApellido, -17, SpringLayout.NORTH, txtDomicio);
		springLayout.putConstraint(SpringLayout.NORTH, txtDomicio, -3, SpringLayout.NORTH, lblDomicilio);
		springLayout.putConstraint(SpringLayout.WEST, txtDomicio, 94, SpringLayout.EAST, lblDomicilio);
		frmNuevoSocio.getContentPane().add(txtDomicio);
		txtDomicio.setColumns(10);
		
		txtTelefono = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtTelefono, -3, SpringLayout.NORTH, lblTelefono);
		springLayout.putConstraint(SpringLayout.WEST, txtTelefono, 94, SpringLayout.EAST, lblTelefono);
		frmNuevoSocio.getContentPane().add(txtTelefono);
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		springLayout.putConstraint(SpringLayout.WEST, lblEmail, 10, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblTelefono, -20, SpringLayout.NORTH, lblEmail);
		frmNuevoSocio.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEmail, -3, SpringLayout.NORTH, lblEmail);
		springLayout.putConstraint(SpringLayout.WEST, txtEmail, 107, SpringLayout.EAST, lblEmail);
		frmNuevoSocio.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.SOUTH, lblEmail, -50, SpringLayout.NORTH, btnAceptar);
		springLayout.putConstraint(SpringLayout.WEST, btnAceptar, 10, SpringLayout.WEST, frmNuevoSocio.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAceptar, -61, SpringLayout.SOUTH, frmNuevoSocio.getContentPane());
		frmNuevoSocio.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnAceptar);
		frmNuevoSocio.getContentPane().add(btnCancelar);
		
		JButton btnAgregaCert = new JButton("Agregar CM");
		springLayout.putConstraint(SpringLayout.WEST, btnCancelar, 92, SpringLayout.EAST, btnAgregaCert);
		springLayout.putConstraint(SpringLayout.NORTH, btnAgregaCert, 0, SpringLayout.NORTH, btnAceptar);
		springLayout.putConstraint(SpringLayout.WEST, btnAgregaCert, 16, SpringLayout.EAST, btnAceptar);
		btnAgregaCert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmNuevoSocio.getContentPane().add(btnAgregaCert);
		
		JLabel lblIdSocio = new JLabel("Id Socio");
		springLayout.putConstraint(SpringLayout.SOUTH, lblIdSocio, -18, SpringLayout.NORTH, lblNombre);
		springLayout.putConstraint(SpringLayout.EAST, lblIdSocio, 0, SpringLayout.EAST, lblNombre);
		frmNuevoSocio.getContentPane().add(lblIdSocio);
		
		txtIdSocio = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtIdSocio, -3, SpringLayout.NORTH, lblIdSocio);
		springLayout.putConstraint(SpringLayout.WEST, txtIdSocio, 0, SpringLayout.WEST, txtNombre);
		frmNuevoSocio.getContentPane().add(txtIdSocio);
		txtIdSocio.setColumns(10);
	}
}
