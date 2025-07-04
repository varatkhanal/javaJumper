package swingDemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DashBoard implements ActionListener{
	JLabel lblFirst, lblLast, lblGender, lblProgram , lblSection, lblBookTaken;
	
	JTextField txtFirst, txtLast, txtBook;
	JComboBox comboProgram, comboSection;
	JRadioButton radioMale, radioFemale;
	JButton btnAdd, btnDisplay;
	
	public DashBoard() {
		JFrame frame = new JFrame("Dashboard");
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		GridLayout gl = new GridLayout(7,2,15,15);
		panel.setLayout(gl);
		
		//components 
		
		lblFirst = new JLabel("First Name");
		lblLast = new JLabel("Last Name");
		lblGender = new JLabel("Gender");
		lblProgram = new JLabel("Program");
		lblSection = new JLabel("Section");
		lblBookTaken = new JLabel("Book Taken");
		
		txtFirst = new JTextField();
		txtLast = new JTextField();
		txtBook = new JTextField();
		
		radioMale = new JRadioButton("Male");
		radioFemale = new JRadioButton("Female");
		
		String[] program = {"MBA","BCIS","BBA","BCSIT","BBA-TT","BBA Finance"};
		comboProgram = new JComboBox(program);
		
		comboSection = new JComboBox();
		comboSection.addItem("Fusion");
		comboSection.addItem("Fourier");
		comboSection.addItem("Grit/Garnet");
		comboSection.addItem("Hypervisor");
		comboSection.addItem("Intel");
		comboSection.addItem("Ignite");
		comboSection.addItem("Jumper");
		comboSection.addItem("Jitter");

		
		//creating button
		btnAdd = new JButton("Add");
		btnDisplay = new JButton("Display");
		
		lblFirst.setSize(180,30);
		lblLast.setSize(180,30);
		lblGender.setSize(180,30);
		lblProgram.setSize(180,30);
		lblSection.setSize(180,30);
		lblBookTaken.setSize(180,30);
		
		txtFirst.setSize(180,30);
		txtLast.setSize(180,30);
		txtBook.setSize(180,30);
		
		comboProgram.setSize(180,30);
		comboSection.setSize(180,30);

		radioMale.setSize(180,30);
		radioFemale.setSize(180,30);
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(radioMale);
		rg.add(radioFemale);
		
		btnAdd.setSize(180,30);
		btnDisplay.setSize(180,30);
		
		
		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderPanel.add(radioMale);
		genderPanel.add(radioFemale);
		
		panel.add(lblFirst);
		panel.add(txtFirst);
		panel.add(lblLast);
		panel.add(txtLast);
		panel.add(lblGender);
		panel.add(genderPanel);
		panel.add(lblProgram);
		panel.add(comboProgram);
		panel.add(lblSection);
		panel.add(comboSection);
		panel.add(lblBookTaken);
		panel.add(txtBook);
		panel.add(btnAdd);
		panel.add(btnDisplay);
		
		
		btnAdd.addActionListener(this);
		
		frame.setLayout(null);
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fist= txtFirst.getText().toString();
		String last= txtLast.getText().toString();
		
		String program = (String)comboProgram.getSelectedItem();
		String section = (String)comboSection.getSelectedItem();
		
		String gender = "";
		if(radioMale.isSelected())
			gender = "male";
		else
			gender = "female";
		
		JOptionPane.showMessageDialog(null,fist+" "+last+" "+program+" "+section+" "+gender);
	}
	

}
