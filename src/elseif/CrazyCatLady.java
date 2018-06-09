//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	private static final String String = null;

	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String answer = JOptionPane.showInputDialog(null,"How many cats do you have?");
		// 2. Convert their answer into an int
int cat = Integer.parseInt(answer);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
showMessageDialog(null,"YOU HAVE TOO MANY CATS. YOU ARE A CRAZY CAT LADY!!!!");
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
playVideo("https://www.youtube.com/results?search_query=cat+videos");
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		playVideo("https://www.youtube.com/results?search_query=frog+sitting+on+a+bench+like+a+human");
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

