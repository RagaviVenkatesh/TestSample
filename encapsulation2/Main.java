package encapsulation2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		int pin = sc.nextInt();
		
		bank.setBranchCity(city);
		bank.setBranchName(name);
		bank.setBranchPin(pin);
		
		System.out.println("Bank Name: "+bank.getBranchName());
		System.out.println("Branch city: "+bank.getBranchCity());
		System.out.println("Pincode: "+bank.getBranchPin());
	}

}
