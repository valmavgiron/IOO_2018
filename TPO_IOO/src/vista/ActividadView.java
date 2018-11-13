package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import modelo.Actividad;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ActividadView {

	public JFrame frmActividades;
	private JTextField txtCodAct;
	private JTextField txtTitulo;
	private JTextField txtDesc;
	private JTextField txtDia;
	private JTextField txtHora;
	private Actividad act;

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
		frmActividades.setBounds(100, 100, 310, 361);
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
		
		JLabel lblDia = new JLabel("Dia");
		springLayout.putConstraint(SpringLayout.NORTH, lblDia, 22, SpringLayout.SOUTH, lblDescripcin);
		springLayout.putConstraint(SpringLayout.WEST, lblDia, 0, SpringLayout.WEST, lblCodigo);
		frmActividades.getContentPane().add(lblDia);
		
		txtDia = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtDia, -3, SpringLayout.NORTH, lblDia);
		springLayout.putConstraint(SpringLayout.WEST, txtDia, 0, SpringLayout.WEST, txtCodAct);
		frmActividades.getContentPane().add(txtDia);
		txtDia.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora");
		springLayout.putConstraint(SpringLayout.NORTH, lblHora, 204, SpringLayout.NORTH, frmActividades.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblHora, 0, SpringLayout.WEST, lblCodigo);
		frmActividades.getContentPane().add(lblHora);
		
		txtHora = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtHora, 0, SpringLayout.WEST, txtCodAct);
		springLayout.putConstraint(SpringLayout.SOUTH, txtHora, 0, SpringLayout.SOUTH, lblHora);
		frmActividades.getContentPane().add(txtHora);
		txtHora.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		springLayout.putConstraint(SpringLayout.NORTH, btnAceptar, 27, SpringLayout.SOUTH, lblHora);
		springLayout.putConstraint(SpringLayout.WEST, btnAceptar, 10, SpringLayout.WEST, frmActividades.getContentPane());
		frmActividades.getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		springLayout.putConstraint(SpringLayout.WEST, btnCancelar, 69, SpringLayout.EAST, btnAceptar);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCancelar, 0, SpringLayout.SOUTH, btnAceptar);
		frmActividades.getContentPane().add(btnCancelar);
		
		JButton btnBuscar = new JButton("Buscar");
		springLayout.putConstraint(SpringLayout.NORTH, btnBuscar, -4, SpringLayout.NORTH, lblCodigo);
		springLayout.putConstraint(SpringLayout.WEST, btnBuscar, 18, SpringLayout.EAST, txtCodAct);
		frmActividades.getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				act = act.buscarActividad(txtCodAct.getText()); 
				
			}
			
		});
	}
}
