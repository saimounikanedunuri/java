// Java program to demonstrate NumberFormatException 
class NumberFormat_Demo 
{ 
	public static void main(String args[]) 
	{ 
		try { 
			// "akki" is not a number 
			int num = Integer.parseInt ("akki") ; 

			System.out.println(num); 
		} catch(NumberFormatException e) { 
			System.out.println("Number format exception"); 
		} 
	} 
} 
//Number format exception
