package June2023Q3;

import java.security.PrivilegedActionException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PrivilegedActionException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username : ");
            validateUsername(sc.nextLine());

            System.out.print("Enter Password : ");
            String password = sc.nextLine();
            validatePasswordLength(password);
            // validatePasswordLength(password); // This line was duplicated

            System.out.println("Username and Password are valid");
        } finally {
            sc.close();
        }
    }

	private static void validateUsername(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	private static void validatePasswordLength(String password) {
		// TODO Auto-generated method stub
		
	}

//    private static void validatePasswordLength(String password) throws PrivilegedActionException {
//        // TODO: Implement password length validation logic
//        // For example, check if the password length is greater than a certain value
//        if (password.length() < 8) {
//            throw new PrivilegedActionException("Password length must be at least 8 characters.");
//        }
//    }
//
//    private static void validateUsername(String username) throws PrivilegedActionException {
//        // TODO: Implement username validation logic
//        // For example, check if the username meets certain criteria
//        if (username.isEmpty()) {
//            throw new PrivilegedActionException("Username cannot be empty.");
//        }
//    }
//}
}