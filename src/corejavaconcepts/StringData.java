package corejavaconcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class StringData {

	public static void main(String[] args) throws IOException {
	Path path = Paths.get(System.getProperty("user.dir")+ "/videos");
	Path p = Files.createDirectories(path);
	System.out.println(p.toAbsolutePath());
		
	String a= String.format("%s-%d.%s", "test" , System.currentTimeMillis(), "mp4" );
	System.out.println(a);
	String originalInput = "test input";
	String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	System.out.println(encodedString);
	byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
	String decodedString = new String(decodedBytes);
	System.out.println(decodedString);
	String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
	String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
	byte[] decodedBytes1 = Base64.getUrlDecoder().decode(encodedUrl);
	String decodedUrl = new String(decodedBytes1);
	System.out.println(decodedUrl);
	
}
	
}