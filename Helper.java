public class Helper{
	
	// Use .name() on enum to get its string representation
	public static String getEnumAsString(String enumString){
		return enumString.substring(0, 1).toUpperCase() + enumString.substring(1).toLowerCase();
	}
}