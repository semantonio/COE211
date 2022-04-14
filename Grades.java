import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int[] array = new int[5];
	int sum = 0;

	System.out.print("Input the number of attended labs (out of 7): ");
	int labs = scan.nextInt();
	
	System.out.print("Input the midterm grade: ");
	int mid = scan.nextInt();
	
    for(int i = 0; i <5; i++) {
		System.out.print("Input the grade of the assignment " + (i+1) +" : ");
		int nbOfAssignment = scan.nextInt();
		array[i] = nbOfAssignment;
	}

	for(int i = 0; i<5; i++)
	{
	sum = sum + array[i];
	}

	double gradesAverage = ((double)sum/5)*0.3 , attendance = (labs/7)*5 , midterm = 0.3*mid;
	
	System.out.println("Assignment (30%): " + (int)gradesAverage + "%.");
	System.out.println("Attendance (5%): " + (int) attendance + "%.");
	System.out.println("Midterm (30%): " + (int) midterm + "%.");
	scan.close();
    
int total= (int) (gradesAverage + attendance + midterm) ;

if(total>65)
System.out.println("You already passed the course no matter what you get in the final exam. \nWell done!");
else System.out.println("You need to get "+ ((65-total)*100/35) + "/100 in the final in order to pass ths course. \nGood luck!");

}
}
