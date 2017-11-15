package com.vtvdv.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class SpyUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpyUI window = new SpyUI();
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
	public SpyUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane mainTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Main", null, mainTab, null);
		
		JTabbedPane agentTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Agents", null, agentTab, null);
		
		JTabbedPane missionsTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Missions", null, missionsTab, null);
		
		JTabbedPane mapTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("World Map", null, mapTab, null);
	}

}
