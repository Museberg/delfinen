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
            System.out.println("| 1 - Trainers              |");
            System.out.println("|                           |");
            System.out.println("| 2 - Members               |");
            System.out.println("|                           |");
            System.out.println("| 3 - Tournament            |");
            System.out.println("|                           |");
            System.out.println("| 0 - Exit program          |");
            System.out.println("|---------------------------|\n");
            System.out.print("Select: ");
            int menuChoice = InputHelper.getOptionFromUser(0,3);
            switch(menuChoice) {
                case 1: 
                    subMenu("trainer", trainerA, memberA, tournamentA);
                    break;
                case 2:
                    subMenu("member", trainerA, memberA, tournamentA);
                    break;
                case 3: 
                    subMenu("tournament", trainerA, memberA, tournamentA);
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
    
    public static void subMenu(String type, ArrayList<Trainer> trainerA, ArrayList<Member> memberA, ArrayList<Tournament> tournamentA) {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n" + type.substring(0,1).toUpperCase() + type.substring(1,type.length()));
            System.out.println("1 - Register new " + type + "        "); 
            System.out.println("2 - Edit " + type + " information    ");
            System.out.println("3 - Display " + type + " information ");
            System.out.println("0 - Back to main menu                ");
            System.out.print("\nSelect: ");
            int menuChoice = InputHelper.getOptionFromUser(0,3);
            switch(menuChoice) {
                case 1:
                    if(type.equals("trainer")) {
                        trainerA.add(Trainer.makeNewTrainer());
                    }else if(type.equals("member")) {
                        memberA.add(Member.makeNewMember());
                    }else if(type.equals("tournament")) {
                        tournamentA.add(Tournament.makeNewTournament(memberA));
                    }
                    break;
                case 2: 
                    if(type.equals("trainer")) {
                        
                    }else if(type.equals("member")) {
                    
                    }else if(type.equals("tournament")) {
                    
                    }
                    break;
                case 3:
                    if(type.equals("trainer")) {
  
                    }else if(type.equals("member")) {
                     
                    }else if(type.equals("tournament")) {
                        
                    }
                    break;
                case 0:
                    shouldWeQuit = true;
                    break;
                default:
                    break;
            }
        } while(!shouldWeQuit); 
    } 
}