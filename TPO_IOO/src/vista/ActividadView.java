package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.JFrame;
import modelo.Actividad;

import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ActividadVO;
import controlador.SocioVO;
import javafx.scene.control.ComboBox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import modelo.*;
public class ActividadView {

	public JFrame frmActividades;
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
		//llenarCombo();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmActividades = new JFrame();
		frmActividades.setTitle("Actividades");
		frmActividades.setBounds(100, 100, 398, 438);
		frmActividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmActividades.getContentPane().setLayout(null);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo");
		frmActividades.getContentPane().add(lblTtulo);
		lblTtulo.setBounds(21,72,63,28);
	
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		frmActividades.getContentPane().add(lblDescripcin);
		lblDescripcin.setBounds(21,126,63,28);
		
		JLabel lblDia = new JLabel("Dia");
		frmActividades.getContentPane().add(lblDia);
		lblDia.setBounds(21,185,63,28);
		
		JLabel lblHora = new JLabel("Hora");
		frmActividades.getContentPane().add(lblHora);
		lblHora.setBounds(21,242,63,28);
		
		txtTitulo = new JTextField();
		frmActividades.getContentPane().add(txtTitulo);
		txtTitulo.setBounds(119,72,210,28);
		
		txtDesc = new JTextField();
		frmActividades.getContentPane().add(txtDesc);
		txtDesc.setBounds(119,126,210,28);
				
		txtDia = new JTextField();
		frmActividades.getContentPane().add(txtDia);
		txtDia.setBounds(119,185,210,28);
		
		txtHora = new JTextField();
		frmActividades.getContentPane().add(txtHora);
		txtHora.setBounds(119,242,210,28);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = txtTitulo.getText();
				String d = txtDesc.getText();
				String dia = txtDia.getText();
				String hora = txtHora.getText();
				
				Actividad act = new Actividad(0,t,d,dia,hora);
				ActividadVO actividad = new ActividadVO(act);
				act.crearActividad(actividad);
			}
		});
		frmActividades.getContentPane().add(btnAceptar);
		btnAceptar.setBounds(21, 295, 90, 28);
		
		JButton btnCancelar = new JButton("Cancelar");
		frmActividades.getContentPane().add(btnCancelar);
		btnCancelar.setBounds(239, 295, 90, 28);
		//
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(119, 28, 210, 20);
		Actividad act = new Actividad();
		ArrayList<Actividad> acts=new ArrayList<Actividad>();
		Enumeration<Actividad> e=Collections.enumeration(act.getActividades());
		while (e.hasMoreElements()) {
			Actividad x=e.nextElement();
			comboBox.addItem(x.getDescripcion()+"|"+x.getHorario());
		}
		//
		frmActividades.getContentPane().add(comboBox);
		btnCancelar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frmActividades.dispose();
			}
			
		});
	}

}


