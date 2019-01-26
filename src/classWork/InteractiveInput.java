package classWork;

import javax.swing.JOptionPane;

public class InteractiveInput {
	public static void main (String args[]) {
		float feeBalance;
		feeBalance = Float.parseFloat (JOptionPane.showInputDialog(null, "Enter you fee balance"));
		JOptionPane.showMessageDialog(null, "Your fee balance is : " + feeBalance);
	}
}
