import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        do {
            //Variable
            String playerA = " ";
            String playerB = "";
            boolean valid1 = false;
            boolean valid2 = false;

            String YN = "";


            do {
                System.out.println("Player A enter your choice of R, P ,S: ");
                if (scan.hasNextLine()) {
                    playerA = scan.nextLine();
                    if (playerA.equalsIgnoreCase("R")) {
                        valid1 = true;
                    } else if (playerA.equalsIgnoreCase("P")) {
                        valid1 = true;
                    } else if (playerA.equalsIgnoreCase("S")) {
                        valid1 = true;
                    } else {
                        System.out.println("Your input was invalid. Try Again.");
                    }
                } else {
                    System.out.println("Your input was invalid. Try Again.");
                }
            } while (!valid1);

            do {
                System.out.println("Player B enter your choice of R, P ,S: ");
                if (scan.hasNextLine()) {
                    playerB = scan.nextLine();
                    if (playerB.equalsIgnoreCase("R")) {
                        valid2 = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        valid2 = true;
                    } else if (playerB.equalsIgnoreCase("S")) {
                        valid2 = true;
                    } else {
                        System.out.println("Your input was invalid. Try Again.");
                    }
                } else {
                    System.out.println("Your input was invalid. Try Again.");
                }
            } while (!valid2);

            if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors! Player A wins!");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors! Player B wins!");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock! Player A wins!");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock! Player B wins!");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper! Player A wins!");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts Paper! Player B wins!");
            }

            System.out.println("If you would like to continue enter 'Y' if not enter 'N': ");
            if (scan.hasNextLine()) {
                YN = scan.nextLine();
                if (YN.equalsIgnoreCase("N")) {
                    end = true;
                }

            } else {
                System.out.println("Your input was invalid. Try Again.");
            }

        } while (!end);

    }
}