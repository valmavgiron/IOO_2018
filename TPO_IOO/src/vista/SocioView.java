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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import modelo.Abono.Tipo;

public class SocioView {

	public JFrame frmNuevoSocio;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDomicio;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtCodigo;
	private JTextField txtCertificado;
	private JTextField txtMedico;
	private JTextField txtObs;
	

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
		frmNuevoSocio.setBounds(100, 100, 553, 497);
		frmNuevoSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNuevoSocio.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		frmNuevoSocio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setBounds(119,54,180,28);
		
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
		
		txtDomicio = new JTextField();
		frmNuevoSocio.getContentPane().add(txtDomicio);
		txtDomicio.setBounds(119,136,180,28);
		
		txtTelefono = new JTextField();
		frmNuevoSocio.getContentPane().add(txtTelefono);
		txtTelefono.setBounds(119,177,180,28);
		
		JLabel lblEmail = new JLabel("Email");
		frmNuevoSocio.getContentPane().add(lblEmail);
		lblEmail.setBounds(19,218,120,28);
		
		txtEmail = new JTextField();
		frmNuevoSocio.getContentPane().add(txtEmail);
		txtEmail.setBounds(119,218,180,28);
		
		JButton btnAceptar = new JButton("Aceptar");
		frmNuevoSocio.getContentPane().add(btnAceptar);
		btnAceptar.setBounds(19,395,100,28);
		btnAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n = txtNombre.getText();
				String a = txtApellido.getText();
				String d = txtDomicio.getText();
				String t = txtTelefono.getText();
				String em = txtEmail.getText();

				String pattern = "dd/MM/yyyy";
		        String date = txtCertificado.getText();
		        Date fecha = null;
		        try {
		            DateFormat df = new SimpleDateFormat(pattern);
		            fecha = df.parse(date);
		            System.out.println("Today = " + df.format(fecha));
		        } catch (ParseException ie) {
		            ie.printStackTrace();
		        }

				String m = txtMedico.getText();
				String o = txtObs.getText();

				//SocioController socioN = new SocioController();
				Socio socios = new Socio(0, n, a, d, t, em,fecha,m,o);
				SocioVO socio = new SocioVO(socios);
				socios.agregarSocio(socio);
				
			}
			
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(253,395,100,28);
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
		txtCodigo.setBounds(119, 13, 180, 28);
		frmNuevoSocio.getContentPane().add(txtCodigo);
		txtCodigo.setEnabled(false);
		txtCodigo.setColumns(10);
		
		JLabel lblCert = new JLabel("Fecha Certificado");
		lblCert.setBounds(19, 265, 100, 16);
		frmNuevoSocio.getContentPane().add(lblCert);
		
		txtCertificado = new JTextField();
		txtCertificado.setBounds(119, 259, 180, 28);
		frmNuevoSocio.getContentPane().add(txtCertificado);
		txtCertificado.setColumns(10);
		
		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setBounds(19, 308, 56, 16);
		frmNuevoSocio.getContentPane().add(lblMedico);
		
		txtMedico = new JTextField();
		txtMedico.setBounds(119, 302, 180, 28);
		frmNuevoSocio.getContentPane().add(txtMedico);
		txtMedico.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setBounds(19, 353, 89, 16);
		frmNuevoSocio.getContentPane().add(lblObservaciones);
		
		txtObs = new JTextField();
		txtObs.setBounds(119, 347, 180, 28);
		frmNuevoSocio.getContentPane().add(txtObs);
		txtObs.setColumns(10);
		
		JLabel label = new JLabel("Id Codigo");
		label.setBounds(317, 13, 56, 28);
		frmNuevoSocio.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Tipo.values()));
		comboBox.setBounds(381, 17, 110, 20);
		frmNuevoSocio.getContentPane().add(comboBox);
	}
}
