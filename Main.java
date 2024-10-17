import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	Scanner scanner = new Scanner(System.in);
		PrintTheAnswer obj = new PrintTheAnswer();
		
		
		System.out.println("Choose what you want to enter: press s on your keyboard if you want to enter a name, press n if you want to enter a number, press a if you want to enter an array of integers" );
		String choice = scanner.nextLine();
		
		switch(choice){
		case "s":
		   System.out.println("Enter the name:");
		   String str = scanner.nextLine();
		   obj.PrintAnswer(str);
		   break;
		   
		case "n":
		    System.out.println("Enter the number");
		    int num = scanner.nextInt();
		    obj.PrintAnswer(num);
		    break;
		    
		case "a":
		    System.out.print("Enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        obj.PrintAnswer(array);
        break;
        
		default: System.out.println("Invalid input");
		break;
		}
	
	
	}
}


