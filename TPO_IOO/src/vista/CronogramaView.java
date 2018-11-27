package vista;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.ActividadVO;
import modelo.Actividad;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CronogramaView {

	public JFrame frmCronograma;
	private JTable table;

	/**
	 * Launch the application...
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CronogramaView window = new CronogramaView();
					window.frmCronograma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CronogramaView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCronograma = new JFrame();
		frmCronograma.setTitle("Cronograma");
		frmCronograma.setBounds(100, 100, 509, 489);
		frmCronograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCronograma.getContentPane().setLayout(null);
		
		ArrayList<Actividad> rows = new ArrayList<Actividad>();
		ActividadVO actividades = new ActividadVO();
		rows = actividades.listarActividades();
		Vector<Vector> rows2 = new Vector<Vector>();
		
		for(int i=0; i < rows.size(); i++){
			Vector<String> x = new Vector<String>();
			x.addElement(String.valueOf(rows.get(i).getTitulo()));
			x.addElement(String.valueOf(rows.get(i).getDia()));
			x.addElement(String.valueOf(rows.get(i).getHorario()));
			//x.addElement(String.valueOf(alum.get(i).getDni()));
			rows2.add(x);			
		}
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("Actividad");
		columnNames.add("Dia");
		columnNames.add("Hora");
	    //String data[][]={{"","",""},{"","",""}};
		table = new JTable(rows2,columnNames);
		/*table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", ""},
				{"", "", ""},
			},
			new String[] {
				"Actividad", "Dia", "Hora"
			}
		));*/
		table.setBackground(new Color(250, 242, 200));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setLocation(20,10);
		table.setSize(437, 373);
		table.setToolTipText("Cronograma");
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		table.setFillsViewportHeight(true);
		frmCronograma.getContentPane().add(table);
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCronograma.dispose();
			}
		});
		btnVolver.setBounds(360, 388, 97, 25);
		frmCronograma.getContentPane().add(btnVolver);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setForeground(Color.LIGHT_GRAY);
		scrollBar_1.setBounds(399, 13, 21, 271);
		frmCronograma.getContentPane().add(scrollBar_1);
	}
}
