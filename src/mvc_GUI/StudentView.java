package mvc_GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

// make sure to extend the JFrame here on the class level
public class StudentView extends JFrame {

	//	variables 
	private JTextField nameField = new JTextField(10);
	private JTextField rollNoField = new JTextField(10);
	private JCheckBox carCheckBox = new JCheckBox("Has Car");
	private JButton updateButton = new JButton("Update");
	private JTextArea displayArea = new JTextArea(5, 20);

	public StudentView() {

		// create a JPanel
		JPanel studentPanel = new JPanel();

		// set the frame up 
		this.setVisible(true);
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		// now lets add the variables to the frame
		studentPanel.add(new JLabel("Name:"));
		studentPanel.add(nameField);

		studentPanel.add(new JLabel("Roll No:"));
		studentPanel.add(rollNoField);

		studentPanel.add(carCheckBox);
		studentPanel.add(updateButton);

		studentPanel.add(new JScrollPane(displayArea));

		// add the studentPannel to the frame
		// since everything was added to StudentPannel frame
		this.add(studentPanel);

	}

	//	-------------------------------------
	//  set and get start here

	public JTextField getNameField() {
		return nameField;
	}

	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}

	public JTextField getRollNoField() {
		return rollNoField;
	}

	public void setRollNoField(JTextField rollNoField) {
		this.rollNoField = rollNoField;
	}

	public JCheckBox getCarCheckBox() {
		return carCheckBox;
	}

	public void setCarCheckBox(JCheckBox carCheckBox) {
		this.carCheckBox = carCheckBox;
	}

	public JButton getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(JButton updateButton) {
		this.updateButton = updateButton;
	}

	public JTextArea getDisplayArea() {
		return displayArea;
	}

	public void setDisplayArea(JTextArea displayArea) {
		this.displayArea = displayArea;
	}
	//  set and get end here
	//	-------------------------------------

	// Listener for the update button
	public void addUpdateButtonListener(ActionListener listenForUpdateButton) {
		updateButton.addActionListener(listenForUpdateButton);
	}

	//	display student 
	// this is will take in name, rollno and car to display 
	public void displayStudentDetails(String name, int rollNo, boolean car) {
		displayArea.setText("Name: " + name + "\nRoll No: " + rollNo + "\nHas Car: " + (car ? "Yes" : "No"));
	}
}
