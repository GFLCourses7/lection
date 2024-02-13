package builder;

public class Main {
    public static void main(String[] args) {
        // Використання класичного білдера зі статичним внутрішнім класом
        Product product = new Product.Builder()
                .setPart1("A")
                .setPart2("B")
                .setPart3(42)
                .build();

        // Використання білдера з використанням паттерна Fluent Interface
        FluentProduct fluentProduct = FluentProduct.createBuilder()
                .setPart1("A")
                .setPart2("B")
                .setPart3(42)
                .build();

        // Виведення результатів
        System.out.println("Product: " + product.getPart1() + ", " + product.getPart2() + ", " + product.getPart3());
        System.out.println("FluentProduct: " + fluentProduct.getPart1() + ", " + fluentProduct.getPart2() + ", " + fluentProduct.getPart3());
    }
}
