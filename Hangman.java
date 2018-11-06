import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
char c;
Scanner in= new Scanner(System.in);

	public void guess(int life, String word) {
		char[] fill=new char[word.length()];
		int i=0;
	
		while(i<word.length()) {
		
			 c=word.charAt(i);//store the character at the position of i in the word
		        
	         //This if-else will make the user get to know only the positions of vowel in the word 
	        
	         if (c=='a'||c=='o'||c=='e'||c=='i'||c=='u')//if the letter at position x is any vowel,then
	         {	
	        	 //stores the elemnt to the ith position
	        	 fill[i]=c;
	          	            
	         }
	         else{
	        	 //if not then
	        	 fill[i]='-';
	            }
	        i++;//increase the value of variable i by one
	     }
		  System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word
		     System.out.print ('\n');//Delete everything, as the other player shouldn't know the word

		System.out.println(fill);
		
		/*for(char n:fill) {
			System.out.print(n);
		}*/
		ArrayList<Character> l=new ArrayList<Character>();
		char x;
		String v="aeiou";
		while(life>0) {
			System.out.println("guess a word");
			System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
		x=in.next().charAt(0);	//input by user
		 System.out.println("\n");//leave a line
         System.out.println("\n");//leave a line
         System.out.println("\n");//leave a line
         System.out.println("\n");//leave a line
         System.out.println("\n");//leave a line
		
		if(l.contains(x)) {
			System.out.println("already entered");
			System.out.println();
;
			continue;
		}
		
		l.add(x);
		
		if(x==v.charAt(0)) {
			System.out.println("it is given as hint");
		}
		
		if(word.contains(x+"")) {
			for(int y=0;y<word.length();y++) { //checking all index
				if(word.charAt(y)==x) {
					fill[y]=x;	 //will replace -by character
				}
			}
		}
		else 
			System.out.println(x+"  is incorrect");
			life--;
		
		if(word.equals(String.valueOf(fill))) {
			//System.out.println(fill);
			System.out.println("You won");
		//	System.out.println("\n");//leave a line
	      	break;
		}
		
		System.out.println(fill);
		System.out.println("              life remaining"+life);
		
		}
		
		if(life==0) {
			System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
	           System.out.println("\n");//leave a line
			System.out.println("you lose");
		}
		
		}
	}