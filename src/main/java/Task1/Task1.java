package Task1;

public class Task1 {
    String login;
    String password;
    String confirmPassword;


    public void CreateProtection(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length()> 20) {
            throw new WrongLoginException("Login length should be less than 20");
        }

            if (password.length() > 20)
                throw new WrongPasswordException("password should  less than 20");


            if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password and confirmPassword should be equal");
        }

    }

    class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }

    class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }

}
