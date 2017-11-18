import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		double score = 0;
		int riddles = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String ans1 = JOptionPane.showInputDialog("WHATS IN THE BOX");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (ans1.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score + 1;
			riddles++;
		} else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null, "sucess", "ERROR", JOptionPane.ERROR_MESSAGE);
			riddles++;
		}
		// 6. Add some more riddles
		String ans2 = JOptionPane.showInputDialog("what is the question");
		if (ans2.equals("this") || ans2.equals("WHATS IN THE BOX") || ans2.equals("the question")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score + 1;
			riddles++;
		} else {
			JOptionPane.showMessageDialog(null, "IT IS IN THE BOX", "", JOptionPane.ERROR_MESSAGE);
			riddles++;
		}
		String ans3 = JOptionPane.showInputDialog("what smells like red paint and is blue");
		if (ans3.equals("blue paint")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score = score + 1;
			riddles++;
		} else {
			JOptionPane.showMessageDialog(null, "the answer was blue paint", "CRITICAL FAILIURE",
					JOptionPane.ERROR_MESSAGE);
			riddles++;
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score / riddles * 100 + "%", "Your score is...", JOptionPane.YES_NO_OPTION);

	}
}
