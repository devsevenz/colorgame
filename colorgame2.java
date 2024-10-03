import java.util.Scanner;
import java.util.Random;

public class colorgame2 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 Random rand = new Random();

 String[] color = {"Red","Blue","Yellow","Green","Pink","White"};
 int min = 1;
 int max = 20;
 String usercolor1;
String usercolor2;
 String usercolor3;
 int bet;
 String[] randomc = new String[3];

//input

System.out.println("Welcome to the color game");
System.out.println("1.Blue, 2.Red, 3.Green, 4.Yellow, 5.White, 6.Pink");


 System.out.print("Choose your first color: ");
 usercolor1 = sc.nextLine().toLowerCase();
 System.out.print("Choose your second color: ");
 usercolor2 = sc.nextLine().toLowerCase();
 System.out.print("Choose your third color: ");
 usercolor3 = sc.nextLine().toLowerCase();

 //to check if the user inputs the correct number in the choices
 if (!usercolor1.matches("blue|red|green|yellow|pink|white") ||
 !usercolor2.matches("blue|red|green|yellow|pink|white") ||
 !usercolor3.matches("blue|red|green|yellow|pink|white")) {
 System.out.print("INVALID COLOR!");
 return;
 }

 System.out.print("Place your bets: ");
 bet = sc.nextInt();

 //to check if the user inputs the correct number in the choices

 if (bet > max) {
 System.out.println("You can only bet a maximum of 20!");
 return;
 } else if (bet < min) {
 System.out.println("You can only bet a minimum of 1!");
 return;
 }

 // Process
 for (int i = 0; i < 3; i++) {
 int randomIndex = rand.nextInt(color.length);
 randomc[i] = color[randomIndex].toLowerCase();
 System.out.println("Random color: " + randomc[i]);
 }

 if (usercolor1.equals(randomc[0]) || usercolor2.equals(randomc[1]) || usercolor3.equals(randomc[2])) {
 System.out.println("You Win!");
 System.out.println("₱" + bet * 2);
 } else {
System.out.println("You Lose!");
 }
 }
}
