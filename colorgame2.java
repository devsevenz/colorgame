import java.util.Scanner;
import java.util.Random;

public class colorgame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] color = {"0","1","2","3","4","5"};
        int min = 1;
        int max = 20;
        int usercolor1;
        int usercolor2;
        int usercolor3;
        int bet;
        int[] randomc = new int[3];

        //input

        System.out.println("Welcome to the color game");
        System.out.println("1.Blue, 2.Red, 3.Green, 4.Yellow, 5.White, 6.Pink");



        System.out.print("Choose your first color: ");
        usercolor1 = sc.nextInt();
        System.out.print("Choose your second color: ");
        usercolor2 = sc.nextInt();
        System.out.print("Choose your third color: ");
        usercolor3 = sc.nextInt();

        //to check if the user inputs the correct number in the choices

        if (usercolor1 > 6 || usercolor2 > 6 || usercolor3 > 6 || usercolor1 < 1 || usercolor2 < 1 || usercolor3 < 1) {
            System.out.println("Choose between 1-6!");
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

        //process

            for(int i = 0; i < 3; i++) {
            randomc[i] = rand.nextInt(color.length) + 1;
            System.out.println("random colors " +(i + 1) + " ; " + randomc[i]);
        }

        if(usercolor1 == randomc[0] || usercolor2 == randomc[1] || usercolor3 == randomc[2]) {
            System.out.println("You Win!");
            System.out.println("₱" + bet * 2 );
        }else{
            System.out.println("You Lose!" );
        }



    }
}