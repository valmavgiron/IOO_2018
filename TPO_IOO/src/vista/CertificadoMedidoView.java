package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CertificadoMedidoView {

	private JFrame frame;
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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblFechaCertificado = new JLabel("Fecha Certificado");
		springLayout.putConstraint(SpringLayout.NORTH, lblFechaCertificado, 58, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblFechaCertificado, 21, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblFechaCertificado);
		
		txtCert = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtCert, 0, SpringLayout.NORTH, lblFechaCertificado);
		springLayout.putConstraint(SpringLayout.WEST, txtCert, 33, SpringLayout.EAST, lblFechaCertificado);
		frame.getContentPane().add(txtCert);
		txtCert.setColumns(10);
		
		JLabel lblMedico = new JLabel("Medico");
		springLayout.putConstraint(SpringLayout.NORTH, lblMedico, 34, SpringLayout.SOUTH, lblFechaCertificado);
		springLayout.putConstraint(SpringLayout.WEST, lblMedico, 0, SpringLayout.WEST, lblFechaCertificado);
		frame.getContentPane().add(lblMedico);
		
		txtMedico = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtMedico, 0, SpringLayout.NORTH, lblMedico);
		springLayout.putConstraint(SpringLayout.EAST, txtMedico, 0, SpringLayout.EAST, txtCert);
		frame.getContentPane().add(txtMedico);
		txtMedico.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		springLayout.putConstraint(SpringLayout.NORTH, lblObservaciones, 37, SpringLayout.SOUTH, lblMedico);
		springLayout.putConstraint(SpringLayout.WEST, lblObservaciones, 0, SpringLayout.WEST, lblFechaCertificado);
		frame.getContentPane().add(lblObservaciones);
		
		txtObs = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtObs, 0, SpringLayout.WEST, txtCert);
		springLayout.putConstraint(SpringLayout.SOUTH, txtObs, 0, SpringLayout.SOUTH, lblObservaciones);
		frame.getContentPane().add(txtObs);
		txtObs.setColumns(10);
	}
}
