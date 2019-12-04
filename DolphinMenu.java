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
            InputHelper.getOptionFromUser(0,3);
            switch(menuChoice) {
                case 1: 
                    subMenu("trainer");
                    break;
                case 2:
                    subMenu("member");
                    break;
                case 3: 
                    subMenu("tournament");
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
    
    public static void subMenu(String type) {
        Scanner input = new Scanner(System.in);
        boolean shouldWeQuit = false;
        do {
            System.out.println("\n" + type.substring(0,1).toUpperCase() + type.substring(1,type.length()));
            System.out.println("1 - Register new " + type + "        "); 
            System.out.println("2 - Edit " + type + " information    ");
            System.out.println("3 - Display " + type + " information ");
            System.out.println("0 - Back to main menu                ");
            System.out.print("\nSelect: ");
            InputHelper.getOptionFromUser(0,3);
            switch(menuChoice) {
                case 1:
                    if(type.equals("trainer")) {
                        Trainer.makeNewTrainer();
                    }else if(type.equals("member")) {
                        Member.makeNewMember();
                    }else if(type.equals("tournament")) {
                        Tournament.makeNewMember();
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