package extra;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(null, "Are you happy?");
		if (answer.equals("no")) {
			JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (answer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			} else if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}

		}
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub

	}
}
