import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TimeHelper{
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static LocalTime getValidTimeFromUser(){
		Scanner scan = new Scanner(System.in);
        String time = addHours(scan.nextLine()); // Getting input from user

        boolean validTime = isValid(time);

        while(!validTime){
           System.out.printf("%s does not match with the format mm:ss.SSS! Please try again.%n", time);
           time = addHours(scan.nextLine());
           validTime = isValid(time);
        }
        return LocalTime.parse(time, formatter);
    }

    // Returns true if date can be parsed
    private static boolean isValid(String timeStr){
        try {
            LocalTime retTime = LocalTime.parse(timeStr, formatter);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // Adding 00 hours to LocalTime as it does not support no value
    private static String addHours(String timeStr){
    	return String.format("00:%s", timeStr);
    }
    // Only returns mm:ss.SSS
    public static String toFile(LocalTime time){
    	return time.toString().substring(3);
    }
    // Parses string from file to LocalTime
    public static LocalTime parseTime(String timeStr){
    	return LocalTime.parse(addHours(timeStr), formatter);
    }

}