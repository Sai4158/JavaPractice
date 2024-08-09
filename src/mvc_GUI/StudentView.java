package mvc_GUI;
//VIEW
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;

//extend JFrame in class
public class StudentView extends JFrame {

	//	Creating fields, check box and labels
	 JTextField nameField = new JTextField(10);
	 JTextField rollNoField = new JTextField(10);
	 JCheckBox carCheckBox = new JCheckBox("Has Car");
	 JButton updateButton = new JButton("Update");
	 JTextArea displayArea = new JTextArea(5, 20);

//	 constructor
	public StudentView() {
		// create a JPanel
		JPanel studentPanel = new JPanel();

		// set the frame up 
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		studentPanel.setBackground(Color.gray);

		// now lets add the variables to the frame
		studentPanel.add(new JLabel("Name: "));
		studentPanel.add(nameField);

		studentPanel.add(new JLabel("Roll No: "));
		studentPanel.add(rollNoField);

		studentPanel.add(carCheckBox);
		studentPanel.add(updateButton);

		studentPanel.add(new JScrollPane(displayArea));

		// add the studentPannel to the frame
		// since everything was added to StudentPannel JPanel
		add(studentPanel);

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

	
	// Action listener for the button to update on screen
	// adds action to the update button 
	public void addUpdateButtonListener(ActionListener listenForUpdateButton) {
		updateButton.addActionListener(listenForUpdateButton);
	}

//	will display results in text area
//	setText will put values in it 
	public void displayStudentDetails(String name, int rollNo, boolean car) {
		displayArea.setText("Name: " + name + "\nRoll No: " + rollNo + "\nHas Car: " + (car ? "Yes" : "No") +"\n"  +"Thank you");
	}
}
