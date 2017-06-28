package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		speak("what is 9 plus 20");
		String ONE = JOptionPane.showInputDialog("Type Here");
		if (ONE.equals("29")) {
			speak("correct");
		} else {
		}
		speak("wrong");

		speak("Think of a number 1 to 10");
		String TWO = JOptionPane.showInputDialog(null, "Type Here");
		if (TWO.equals("1")) {
			speak("correct");
		} else {

			speak("wrong");
		}
		speak("is this a question?");
		String THREE = JOptionPane.showInputDialog("Type Here");
		if (THREE.equals("yes")) {
			speak("correcrt");
		} else {

			speak("wrong");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}