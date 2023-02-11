package prg11;

import java.io.File;
import java.util.Scanner;

public class Getfileinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String f;
		System.out.println("Enter the file name : ");//search for hello.txt
		f = sc.next();
		
		File f0 = new File(f);
			if (f0.exists()) {
				//Getting file name
				System.out.println("The name of the file is : " +f0.getName());
				
				//Getting path of the file 
				System.out.println("The absolute path of the file is : " +f0.getAbsolutePath());
				
				//Checking whether the file is writable or not 
				System.out.println("Is file writable ? : " +f0.canWrite());
				
				//Checking whether the file is readable or not 
				System.out.println("Is file readable ? : " + f0.canRead());
				
				//Getting the length of the file in bytes
				System.out.println("The size of the file in bytes is: " +f0.length());
			}
			else {
				System.out.println("The file does not exist.");
			}
	}
}