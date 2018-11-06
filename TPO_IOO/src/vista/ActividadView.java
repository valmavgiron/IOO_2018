package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActividadView {

	private JFrame frmActividades;
	private JTextField txtCodAct;
	private JTextField txtTitulo;
	private JTextField txtDesc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActividadView window = new ActividadView();
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
	public ActividadView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmActividades = new JFrame();
		frmActividades.setTitle("Actividades");
		frmActividades.setBounds(100, 100, 437, 355);
		frmActividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmActividades.getContentPane().setLayout(springLayout);
		
		JLabel lblCodigo = new JLabel("Codigo");
		springLayout.putConstraint(SpringLayout.NORTH, lblCodigo, 44, SpringLayout.NORTH, frmActividades.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblCodigo, 10, SpringLayout.WEST, frmActividades.getContentPane());
		frmActividades.getContentPane().add(lblCodigo);
		
		txtCodAct = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtCodAct, 0, SpringLayout.NORTH, lblCodigo);
		springLayout.putConstraint(SpringLayout.WEST, txtCodAct, 60, SpringLayout.EAST, lblCodigo);
		frmActividades.getContentPane().add(txtCodAct);
		txtCodAct.setColumns(10);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		springLayout.putConstraint(SpringLayout.NORTH, lblTtulo, 31, SpringLayout.SOUTH, lblCodigo);
		springLayout.putConstraint(SpringLayout.WEST, lblTtulo, 0, SpringLayout.WEST, lblCodigo);
		frmActividades.getContentPane().add(lblTtulo);
		
		txtTitulo = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtTitulo, 0, SpringLayout.SOUTH, lblTtulo);
		springLayout.putConstraint(SpringLayout.EAST, txtTitulo, 0, SpringLayout.EAST, txtCodAct);
		frmActividades.getContentPane().add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		springLayout.putConstraint(SpringLayout.NORTH, lblDescripcin, 26, SpringLayout.SOUTH, lblTtulo);
		springLayout.putConstraint(SpringLayout.WEST, lblDescripcin, 0, SpringLayout.WEST, lblCodigo);
		frmActividades.getContentPane().add(lblDescripcin);
		
		txtDesc = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtDesc, 0, SpringLayout.SOUTH, lblDescripcin);
		springLayout.putConstraint(SpringLayout.EAST, txtDesc, 0, SpringLayout.EAST, txtCodAct);
		frmActividades.getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
	}

}
