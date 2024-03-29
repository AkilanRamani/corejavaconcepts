package corejavaconcepts;


import java.util.Random;

public class RandomStringGeneration {
	
	
	public static void main(String[] args) {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength); // 10
	    for (int i = 0; i < targetStringLength; i++) { //i<10;
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1)); //0.9 * 26
	      char c =  (char) randomLimitedInt; //98
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();

	    System.out.println(generatedString);

}
}