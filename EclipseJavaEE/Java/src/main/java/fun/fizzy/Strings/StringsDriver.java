package fun.fizzy.Strings;

import java.util.Scanner;

public class StringsDriver{
	StringsDriver(){
		System.out.println("StringsDriver()");
	}
	
	public void fireTestScanner(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Test Scanner, Enter something: ");
		String temp = scanner.nextLine();
		System.out.println("You've entered: " + temp);
		scanner.close();
	}
}
