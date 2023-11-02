package Task2;

public class Order {

        Customer customer;
        Product product;
        int amount;

        public Order(Customer customer, Product product, int amount) {
            this.customer = customer;
            this.product = product;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "customer=" + customer +
                    ", product=" + product +
                    ", amount=" + amount +
                    '}';
        }
    }


