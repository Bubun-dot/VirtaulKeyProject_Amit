package solution;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
import java.util.List;



public class FileOperations {
	
	
	//create add file method
	
	public static void addFile() throws IOException {
		
		System.out.println("Enter fine name to be created\n");
		Scanner sc = new Scanner(System.in);
		String fileName =sc.nextLine(); // store file names
		
		File f1 = new File(Driver.dirname, fileName);
		
			if(f1.createNewFile())
				System.out.println("\nFile is Created\n");
			
			else 
				System.out.println("\nFile is not Created\n ");
			
				}
	
	//Create Delete file method
	

	public static void deleteFile() throws IOException {
		
		System.out.println("Enter File to be deleted\n");
		Scanner sc = new Scanner(System.in);
		String fileName =sc.nextLine();
		
		File f1 = new File(Driver.dirname, fileName);
		//First check if the file exits
		
		if(f1.exists())
		
		{
			if(f1.delete())
				
						
				System.out.println("\nFile is deleted\n");
			else {
				System.out.println("\nFile is not deleted\n");
		
			}
		}
		
		
		//if the file does not exit in the list
		else
		System.out.println("File does not exist");
		
					
	}
		
		
			
//Search file Name	
	
public static void searchFile() throws IOException {
		
		System.out.println("Enter File to be searched\n");
		Scanner sc = new Scanner(System.in);
		String fileName =sc.nextLine();
		
		File f1 = new File(Driver.dirname, fileName);
		
		//f1.getName()		
		
		
		
		if(f1.exists())
			
			System.out.println("\nFile is Found\n");
		else {
			System.out.println("\nFile is not Found\n");
			
		
			}
		}
}
	
	