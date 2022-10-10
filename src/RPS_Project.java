import java.util.Scanner;

public class RPS_Project {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        String player1 = "";
        String player2 = "";
        boolean done = false;


        for(int i=0;i<3;i++)
        {
            System.out.print("Please choose Rock, Paper, or Scissors.");

            player1 = sc.nextLine();

            System.out.print("Please choose Rock, Paper, or Scissors.");

            player2 = sc.nextLine();


            if(player1.equals("R") && player2.equals("S"))
            {
                System.out.println("Rock breaks Scissors! Player 1 won!");
            }

            else if(player1.equals("P") && player2.equals("R"))
            {
                System.out.println("Paper covers Rock! Player 1 won!");
            }

            else if(player1.equals("S") && player2.equals("P"))
            {
                System.out.println("Scissors cut Paper! Player 1 won!");
            }

            else if(player1.equals("S") && player2.equals("R"))
            {
                System.out.println("Rock breaks Scissors! Player 2 won!");
            }

            else if(player1.equals("R") && player2.equals("P"))
            {
                System.out.println("Paper covers Rock! Player 2 won!");
            }

            else if(player1.equals("P") && player2.equals("S"))
            {
                System.out.println("Scissors cut Paper! Player 2 won!");
            }

            else if(player1.equals(player2))
            {
                System.out.println("Tie!");
            }

        }
        Scanner scanner = new Scanner(System.in);
        String userResponse = "";
        do{
            System.out.println("Do you want to play again [Y/N]");

            if(userResponse.equalsIgnoreCase("N")) {
                done = true;
            }
        }while(!done);


        }
    }

