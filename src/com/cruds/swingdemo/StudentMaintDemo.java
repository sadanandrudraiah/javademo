package com.cruds.swingdemo;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class StudentMaintDemo extends JFrame{

	private JPanel homePanel;
	private CardLayout cardLayout;
	
	StudentMaintDemo()
	{
		setTitle("Student Maintenance");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		StudentCreatePanel createPanel = new StudentCreatePanel();
		StudentDisplayPanel displayPanel = new StudentDisplayPanel();
		
		createPanel.add(new JButton("Create"));
		displayPanel.add(new JButton("Back"));
		
		cardLayout = new CardLayout();
		homePanel = new JPanel();
		homePanel.setLayout(cardLayout);
		homePanel.add(createPanel,"CREATE_PANEL");
		homePanel.add(displayPanel,"DISPLAY_PANEL");
		
		JButton btnShowCreatePanel = new JButton("Create Screen");
		btnShowCreatePanel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(homePanel, "CREATE_PANEL");				
			}
		});
		
        JButton btnShowDisplayPanel = new JButton("Display Screen");
		btnShowDisplayPanel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(homePanel, "DISPLAY_PANEL");
				
			}
		});
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(btnShowCreatePanel);
		buttonPanel.add(btnShowDisplayPanel);
		
		add(homePanel);
		add(buttonPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new StudentMaintDemo();
			}
		});
	}
	
}
