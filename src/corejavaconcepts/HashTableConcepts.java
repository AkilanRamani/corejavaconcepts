package corejavaconcepts;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {
		
		List<Hashtable<Integer,String>> list = new ArrayList<Hashtable<Integer,String>> ();
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		 
	   
		  
		 
		  System.out.println(hm);
		   
		 /* for(Entry<Integer, String> m:hm.entrySet()){   // Entry set will return the map that is key value pair in a set view.
		   System.out.println(m.getKey()+" "+m.getValue());  */ 
		  }  
		 }  

	


