import java.util.*;
import java.io.*;
public class FileHandler {
   
   // An efficient way of reloading the data when the program launches again
   // As it returns the data in the files to the ArrayList making it remember what was stored.
    /*public static ArrayList<Tournament> readTournamentInfo(ArrayList<Tournament> tournamentA) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Tournament_Info.txt"));
        // input.setDelimiter(", ");
        while(input.hasNextLine()) {
        String tournamentName = input.nextLine();
        String location = input.nextLine();
        Discipline.DisciplineType disciplineType = Discipline.DisciplineType.valueOf(input.nextLine());
        
        String fullName = input.nextLine(); 
        String address = input.nextLine();
        int phoneNumber = Integer.parseInt(input.nextLine());
        String birthDate = input.nextLine();
        boolean membershipStatus = input.nextBoolean();
        boolean arrears = input.nextBoolean();
        String tName = input.nextLine();
        String tAddress = input.nextLine();
        int tPhoneNumber = Integer.parseInt(input.nextLine());
        String teamName = input.nextLine();
        boolean isOver18 = input.nextBoolean();
        Trainer tempT = new Trainer(tName, tAddress, tPhoneNumber, teamName, isOver18); 
      
        Tournament temp = new Tournament(tournamentName, location, disciplineType,);
        tournamentA.add(temp);
        }
    return tournamentA;
    }
    // Change so it follows the new tournament class ^^^^*/
   
   public static ArrayList<Trainer> readTrainerInfo(ArrayList<Trainer> trainerA) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Trainer_Info.txt"));
     
      while(input.hasNextLine()) {
         String fullName = input.nextLine();
         String title = input.nextLine();
         String address = input.nextLine();
         int phoneNumber = Integer.parseInt(input.nextLine());
         String teamName = input.nextLine();
         boolean isOver18 = input.nextBoolean(); 
         
         Trainer temp = new Trainer(fullName, address, phoneNumber, teamName, isOver18);
         trainerA.add(temp);
      }
      return trainerA; 
   }
   
   public static ArrayList<Discipline> readDisciplineInfo(ArrayList<Discipline> disciplineA, ArrayList<Member> memberA) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Discipline_Info.txt"));
      while(input.hasNextLine()) {
         Discipline.DisciplineType disciplineType = Discipline.DisciplineType.valueOf(input.nextLine());
         String fullName = input.nextLine();
         String address = input.nextLine();
         int phoneNumber = Integer.parseInt(input.nextLine());
         String birthDate = input.nextLine();
         boolean membershipStatus = input.nextBoolean();
         boolean arrears = input.nextBoolean();
         
         Member temp1 = new Member(fullName, address, phoneNumber, birthDate, membershipStatus, arrears);
         
         memberA.add(temp1);
        
         Discipline temp = new Discipline(disciplineType, memberA);
         disciplineA.add(temp);     
      }
      return disciplineA;
         
   }
   
   public static ArrayList<Member> readMemberInfo(ArrayList<Member> memberA) throws FileNotFoundException {
      Scanner input = new Scanner(new File("Trainer_Info.txt"));
     
      while(input.hasNextLine()){
         String fullName = input.nextLine();
         String address = input.nextLine();
         int phoneNumber = Integer.parseInt(input.nextLine());
         String birthDate = input.nextLine();
         boolean membershipStatus = input.nextBoolean();
         boolean arrears = input.nextBoolean();
         
         Member temp = new Member(fullName, address, phoneNumber, birthDate, membershipStatus, arrears);
         memberA.add(temp);
      }
      return memberA;
      
   }
   
   public static ArrayList<CompSwimmer> readCompSwimmerInfo(ArrayList<CompSwimmer> compSwimmerA, ArrayList<Trainer> trainerA) throws FileNotFoundException {
      Scanner input = new Scanner(new File("CompSwimmer_Info.txt"));
     
      while(input.hasNextLine()) {
         String fullName = input.nextLine();
         String address = input.nextLine();
         int phoneNumber = Integer.parseInt(input.nextLine());
         String birthDate = input.nextLine();
         boolean membershipStatus = input.nextBoolean();
         boolean arrears = input.nextBoolean();
         String tName = input.nextLine();
         String tAddress = input.nextLine();
         int tPhoneNumber = Integer.parseInt(input.nextLine());
         String teamName = input.nextLine();
         boolean isOver18 = input.nextBoolean();
         Trainer tempT = new Trainer(tName, tAddress, tPhoneNumber, teamName, isOver18);
         
         trainerA.add(tempT);
         
         Discipline.DisciplineType disciplineType = Discipline.DisciplineType.valueOf(input.nextLine());
         
         
         CompSwimmer temp = new CompSwimmer(fullName, address, phoneNumber, birthDate, membershipStatus, arrears, tempT, disciplineType);         
         compSwimmerA.add(temp);
      }
      return compSwimmerA;
   }
   
   public static void saveToFile(ArrayList<Tournament> tournamentA, ArrayList<Trainer> trainerA, ArrayList<Member> memberA, ArrayList<CompSwimmer> compSwimmerA)
   throws FileNotFoundException {
      PrintStream outputTournament = new PrintStream(new File("Tournament_Info.txt"));
      for(int i = 0; i < tournamentA.size(); i++){
         outputTournament.println(tournamentA.get(i));
      }
      
      PrintStream outputTrainer = new PrintStream(new File("Trainer_Info.txt"));
      for(int i = 0; i < tournamentA.size(); i++) {
         outputTrainer.println(trainerA.get(i));
      }
      PrintStream outputMember = new PrintStream(new File("Member_Info.txt"));
      for(int i = 0; i < tournamentA.size(); i++) {
         outputMember.println(memberA.get(i));
      }
      
      PrintStream outputCompSwimmer = new PrintStream(new File("CompSwimmer.txt"));
      for(int i = 0; i < compSwimmerA.size(); i++) {
         outputCompSwimmer.println(compSwimmerA.get(i));
      }
   }
}