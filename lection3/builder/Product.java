package builder;

public class Product {
    private String part1;
    private String part2;
    private int part3;

    // Конструктор класу Product
    private Product(String part1, String part2, int part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    public String getPart1() {
        return part1;
    }

    public String getPart2() {
        return part2;
    }

    public int getPart3() {
        return part3;
    }

    // Внутрішній клас білдера
    public static class Builder {
        private String part1;
        private String part2;
        private int part3;

        public Builder setPart1(String part1) {
            this.part1 = part1;
            return this;
        }

        public Builder setPart2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Builder setPart3(int part3) {
            this.part3 = part3;
            return this;
        }

        public Product build() {
            return new Product(part1, part2, part3);
        }
    }
}
