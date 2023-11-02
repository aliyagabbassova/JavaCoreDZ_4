package Task2;

public class Product {
    String nomination;
    int cost;

    public Product(String nomination, int cost) {
        this.nomination = nomination;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nomination='" + nomination + '\'' +
                ", cost=" + cost +
                '}';
    }

}
