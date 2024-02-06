package corejavaconcepts;

import java.util.Base64;

public class ArrayListTest {
	
	public static void main(String[] args) {
	
	String originalInput = "test input";
	String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

	byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
	String decodedString = new String(decodedBytes);
	System.out.print(decodedString);
		}
}


