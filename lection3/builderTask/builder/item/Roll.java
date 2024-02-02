package builder.item;

import components.*;

import java.util.List;
import java.util.Set;

public record Roll(BunType bunType, Patty patty, String salad, List<Vegetables> vegetables, Set<Sauce> sauces,
                   Cheese cheese) {
}
