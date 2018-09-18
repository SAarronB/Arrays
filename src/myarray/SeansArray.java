package myarray;

import javax.swing.JOptionPane;

public class SeansArray
{
	public static void main(String[] args) {
		int sean[] = new int[10];
	
		sean[0] = 1234;
		sean[1] = 5678;
    	sean[2] = 9101112;
    	
    	JOptionPane.showMessageDialog(null, sean[1]);
	}
}
