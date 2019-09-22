final class XYZ{  
}  
	     
class ABC extends XYZ{  
   void demo(){
      System.out.println("My Method");
   }  
   public static void main(String args[]){  
      ABC obj= new ABC(); 
      obj.demo();
   }  
}
/* output:
error: cannot inherit from final XYZ
class Main extends XYZ{  
                   ^
1 error
*/
