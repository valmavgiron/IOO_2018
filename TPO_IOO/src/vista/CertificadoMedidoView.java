package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CertificadoMedidoView {

	private JFrame frame;
	private JTextField txtCert;

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
	}

}
