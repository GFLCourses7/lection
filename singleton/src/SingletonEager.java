
public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private String text;

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {

        return instance;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

}
