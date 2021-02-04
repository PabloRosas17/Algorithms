package Interview;

import java.util.Scanner;

public class InterviewDriver {
	InterviewDriver(){
		System.out.println("InterviewDriver()");
	}

	public void fireTestScanner(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Test Scanner, Enter something: ");
		String temp = scanner.nextLine();
		System.out.println("You've entered: " + temp);
		scanner.close();
	}
}