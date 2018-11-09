
import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		String word=JOptionPane.showInputDialog("Enter the word for player");
		Hangman h=new Hangman();

h.guess(word);
	}

}
