import java.util.Scanner;

public class WordWrap {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int width;
		String words = "";
		
		System.out.println("Please enter the length of each line:");
		width = scnr.nextInt();

		System.out.println("Please enter the words you want to wrap:");
		String nextLine = scnr.nextLine();
		
		
		
		while (!nextLine.equals("Stop.")) {
			words = words + nextLine;
			words = words + "\n";
			nextLine = scnr.nextLine();
		} 
		
		words = words.replaceAll("( )+", " ");
			
		words = words.trim().replaceAll("\n", " ");
		
		String finalBuffer = "";
		int lineLength = 0;
		String word = "";
		for (int i = 0; i < words.length(); i++) {
			char currentChar = words.charAt(i);
			
			
			if (Character.isWhitespace(currentChar)) {
				if ((lineLength + word.length()) > width) {
					finalBuffer += "\n" + word + " ";
					lineLength = word.length() + 1;
					
				}
				else {
					finalBuffer += word + " ";
					lineLength += word.length() + 1;
				}
				word = "";
				continue;
			} 
			word += currentChar;
			
		}
		
		finalBuffer = finalBuffer.trim().replaceAll("  ", "\n\n");
		finalBuffer = finalBuffer.trim().replaceAll("\n\n\n", "\n\n");
		finalBuffer = finalBuffer + words.substring(words.lastIndexOf(" "));
		
		System.out.println(finalBuffer);
		
		}
		
	}
