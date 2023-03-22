package ch18.lecture.p03inputstream;

import java.io.*;

public class C03InputStream {
	public static void main(String[] args) {
		String name = "output/output7.txt"; // 28 bytes
		try (var is = new FileInputStream(name)) {
			
			byte[] arr = new byte[5];
			
			int len1 = is.read(arr); // 5
			int len2 = is.read(arr); // 5
			int len3 = is.read(arr); // 2
			int len4 = is.read(arr); // -1
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
