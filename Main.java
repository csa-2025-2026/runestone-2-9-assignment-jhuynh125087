import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String word= "calculator";
    int count = 0; // the number of times the letter has shown up the most
    String maxLetter = " ";
    Scanner sc = new Scanner (System.in);
    String targetLetter = word.substring (i, i+1);

    for (int i = 0; i < word.length (); i++);
    {
      String targetLetter = word.substring (i,i++);
      int count = 0;

      for (int = j = 0; j < word.length; j++);
      {
        String currentLetter = word.substring (j, j+1);
        if (currentLetter.equals (targetLetter));
        {
          count ++;
          
        }

      }
        maxLetter = targetLetter;
        System.out.println ("The letter " + targetLetter + "appears " + count + "time");


    }

  }
}
