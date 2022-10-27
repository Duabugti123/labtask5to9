import java.util.Scanner;
public class Email {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] twodArray = new String[5][2]; 
// declared and created array object
		System.out.println("Please enter the emails and password be added");
		Scanner sc= new Scanner(System.in);	
 //System.in is a standard input stream  
		for(int i = 0 ; i < 5 ; i++){
		for(int j = 0 ; j < 2; j++)
		{
			if(j==0) {
				System.out.print("Enter an email: ");  
				String str= sc.nextLine();     
			twodArray[i][j] = str;
			}
			else {
				System.out.print("Enter a password: ");  
				String str= sc.nextLine();     
			twodArray[i][j] = str;
			}
			
		}
		System.out.println();
		}
		System.out.println("Your entered");
		for(int i = 0 ; i < 5 ; i++){
		for(int j = 0 ; j < 2; j++)
		{
		if(j==0) {
			System.out.print("Email: " + twodArray[i][j]);
		}
		else {
			System.out.print(" Password: " + twodArray[i][j]);
		}
		}
		System.out.println();
	}
	}
}
