package word;
//here we cretaed package as word which that organizes a set of related classes and interfaces.
public class Name {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		String Str = new String("I-Love-my-Mom");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.
	      System.out.println("Output Value :" );      
	      //Applying for each loop
	      //The string split() method breaks a given string around matches of the given regular expression.
	      for (String retval: Str.split("-")) {
	         System.out.println(retval);
	       //system : is a class in java language pacakge.
	         //out : static member of the system class.
			//println : to print what is message.
	      }
	      	//Creating another string 
	         String Str1 = new String("I-L-o-v-e-m-y-m-o-m");
	         System.out.println("Output value:");
	       //system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is message.
	         //Applying for each loop
	         for(String s:Str1.split("-")){
//
	        	 System.out.println(s);
	        	//system : is a class in java language pacakge.
	 			//out : static member of the system class.
	 			//println : to print what is message.
	         }
	      }
	   
	}


