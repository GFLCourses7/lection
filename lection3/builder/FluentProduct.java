package builder;

public class FluentProduct {
    private String part1;
    private String part2;
    private int part3;

    private FluentProduct() {}

    public static FluentProduct.Builder createBuilder() {
        return new FluentProduct().new Builder();
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
    public class Builder {
        private Builder() {}

        public Builder setPart1(String part1) {
            FluentProduct.this.part1 = part1;
            return this;
        }

        public Builder setPart2(String part2) {
            FluentProduct.this.part2 = part2;
            return this;
        }

        public Builder setPart3(int part3) {
            FluentProduct.this.part3 = part3;
            return this;
        }

        public FluentProduct build() {
            return FluentProduct.this;
        }
    }
}