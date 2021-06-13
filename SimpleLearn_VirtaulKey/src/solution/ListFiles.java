package solution;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListFiles {
	
	public static void listFiles() throws IOException {
		
		
		File ff = new File(Driver.dirname);
		File[]f1 = ff.listFiles();
		List<File> filesList = Arrays.asList(f1);
		List<String> filesListNames = new ArrayList<>();
		
		
		Collections.sort(filesList);
		
		System.out.println("\n All the files are listed in below: \n");
		if(f1!=null && f1.length > 0) 
			{
			for(File file : filesList) {
				filesListNames.add(file.getName());
			}
			filesListNames.stream().forEach(System.out::println);
			}
			else 
			{
				System.out.println("\n The File List is empty \n");
				
			}
			
		}
		
		
	}


