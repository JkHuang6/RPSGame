import java.util.Scanner;
import java.lang.String;

public class RPSGame
{
    public static void main (String[]args)
    {

        Scanner rps = new Scanner (System.in);
        System.out.println("Rock-Paper-Scissors!");

        String paper = "P";
        String paper2 = "p";
        String rock = "R";
        String rock2 = "r";
        String scissor = "S";
        String scissor2 = "s";

        System.out.print("Player 1, please make your choice: ");
        String player1 = rps.nextLine();
        //player1.equalsIgnoreCase();

        System.out.print("Player 2, please make your choice: ");
        String player2 = rps.nextLine();
        //player2.equalsIgnoreCase();



        if ((player1.equalsIgnoreCase("r")) && (player2.equalsIgnoreCase("s"))) {
            System.out.println("Player 1 wins!");
        } else if ((player1.equalsIgnoreCase("r")) && (player2.equalsIgnoreCase("p"))) {
            System.out.println("Player 2 wins!");

        } else if ((player1.equalsIgnoreCase("p")) && (player2.equalsIgnoreCase("r"))) {
            System.out.println("Player 1 wins!");
        } else if ((player1.equalsIgnoreCase("p")) && (player2.equalsIgnoreCase("s"))) {
            System.out.println("Player 2 wins!");

        } else if ((player1.equalsIgnoreCase("s")) && (player2.equalsIgnoreCase("r"))) {
            System.out.println("Player 2 wins!");
        } else if ((player1.equalsIgnoreCase("s")) && (player2.equalsIgnoreCase("p"))) {
            System.out.println("Player 1 wins!");

        } else if ((player1.equalsIgnoreCase(player2)) &&
                    ((player1.equalsIgnoreCase(rock)) ||
                    (player1.equalsIgnoreCase(paper)) ||
                    (player1.equalsIgnoreCase(scissor)))) {
            System.out.println("Draw!");
        } else {
            System.out.println("That is not valid, please enter either R, P, or S!");
        }
    }
}
