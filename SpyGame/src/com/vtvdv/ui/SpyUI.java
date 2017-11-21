package com.vtvdv.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JList;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;

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
		frame.setBounds(100, 100, 450, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel mainTab = new JPanel();
		tabbedPane.addTab("Main", null, mainTab, null);
		mainTab.setLayout(new BorderLayout(0, 0));
		
		JLabel agencyName = new JLabel("Agency: ");
		mainTab.add(agencyName, BorderLayout.NORTH);
		
		JPanel missionsTab = new JPanel();
		tabbedPane.addTab("Missions", null, missionsTab, null);
		
		JPanel agentsTab = new JPanel();
		tabbedPane.addTab("Agents", null, agentsTab, null);
		//agentsTab.setLayout(new FormLayout(new ColumnSpec[] {
		//		FormSpecs.RELATED_GAP_COLSPEC,
		//		ColumnSpec.decode("default:grow"),},
		//	new RowSpec[] {
		//		FormSpecs.RELATED_GAP_ROWSPEC,
		//		FormSpecs.DEFAULT_ROWSPEC,
		//		FormSpecs.RELATED_GAP_ROWSPEC,
		//		RowSpec.decode("default:grow"),}));
		
		JLabel agentsLabel = new JLabel("Double click on an Agent for information:");
		agentsTab.add(agentsLabel, "2, 2, default, top");
		
		JList agentList = new JList();
		agentsTab.add(agentList, "2, 4, fill, fill");
		
		JPanel mapTab = new JPanel();
		tabbedPane.addTab("World Map", null, mapTab, null);
	}

}
