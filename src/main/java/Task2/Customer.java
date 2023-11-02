package Task2;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public static class ProductException extends RuntimeException{
        public ProductException(String message){
            super(message);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
