package solution;

import java.io.IOException;
import java.util.Scanner;


public class UserInterface {
	
	//Declaring the Main Menu...
	
	public static void mainMenu() 	throws IOException {
		
		 System.out.println("MAIN MENU\n");
		 System.out.println("1. List the files\n");
		 System.out.println("2. File Operation\n");
		 System.out.println("3. Exit\n");
		 System.out.println("Select the option: \n");
			
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
			
			switch(option ) {
			
			case 1: ListFiles.listFiles();
			System.out.println("\n Back to Menu \n");
			mainMenu();
			break;
			
			case 2: menu2();
			break;
			
			case 3: 
			break;
			
					
			default: System.out.println("Invalid option entered; Return to main menu");
			mainMenu();
			break;
			
			}
		
					
		}

	//Declaring the Sub Menu	

	public static void menu2() 	throws IOException {
	
	 System.out.println("File Operations\n");
	 System.out.println("1. Add File\n");
	 System.out.println("2. Delete File\n");
	 System.out.println("3. Search File\n");
	 System.out.println("4. Back to Main Menu\n");
	 System.out.println("Select an Option: \n");
	 
	 
		
	
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	
		
		switch(option ) {
		
		case 1: FileOperations.addFile();
		menu2();
		break;
		
		case 2: FileOperations.deleteFile();
		menu2();
		break;
		
		case 3: FileOperations.searchFile();
		menu2();
		break;
		
		case 4: mainMenu();
		break;
		
		default: System.out.println("Wrong Option");
		menu2();
		break;
		
		}
	
			
	
	}

	
	
	

}
