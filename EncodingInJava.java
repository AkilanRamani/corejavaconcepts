package playwrightjavaautomation;

import java.util.Base64;

public class EncodingInJava {

	public static void main(String[] args) {
		String originalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		//ncodes this String into a sequence of bytes using theplatform's default charset, storing the result into a new byte array. 
        System.out.println(encodedString);
        
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        
        System.out.println(decodedString);
        
        //UTF-8 is a character Encoding which will convert the characters into ASCII Values(unique decimal numbers) and into the binary Form (0s and 1s).
	}
	

}
