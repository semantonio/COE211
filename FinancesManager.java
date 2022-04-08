package Lab8;
import java.util.Scanner;
import java.io.*;
public class FinancesManager {
public static void main(String[] args) throws IOException{
	String answer;
	Scanner scan =  new Scanner(System.in);
	File file1 = new File("expenses.txt");
	FileWriter file = new FileWriter(file1, true);
	Scanner scanFromFile =  new Scanner(file1);
	do {
		
		System.out.print("Input your name: ");
		String name  =  scan.next();
		
		System.out.print("What did you purchase? ");
		String product =  scan.next();
		
		System.out.print("How much did you purchase? (in USD) ");
		double payment = scan.nextDouble();
		
		String str  = name + " purchased "+ product + " for " + payment + " USD Dollars.";
		file.write(str+"\n");
		
		System.out.println("would you like to log another purchase? (y/n)");
		answer = scan.next();
		
		}
		while(answer.equalsIgnoreCase("y"));
			
			file.close();
					
			System.out.print("Would you like to read a summary of your purchases? ");
			String sum = scan.next();
			

			if(sum.equalsIgnoreCase("y")) {
				
				while(scanFromFile.hasNext()){
				
					String line =  scanFromFile.nextLine();
					System.out.println(line);
				}
				
				
			}
}
}
