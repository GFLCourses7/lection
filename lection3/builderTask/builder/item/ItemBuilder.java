package builder.item;

public interface ItemBuilder<T>{
    void assembleItem();
    T getItem();
}
