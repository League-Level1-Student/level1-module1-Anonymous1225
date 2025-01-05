package _11_binary_converter;

import javax.swing.JOptionPane;

public class Bin_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binarybois bin= new Binarybois(JOptionPane.showInputDialog("Please enter 8 digits of binary"));
		JOptionPane.showMessageDialog(null, bin.convert());
	}
	
}
