package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controlador.SocioController;
import controlador.SocioVO;
import modelo.Socio;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifSocioView {

	public JFrame frmNuevoSocio;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDomicio;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtCodigo;
	private JTextField txtCert;
	private JTextField txtMedico;
	private JTextField txtObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifSocioView window = new ModifSocioView();
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
	public ModifSocioView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevoSocio = new JFrame();
		frmNuevoSocio.setTitle("Modificar Socio");
		frmNuevoSocio.setBounds(100, 100, 435, 503);
		frmNuevoSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuevoSocio.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		frmNuevoSocio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setBounds(119,54,180,28);
		txtNombre.setVisible(false);
		
		JLabel lblNombre = new JLabel("Nombre");
		frmNuevoSocio.getContentPane().add(lblNombre);
		lblNombre.setBounds(19,54,120,28);
		lblNombre.setVisible(false);
		
		JLabel lblApellido = new JLabel("Apellido");
		frmNuevoSocio.getContentPane().add(lblApellido);
		lblApellido.setBounds(19,95,120,28);
		lblApellido.setVisible(false);
		
		JLabel lblTelefono = new JLabel("Telefono");
		frmNuevoSocio.getContentPane().add(lblTelefono);
		lblTelefono.setBounds(19,177,120,28);
		lblTelefono.setVisible(false);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		frmNuevoSocio.getContentPane().add(lblDomicilio);
		lblDomicilio.setBounds(19,136,120,28);
		lblDomicilio.setVisible(false);
		
		txtApellido = new JTextField();
		frmNuevoSocio.getContentPane().add(txtApellido);
		txtApellido.setBounds(119,95,180,28);
		txtApellido.setVisible(false);
		
		txtDomicio = new JTextField();
		frmNuevoSocio.getContentPane().add(txtDomicio);
		txtDomicio.setBounds(119,136,180,28);
		txtDomicio.setVisible(false);
		
		txtTelefono = new JTextField();
		frmNuevoSocio.getContentPane().add(txtTelefono);
		txtTelefono.setBounds(119,177,180,28);
		txtTelefono.setVisible(false);
		
		JLabel lblEmail = new JLabel("Email");
		frmNuevoSocio.getContentPane().add(lblEmail);
		lblEmail.setBounds(19,218,120,28);
		lblEmail.setVisible(false);
		
		txtEmail = new JTextField();
		frmNuevoSocio.getContentPane().add(txtEmail);
		txtEmail.setBounds(119,218,180,28);
		txtEmail.setVisible(false);
		
		JButton btnAceptar = new JButton("Aceptar");
		frmNuevoSocio.getContentPane().add(btnAceptar);
		btnAceptar.setBounds(19,398,100,28);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(259,398,100,28);
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
		
		JLabel lblFechaCertificado = new JLabel("Fecha Certificado");
		lblFechaCertificado.setBounds(19, 265, 100, 16);
		frmNuevoSocio.getContentPane().add(lblFechaCertificado);
		lblFechaCertificado.setVisible(false);
		
		txtCert = new JTextField();
		txtCert.setBounds(119, 259, 180, 28);
		frmNuevoSocio.getContentPane().add(txtCert);
		txtCert.setVisible(false);
		
		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setBounds(19, 304, 56, 16);
		frmNuevoSocio.getContentPane().add(lblMedico);
		lblMedico.setVisible(false);
		
		txtMedico = new JTextField();
		txtMedico.setBounds(119, 301, 180, 28);
		frmNuevoSocio.getContentPane().add(txtMedico);
		txtMedico.setColumns(10);
		txtMedico.setVisible(false);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setBounds(19, 349, 100, 16);
		frmNuevoSocio.getContentPane().add(lblObservaciones);
		lblObservaciones.setVisible(false);
		
		txtObs = new JTextField();
		txtObs.setBounds(119, 346, 180, 28);
		frmNuevoSocio.getContentPane().add(txtObs);
		txtObs.setColumns(10);
		txtObs.setVisible(false);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SocioController socio = new SocioController();
				Socio socios = socio.buscarSocio(txtCodigo.getText());
				if (socio != null){
					txtNombre.setVisible(true);
					lblNombre.setVisible(true);
					txtApellido.setVisible(true);
					lblApellido.setVisible(true);
					txtTelefono.setVisible(true);
					lblTelefono.setVisible(true);
					txtDomicio.setVisible(true);
					lblDomicilio.setVisible(true);
					txtEmail.setVisible(true);
					lblEmail.setVisible(true);
					txtCert.setVisible(true);
					lblFechaCertificado.setVisible(true);
					txtMedico.setVisible(true);
					lblMedico.setVisible(true);
					txtObs.setVisible(true);
					lblObservaciones.setVisible(true);
					txtNombre.setText(socios.getNonbre());
					txtApellido.setText(socios.getApellido());
					txtDomicio.setText(socios.getDomicilio());
				}
				
			}
		});
		btnBuscar.setBounds(281, 15, 97, 25);
		frmNuevoSocio.getContentPane().add(btnBuscar);
	
	
	}
	
}
