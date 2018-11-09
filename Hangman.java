import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.scene.text.Font;


public class Hangman implements ActionListener{
	int life=5;
	ImageIcon icon=new ImageIcon("Very_Sad_Face_Emoji_Icon_ios10.jpeg");
	ImageIcon Icon=new ImageIcon("won.jpeg");
	String v="aeiou";
String fill;
	String word;
char c;
ArrayList<Character> l=new ArrayList<Character>();

Scanner in= new Scanner(System.in);
JFrame f=new JFrame("Hangman");
JTextArea ta=new JTextArea();
JTextArea tb=new JTextArea();

JButton b1=new JButton("Guess");
JTextField t=new JTextField();
JLabel l1=new JLabel("Enter a letter");
JLabel l2=new JLabel("Life");
char x;
Font f1;
public Hangman() {
	  ta.setBounds(30, 40, 280, 30);
	  l1.setBounds(30, 120, 200, 30);
	  l2.setBounds(30, 210, 100, 100);
	  tb.setBounds(60, 240, 30,30);
	  t.setBounds(30,150,280,30);
	  ta.setEditable(false);
	  tb.setEditable(false);
	  b1.setBounds(50,300,150,30);
	  b1.addActionListener(this);

	  
	  
	f.add(l1);
    f.add(ta);
	f.add(t);
	f.add(b1);
	f.add(l2);
	f.add(tb);
	
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setSize(400,500);  
	f.setLayout(null);  
	f.setVisible(true); 
	}



	public void guess( String word) {
		tb.setText(Integer.toString(life));
		
		
		 fill=word;
		this.word=fill;
		//char[] fill=new char[word.length()];
		int i=0;
	
		while(i<word.length()) {
		
			 c=word.charAt(i);//store the character at the position of i in the word
		        
	         //This if-else will make the user get to know only the positions of vowel in the word 
	        
	         if (c=='a'||c=='o'||c=='e'||c=='i'||c=='u')//if the letter at position i is any vowel,then
	         {	
	        	 //stores the element to the ith position
	        	 //fill[i]=c;
	          	   fill=fill.replace(fill.charAt(i), c);         
	         }
	         else{
	        	 //if not then
	        	 //fill[i]='-';
	          	   fill=fill.replace(fill.charAt(i),'-');         

	         }
	        i++;//increase the value of variable i by one
	     }
		  
		     	ta.setText(fill);
		}
	
	public static String replaceCharAt(String s, int pos, char c) {
	    return s.substring(0, pos) + c + s.substring(pos + 1);
	  }



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			
			while(life>0) {
				//("guess a word");
			
			x=t.getText().charAt(0);
			t.setText(null);
			
			if(l.contains(x)) {
				JOptionPane.showMessageDialog(null, "already entered", "Warning", 2);
				continue;
			}
			
			l.add(x);
			
			if(x==v.charAt(0)) {
				JOptionPane.showMessageDialog(null, "it is given as hint");
			continue;
			}
			
			if(word.contains(x+"")) {
				for(int y=0;y<word.length();y++) { //checking all index
					if(word.charAt(y)==x) {
						 //will replace -by character
			          	   fill=replaceCharAt(fill, y, x);         

					}
				}
			}
			else 
				{				JOptionPane.showMessageDialog(null, "INCORRECT ");

				life--;
				
				tb.setText(Integer.toString(life));
				}
			
			
			
			if(word.equals(String.valueOf(fill))) {
				ta.setText(word);
				JOptionPane.showMessageDialog(null, "", "Congradulation",2,Icon);
		      	break;
			}
				ta.setText(fill);
			
				if(life==0) {
						JOptionPane.showMessageDialog(null, "you loose", "Sorry",2,icon);

						
					}
					
			
			}
			
		}
	}
	}