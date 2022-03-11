package Lab6;
import java.util.Scanner;
public class BasicCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int num1 = scan.nextInt();
		System.out.print("Input the operator: ");
		String operator=scan.next();
		System.out.print("Input the second number: ");
		int num2 = scan.nextInt();
		
		switch(operator) {
		case "+":
		int sum = num1+num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		break;
		case "-":
		int sub = num1-num2;
		System.out.println(num1 + "-" + num2 + "=" + sub);
		break;
		case "*":
		int multiplication = num1*num2;
		System.out.println(num1 + "*" + num2 + "=" + multiplication);
		break;
		case "/":
		 int num3=num1%num2;
	        if (num3==0){
	            System.out.println(num1+"/"+num2+"="+(num1/num2));
	        }
	        else { System.out.println(num1+"/"+num2+"="+((double) num1/num2));
	    }
	        break;
		}
}
}