package Task1;

public class Main {

    public static void main(String[] args) throws Task1.WrongLoginException, Task1.WrongPasswordException {

        Task1 task1 = new Task1();
        task1.CreateProtection("245454878451", "1234554545454545454555454564", "12345");
        System.out.println();
    }
}