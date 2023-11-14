package June2023Q3;

public class MainApp {
	
	private static void validateUsername(String username) throws InvalidUserName{
		if(username.length()<6) {
			throw new InvalidUserName("The User Name is not correct please re-enter correctly");
		}
	}
	
	private static void validatePasswordLength(String password) throws InvalidPasswordLength {
		if(password.length() < 8) {
			throw new InvalidPasswordLength("The User's Password is incorrect please re-enter corrrectly");
		}
	}

	private static void validatePassword(String password) throws InvalidPasswordLength, InvalidPassword{
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		
		for(char c : password.toCharArray()) {
			if(Character.isUpperCase(c)) {
				hasUpperCase = true;
			}
			else if (Character.isLowerCase(c)) {
				hasLowerCase = true;
			}
			else if(Character.isDigit(c)) {
				hasDigit = true;
			}
		}
		
		if(!hasUpperCase || !hasLowerCase || hasDigit ) {
			
			throw new InvalidPassword("The Password must be at-least one upper case letter or one lowecase letter or one digit");
		}
		
	
	}
	
}
