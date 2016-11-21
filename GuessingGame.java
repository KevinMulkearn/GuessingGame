
// Kevin Mulkearn
// 11124725

import java.util.Random;
import javax.swing.JOptionPane; 

public class GuessingGame
{
  public static void main( String[] args )
  {
      Random randomNumbers = new Random();
      int number; 
      int attempt = 0;

       number = 1 + randomNumbers.nextInt( 100 );
     
       
       JOptionPane.showMessageDialog( null, "Guess a random number between 1 and 100",
          "Guessing Game", JOptionPane.PLAIN_MESSAGE );
          
     
      for ( attempt = 0; attempt <= 5; attempt++ )
      {
        
        String firstNumber = 
           JOptionPane.showInputDialog( "Enter Guess" );
         
         
       int number1 = Integer.parseInt( firstNumber ); 
       
          
       if ( number1 ==  number )
       {
        JOptionPane.showMessageDialog( null, "Congratulations Guess is Correct",
             "Guessing Game", JOptionPane.INFORMATION_MESSAGE );
         break;
        }
          
       else if (  number1 < number )
       {
         JOptionPane.showMessageDialog( null, "Number is higher ",
              "Guessing Game", JOptionPane.INFORMATION_MESSAGE );
        }
       
       else if (  number1 > number )
       {
         JOptionPane.showMessageDialog( null, "Number is lower ",
              "Guessing Game", JOptionPane.INFORMATION_MESSAGE );
        }
      
    }
          
    if(attempt > 5)
    {
       JOptionPane.showMessageDialog( null, "Out of guesses",
           "Guessing Game", JOptionPane.WARNING_MESSAGE );
    }
          
          
  }



}