package corejavaconcepts;

public class StringSubSet {

	public static void main(String[] args) {
		String qualifiedName = "Akilan.";
		
		int last = qualifiedName.lastIndexOf(".");
		System.out.println(last);
		System.out.println(qualifiedName.substring(0, last)); //0,6
		int mid = qualifiedName.substring(0, last).lastIndexOf(".");
		System.out.println(mid);
		String className = qualifiedName.substring(mid + 1, last); //0,6 
		System.out.print(className);


	}

}
