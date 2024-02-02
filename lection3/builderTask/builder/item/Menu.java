package builder.item;

import components.Drink;
import components.Fries;

public record Menu(Burger burger, Fries fries, Drink drink, Boolean toy) {
}
