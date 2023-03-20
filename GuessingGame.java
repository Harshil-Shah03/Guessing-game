/*
 * Harshil Shah 60004210134
 * Jay Korat 60004210136
 * Bhavya Patel 60004210141
 */

import javax.swing.*;

public class GuessingGame {
static String name1= JOptionPane.showInputDialog(null,"Player1 Enter Your Name");
static String name2= JOptionPane.showInputDialog(null,"Player 2 Enter Your Name");
public static void main(String[] args) {

int computerNumber1 = (int) (Math.random()*100 + 1);
int computerNumber2 = (int) (Math.random()*100 + 1);

int userAnswer1 = 0;
int userAnswer2 = 0;

System.out.println("The correct guess would be " + computerNumber1);
System.out.println("The correct guess would be " + computerNumber2);

int count1 = 1;
int count2 = 1;



//for player 1
while (userAnswer1 != computerNumber1)

{

String response1 = JOptionPane.showInputDialog(null,

"Player 1 Enter a guess between 1 and 100", "Guessing Game", 3);

userAnswer1 = Integer.parseInt(response1);

JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer1, computerNumber1, count1,name1));

count1++;
}

while (userAnswer2 != computerNumber2)
{
String response2 = JOptionPane.showInputDialog(null,

"Player 2 Enter a guess between 1 and 100", "Guessing Game", 3);

userAnswer2 = Integer.parseInt(response2);

JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer2, computerNumber2, count2,name2));

count2++;

}
if(count1<count2)
JOptionPane.showMessageDialog(null, "Congratulations!!!!! "+name1+ " You are the winner   " );
else if(count1>count2)
JOptionPane.showMessageDialog(null, "Congratulations!!!!! "+name1+ " You are the winner   " );
else
JOptionPane.showMessageDialog(null, "It's a Tie!!! " );


}

public static String determineGuess(int userAnswer, int computerNumber, int count,String name){

if (userAnswer <=0 || userAnswer >100) {

return"Your guess is invalid";

}

else if (userAnswer == computerNumber ){

return" That was a correct guess " +name+" it took you " + count+" tries";



}

else if (userAnswer > computerNumber) {

return"Your guess is too high, try again.\nNo of Guesses: " + count;

}

else if (userAnswer < computerNumber) {

return"Your guess is too low, try again.\nNo of Guesses: " + count;

}

else {

return"Your guess is incorrect\nTry Number: " + count;

}

}

}