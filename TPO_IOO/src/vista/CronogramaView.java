package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;

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
		frmCronograma.setBounds(100, 100, 466, 398);
		frmCronograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCronograma.getContentPane().setLayout(null);
		
		String[] columnNames = {"Actividad", "Dia", "Hora"};
	    String data[][]={{"","",""},{"","",""}};
		table = new JTable(data,columnNames);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", ""},
				{"", "", ""},
			},
			new String[] {
				"Actividad", "Dia", "Hora"
			}
		));
		//table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setLocation(20,10);
		table.setSize(400, 200);
		table.setToolTipText("Cronograma");
		//table.setFillsViewportHeight(true);
		frmCronograma.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(30, 223, 97, 25);
		frmCronograma.getContentPane().add(btnNewButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(299, 10, 21, 200);
		frmCronograma.getContentPane().add(scrollBar);
	}
}
