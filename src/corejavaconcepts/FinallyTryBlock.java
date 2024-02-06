package corejavaconcepts;

public class FinallyTryBlock {

	public static void main(String[] args) {
		 try {    
			  
		        System.out.println("Inside the try block");  
		          
		        //below code throws divide by zero exception  
		       int data=25/0;    //Exception occurs here  
		       System.out.println(data);    
		      }    
		      //cannot handle Arithmetic type exception  
		      //can only accept Null Pointer type exception  
		      catch(ArithmeticException e){  
		    	e.printStackTrace();
		    	  
		        System.out.println("The given data is invalid");  
		      }   
		  
		      //executes regardless of exception occured or not   
		      finally {  
		        System.out.println("finally block is always executed");  
		      }    
		  
		      System.out.println("rest of the code...");    
		      }    

	}


