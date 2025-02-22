package string;

public class IQ2 {
	public static void main(String[] args) {
		
		String str = "welcome 123 ning";

		String[] words = str.split("\\s+");

		for(String word : words) {
			try {
				int num = Integer.parseInt(word);
				System.out.println(num);
			}
			catch(NumberFormatException e){
				
			}
		}
	}

}
// "\\s+"- to split any amount of whitespace
