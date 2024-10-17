
public class PrintTheAnswer {

	public void PrintAnswer(int num) {
		 if(num > 7) System.out.print("Hello!");
		 else System.out.println("The number should be greater than 7");
		}
	
	public void PrintAnswer(String name) {
		 //if(name = "John") {
		 //    System.out.print("Hello, John");
		 //}
		 //else System.out.println("There is no such name");
		 switch(name){
		     case "John":System.out.print("Hello, John");
		         break;
		     default: System.out.println("There is no such name");
		         break;
		         
		 }
		}
	
	public void PrintAnswer(int[] array) {
	     System.out.println("New array:");
		 for(int i = 0; i < array.length; i++) {
			 array[i] *= 3;
			 System.out.println(array[i]);
	   }
	   }
}