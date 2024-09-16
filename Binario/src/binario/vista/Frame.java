package binario.vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public void run() {
		try {
			Frame frame = new Frame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Frame() {
		setBackground(new Color(64, 128, 128));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 535);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(64, 128, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JLabel lblEquipoLocal = new JLabel("EQUIPO LOCAL ");
		lblEquipoLocal.setForeground(new Color(255, 255, 255));
		lblEquipoLocal.setBackground(new Color(255, 255, 255));
		lblEquipoLocal.setBounds(21, 25, 128, 14);
		contentPanel.add(lblEquipoLocal);

		JLabel lblEquipoVisitante = new JLabel("EQUIPO VISITANTE");
		lblEquipoVisitante.setForeground(Color.WHITE);
		lblEquipoVisitante.setBackground(Color.WHITE);
		lblEquipoVisitante.setBounds(21, 49, 128, 14);
		contentPanel.add(lblEquipoVisitante);

		JLabel lblGolesLocal = new JLabel("GOLES LOCAL");
		lblGolesLocal.setForeground(Color.WHITE);
		lblGolesLocal.setBackground(Color.WHITE);
		lblGolesLocal.setBounds(21, 74, 128, 14);
		contentPanel.add(lblGolesLocal);

		JLabel lblGolesVisitante = new JLabel("GOLES VISITANTE");
		lblGolesVisitante.setForeground(Color.WHITE);
		lblGolesVisitante.setBackground(Color.WHITE);
		lblGolesVisitante.setBounds(21, 99, 128, 14);
		contentPanel.add(lblGolesVisitante);

		JLabel lblLugar = new JLabel("LUGAR");
		lblLugar.setForeground(Color.WHITE);
		lblLugar.setBackground(Color.WHITE);
		lblLugar.setBounds(21, 124, 128, 14);
		contentPanel.add(lblLugar);

		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setBackground(Color.WHITE);
		lblFecha.setBounds(21, 149, 128, 14);
		contentPanel.add(lblFecha);

		JButton btnAniadir = new JButton("Añadir");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAniadir.setBounds(21, 188, 89, 23);
		contentPanel.add(btnAniadir);

		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargar.setBounds(144, 188, 89, 23);
		contentPanel.add(btnCargar);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(266, 188, 89, 23);
		contentPanel.add(btnGuardar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 243, 576, 199);
		getContentPane().add(scrollPane);

		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("EQUIPO LOCAL");
		tableModel.addColumn("EQUIPO VISITANTE ");
		tableModel.addColumn("GOLES LOCALES");
		tableModel.addColumn("GOLES VISITANTE");
		tableModel.addColumn("LUGAR");
		tableModel.addColumn("FECHA");
		table = new JTable(tableModel);

		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(144, 22, 242, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 46, 242, 20);
		contentPanel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 71, 242, 20);
		contentPanel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 96, 242, 20);
		contentPanel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(144, 121, 242, 20);
		contentPanel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(144, 146, 242, 20);
		contentPanel.add(textField_5);
	}
}
