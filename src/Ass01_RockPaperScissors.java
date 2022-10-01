import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        String PlayerA = "";
        String PlayerB = "";
        String GameResp = "";
        boolean blockVal = true;
        boolean newGame = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play Rock, Scissors, Paper? [Y/N]");
        do {
            GameResp = in.nextLine();
            if (GameResp.equalsIgnoreCase("Y")) {
                blockVal = true;
            }
            else if (GameResp.equalsIgnoreCase("N")) {
                System.out.println("Okay. Maybe next time. ");
                System.exit(0);
            }
            else {
                System.out.println("Invalid Entry. Please select [Y/N]");
                blockVal = false;
            }
        }
        while (!blockVal);
        do {
                System.out.println("You can be Player A. What is your move Rock [R], Scissors [S] or Paper [P]? ");
                do {
                    PlayerA = in.nextLine();
                    if (PlayerA.matches("(?i)R|P|S")) {
                        blockVal = true;
                    } else {
                        System.out.println("Invalid Selection [" + PlayerA + "]. Please select [R/P/S].");
                        blockVal = false;
                    }
                }
                while (!blockVal);
                System.out.println("Next up is Player B. What is your move Rock [R], Scissors [S] or Paper [P]? ");
                do {
                    PlayerB = in.nextLine();
                    if (PlayerB.matches("(?i)R|P|S")) {
                        blockVal = true;
                    } else {
                        System.out.println("Invalid Selection [" + PlayerB + "]. Please select [R/P/S].");
                        blockVal = false;
                    }
                }
                while (!blockVal);
                if (PlayerA.equalsIgnoreCase("R")) {
                    if (PlayerB.equalsIgnoreCase("R")) {
                        System.out.println("You both chose Rock. It's a Tie!");
                    } else if (PlayerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock. Player B wins!");
                    } else {
                        System.out.println("Rock breaks Scissors. Player A wins!");
                    }
                } else if (PlayerA.equalsIgnoreCase("S")) {
                    if (PlayerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors. Player B wins!");
                    } else if (PlayerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut Paper. Player A wins!");
                    } else {
                        System.out.println("You both chose Scissors. It's a Tie!");
                    }
                } else {
                    if (PlayerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock. Player A wins!");
                    } else if (PlayerB.equalsIgnoreCase("P")) {
                        System.out.println("You both chose Paper. It's a Tie!");
                    } else {
                        System.out.println("Scissors cut Paper. Player B wins!");
                    }
                }
                System.out.println("Do you want to play again? [Y/N]");
                do {
                    GameResp = in.nextLine();
                    if (GameResp.equalsIgnoreCase("y")) {
                        newGame = true;
                    }
                    else if (GameResp.equalsIgnoreCase("n")) {
                        System.out.println("Thanks for Playing!");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Invalid Entry. Please select [Y/N]");
                        blockVal = false;
                    }
                }
                while (!blockVal);
            }
            while (newGame = true);
        }
    }
