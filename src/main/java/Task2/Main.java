package Task2;

public class Main {

        public static void main(String[] args) {
            Object[][] objects = {
                    {customer[0], products[0], 1},
                    {customer[1], products[1], -1},
                    {customer[0], products[2], 150},
                    {customer[1], new Product("Сникерс", 10), 1},
                    {new Customer("Иван"), products[0], 1},

            };

            int capacity = 0;
            int i = 0;
            while (capacity != orders.length - 1 || i != objects.length) {
                try {
                    orders[capacity] = buy((Customer) objects[i][0], (Product) objects[i][1], (int) objects[i][2]);
                    capacity++;
                } catch (WrongProductException wrongProductException) {
                    wrongProductException.printStackTrace();
                } catch (WrongAmountException wrongAmountException) {
                    orders[capacity++] = buy((Customer) objects[i][0], (Product) objects[i][1], 1);
                } catch (WrongCustomerException wrongCustomerExeption) {
                    throw new RuntimeException(wrongCustomerExeption);
                } finally {
                    System.out.println("Order made: " + capacity);
                }
                i++;
            }
        }


        private final static Customer[] customer = {
                new Customer("Петр"),
                new Customer("Иван"),
        };

        private final static Product[] products = {
                new Product("Snickers", 100),
                new Product("Mars", 120),
                new Product("Аленка", 140),
                new Product("Bounty", 150),
                new Product("Twix", 190)
        };

        private static Order[] orders = new Order[5];


        private static boolean isInArray(Object[] array, Object o) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(o)) {
                    return true;
                }

            }
            return true;
        }

        public static Order buy(Customer who, Product what, int howMuch) {
            if (!isInArray(customer, who)) {
                throw new WrongCustomerException("Нет покупателя" + who);
            }
            if (!isInArray(products, what)) {
                throw new WrongProductException("Нет продукта" + what);
            }
            if (howMuch < 0 || howMuch > 100) {
                throw new WrongAmountException("Нет суммы" + howMuch);
            }
            return new Order(who, what, howMuch);
        }

        public static class WrongAmountException extends RuntimeException {
            public WrongAmountException(String message) {
                super(message);
            }
        }

        public static class WrongCustomerException extends RuntimeException {
            public WrongCustomerException(String message) {
                super(message);
            }
        }

        public static  class WrongProductException extends RuntimeException{
            public  WrongProductException(String message){
                super(message);
            }
        }
    }





