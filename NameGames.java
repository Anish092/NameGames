 import java.util.Scanner;

public class NameGames
{
 public static void main(String[] args){

	  Scanner userinput = new Scanner(System.in);
	  String name, nametwo, namethree, namefour;
	  int length, lengthtwo;

	  System.out.print("Enter your name: ");
      name = userinput.nextLine();

      System.out.println("Hello " + name + "!");
      length = name.length();
      System.out.println("Your name is " + length + " letters long");
      nametwo = "" + name.charAt(0);
      System.out.println("Your name starts with a " + nametwo );
      namethree = "" + name.charAt(length/2);
      System.out.println("The letter " + namethree + " is at the center of your name" );
      namefour = "" + name.charAt(length-1);
      System.out.println("Your name ends with a " + namefour );
      System.out.println("Goodbye " + name + "!" );
      }
}
