package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.JMenu;

public class GimnasioMenu {

	private JFrame frmGimnasio;

	/**
	 * Launch the application...
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GimnasioMenu window = new GimnasioMenu();
					window.frmGimnasio.setVisible(true);
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
		frmGimnasio = new JFrame();
		frmGimnasio.setTitle("Gimnasio");
		frmGimnasio.setBounds(100, 100, 450, 300);
		frmGimnasio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGimnasio.setJMenuBar(menuBar);
		
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
		mntmAltaAct.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ActividadView actv = new ActividadView();
				actv.frmActividades.setVisible(true);
			}
		});
		
		
		JMenuItem mntmModAct = new JMenuItem("Modificacion Actividades");
		mnActividad.add(mntmModAct);
		
		JMenuItem mntmBajaAct = new JMenuItem("Baja Actividades");
		mnActividad.add(mntmBajaAct);
		
		JMenu mnCronograma = new JMenu("Cronograma");
		menuBar.add(mnCronograma);
		
		JMenu mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
				
		mnCronograma.addMenuListener(new MenuListener() {
			public void menuSelected(MenuEvent evt)
			{
				CronogramaView cv = new CronogramaView();
				cv.frmCronograma.setVisible(true);
			}

			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		}
				
		);

	}

}
