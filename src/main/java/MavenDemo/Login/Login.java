package MavenDemo.Login;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username");
        String uname = sc.nextLine();
        System.out.println("Enter the Password");
        String upass = sc.nextLine();
        System.out.println("Welcome "+uname+" you have Logged-in Successfully");
	}
}
