package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CertificadoMedidoView {

	private JFrame frmCertificadoMedico;
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
					CertificadoMedidoView window = new CertificadoMedidoView();
					window.frmCertificadoMedico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CertificadoMedidoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCertificadoMedico = new JFrame();
		frmCertificadoMedico.setTitle("Certificado Medico");
		frmCertificadoMedico.setBounds(100, 100, 343, 300);
		frmCertificadoMedico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmCertificadoMedico.getContentPane().setLayout(springLayout);
		
		JLabel lblFechaCertificado = new JLabel("Fecha Certificado");
		springLayout.putConstraint(SpringLayout.NORTH, lblFechaCertificado, 58, SpringLayout.NORTH, frmCertificadoMedico.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblFechaCertificado, 21, SpringLayout.WEST, frmCertificadoMedico.getContentPane());
		frmCertificadoMedico.getContentPane().add(lblFechaCertificado);
		
		txtCert = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtCert, 0, SpringLayout.NORTH, lblFechaCertificado);
		springLayout.putConstraint(SpringLayout.WEST, txtCert, 33, SpringLayout.EAST, lblFechaCertificado);
		frmCertificadoMedico.getContentPane().add(txtCert);
		txtCert.setColumns(10);
		
		JLabel lblMedico = new JLabel("Medico");
		springLayout.putConstraint(SpringLayout.NORTH, lblMedico, 34, SpringLayout.SOUTH, lblFechaCertificado);
		springLayout.putConstraint(SpringLayout.WEST, lblMedico, 0, SpringLayout.WEST, lblFechaCertificado);
		frmCertificadoMedico.getContentPane().add(lblMedico);
		
		txtMedico = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtMedico, 0, SpringLayout.NORTH, lblMedico);
		springLayout.putConstraint(SpringLayout.EAST, txtMedico, 0, SpringLayout.EAST, txtCert);
		frmCertificadoMedico.getContentPane().add(txtMedico);
		txtMedico.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		springLayout.putConstraint(SpringLayout.NORTH, lblObservaciones, 37, SpringLayout.SOUTH, lblMedico);
		springLayout.putConstraint(SpringLayout.WEST, lblObservaciones, 0, SpringLayout.WEST, lblFechaCertificado);
		frmCertificadoMedico.getContentPane().add(lblObservaciones);
		
		txtObs = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtObs, 0, SpringLayout.WEST, txtCert);
		springLayout.putConstraint(SpringLayout.SOUTH, txtObs, 0, SpringLayout.SOUTH, lblObservaciones);
		frmCertificadoMedico.getContentPane().add(txtObs);
		txtObs.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.WEST, btnAceptar, 0, SpringLayout.WEST, lblFechaCertificado);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAceptar, -29, SpringLayout.SOUTH, frmCertificadoMedico.getContentPane());
		frmCertificadoMedico.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnAceptar);
		springLayout.putConstraint(SpringLayout.WEST, btnCancelar, 60, SpringLayout.EAST, btnAceptar);
		frmCertificadoMedico.getContentPane().add(btnCancelar);
	}
}
