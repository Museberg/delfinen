import java.util.*;

public class DolphinMenu {
    
    // Main menu
    public static void mainMenu(ArrayList<Trainer> trainerA, ArrayList<Member> memberA, ArrayList<Tournament> tournamentA) {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n|---------------------------|");
            System.out.println("|--------Welcome  to--------|");
            System.out.println("|-----Dolphin Swim Club-----|");
            System.out.println("|---------Main Menu---------|");
            System.out.println("|---------------------------|");
            System.out.println("|1. Trainers                |");
            System.out.println("|---------------------------|");
            System.out.println("|2. Members                 |");
            System.out.println("|---------------------------|");
            System.out.println("|3. Tournament              |");
            System.out.println("|---------------------------|");
            System.out.println("|0. Exit program            |");
            System.out.println("|---------------------------|\n");
            System.out.print("Select: ");
            int menuChoice = input.nextInt();
            switch(menuChoice) {
                case 1: 
                    
                    break;
                case 2:
                    
                    break;
                case 3: 
                    
                    break;
                case 0: 
                    shouldWeQuit = true;
                    break;
                default:
                    break;
            }
        } while(!shouldWeQuit);
    }
    
    // Sub menues
    public static void trainerMenu() {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n|----------Trainer Menu----------|");
            System.out.println("|1. Register new trainer         |");
            System.out.println("|2. Edit trainer information     |");
            System.out.println("|3. Display trainer information  |");
            System.out.println("|0. Back to main menu            |");
            System.out.println("|--------------------------------|");
            System.out.print("\nSelect: ");
            int menuChoice = input.nextInt();
            switch(menuChoice) {
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    shouldWeQuit = true;
                    break;
            }
        } while(!shouldWeQuit);
    }
    
    public static void memberMenu() {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n|----------Member Menu----------|");
            System.out.println("|1. Register new member         |");
            System.out.println("|2. Edit member information     |");
            System.out.println("|3. Display member information  |");
            System.out.println("|0. Back to main menu           |");
            System.out.println("|-------------------------------|");
            System.out.print("\nSelect: ");
            int menuChoice = input.nextInt();
            switch(menuChoice) {
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    shouldWeQuit = true;
                    break;
            }
        } while(!shouldWeQuit);
    }
    
    public static void tournamentMenu() {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n|----------Tournament Menu----------|");
            System.out.println("|1. Register new tournament         |");
            System.out.println("|2. Edit tournament information     |");
            System.out.println("|3. Display tournament information  |");
            System.out.println("|0. Back to main menu               |");
            System.out.println("|-----------------------------------|");
            System.out.print("\nSelect: ");
            int menuChoice = input.nextInt();
            switch(menuChoice) {
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    shouldWeQuit = true;
                    break;
            }
        } while(!shouldWeQuit);
    }
    
    /*public static void subMenu(String type) {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("%n|%25s|%n", type.substring(0,1).toUpperCase() + type.substring(1,type.length()));
            System.out.println("1. Register new " + type + "        %n"); //19
            System.out.println("2. Edit " + type + " information    %n");
            System.out.println("3. Display " + type + " information %n");
            System.out.println("0. Back to main menu                %n");
            System.out.println("");
            System.out.print("\nSelect: ");
            int menuChoice = input.nextInt();
            switch(menuChoice) {
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    shouldWeQuit = true;
                    break;
            }
        } while(!shouldWeQuit); 
    } */
}