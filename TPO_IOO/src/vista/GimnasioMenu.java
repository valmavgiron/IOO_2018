package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class GimnasioMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GimnasioMenu window = new GimnasioMenu();
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
	public GimnasioMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnSocio = new JMenu("Socio");
		menuBar.add(mnSocio);
		
		JMenuItem mntmAltaSocio = new JMenuItem("Alta Socio");
		mnSocio.add(mntmAltaSocio);
		
		JMenuItem mntmModificacion = new JMenuItem("Modificacion");
		mnSocio.add(mntmModificacion);
		
		JMenuItem mntmBajaSocio = new JMenuItem("Baja Socio");
		mnSocio.add(mntmBajaSocio);
		
		JMenu mnActividad = new JMenu("Actividades");
		menuBar.add(mnActividad);
		
		JMenuItem mntmAltaAct = new JMenuItem("Alta Actividades");
		mnActividad.add(mntmAltaAct);
		
		JMenuItem mntmModAct = new JMenuItem("Modificacion Actividades");
		mnActividad.add(mntmModAct);
		
		JMenuItem mntmBajaAct = new JMenuItem("Baja Actividades");
		mnActividad.add(mntmBajaAct);
		
		JMenuItem mntmCronograma = new JMenuItem("Cronograma");
		menuBar.add(mntmCronograma);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		menuBar.add(mntmSalir);
	}

}
