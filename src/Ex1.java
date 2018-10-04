
public class Ex1 {
	
	public static void main(String[] args) {
		System.out.println(input(30));
		
		System.out.println(input(60));
		
		System.out.println(input(90));
		
	}
	
	public static String input (int score) {
		
		StringBuilder result = new StringBuilder();
		
	if(score < 45) 
		result.append("fail");

	else 
		result.append("pass");

	if(score > 80) 
		result.append(" with distinction");
	
	return result.toString();
	}
	
}
