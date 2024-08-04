package swing_awt;

import java.awt.*;
import javax.swing.*;

public class Test1 extends JFrame {
	
	 public Test1() {
	        initializeUI();
	        
	    }

	    public void initializeUI() {
	        setTitle("Practice Window");
	        setSize(600, 400);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        // Label for first text field
	        JLabel jl = new JLabel("Enter text here:");
	        jl.setBounds(15, 5, 200, 30); 
	        add(jl);

	        // Text field for input
	        JTextField tt = new JTextField();
	        tt.setBounds(15, 35, 200, 30);
	        add(tt);

	        // Label for second text field
	        JLabel jl1 = new JLabel("Enter text here:");
	        jl1.setBounds(15, 75, 200, 30); 
	        add(jl1);

	        // Second text field for input
	        JTextField tt1 = new JTextField();
	        tt1.setBounds(15, 105, 200, 30);
	        add(tt1);

	        setVisible(true);
	    }
	    
	    public static void main(String[] args) {
	        new Test1(); // Simplified constructor usage
	    }
	}