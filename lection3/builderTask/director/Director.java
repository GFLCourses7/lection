package director;

import builder.item.ItemBuilder;

public class Director {
    public void createItem(ItemBuilder<?> itemBuilder) {
        itemBuilder.assembleItem();
    }
}
