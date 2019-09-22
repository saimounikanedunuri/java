class XYZ{  
   final void demo(){
      System.out.println("XYZ Class Method");
   }  
}  
	     
class Main extends XYZ{  
   public static void main(String args[]){  
      Main obj= new Main();  
      obj.demo();  
   }  
}
/*
output:
XYZ Class Method
*/
