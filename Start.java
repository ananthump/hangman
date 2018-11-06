import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
int life=5;
Hangman h=new Hangman();
System.out.println("Enter the word for player ");//Print this
  
//create an object of Scanner class
Scanner in= new Scanner(System.in);

//Take the word as input from a player
String word= in.nextLine();

h.guess(life,word);
System.out.println("The word was "+word);
System.out.println("\n");//leave a line
System.out.println("\n");//leave a line
System.out.println("\n");//leave a line
System.out.println("\n");//leave a line
System.out.println("\n");//leave a line
System.out.println("\n");//leave a line
	}

}
