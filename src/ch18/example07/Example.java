package ch18.example07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		String filePath = "src/ch18/example07/Example.java";
		
		try( 
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);) {
			
			int rowNumber = 1;
			String rowData;
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(rowNumber + ": " + str);
				rowNumber++;
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
