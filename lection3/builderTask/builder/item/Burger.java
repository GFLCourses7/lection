package builder.item;

import components.*;

import java.util.List;
import java.util.Set;

public record Burger(BunType bunType, Patty patty, Cheese cheese, String salad, List<Vegetables> vegetables,
                     Set<Sauce> sauce,
                     Cheese doubleCheese,
                     Patty extraPatty) {
}
