package com.cruds.swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cruds.db.StudentDAO;

public class StudentDisplayPanel extends JPanel{

	private JTable table;
	Vector<String> colNames = new Vector<>();
	
	private JScrollPane scrPane;
	
	public StudentDisplayPanel() {
		StudentDAO dao = new StudentDAO();
		table = new JTable(new DefaultTableModel(dao.getTableData(), colNames));
		scrPane = new JScrollPane(table);
		
		add(scrPane);
		revalidate();
		//setVisible(true);

	}
	
}
