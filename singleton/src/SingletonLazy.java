
public class SingletonLazy {

    private static SingletonLazy instance;

    private String text;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {

        if (instance == null)
            instance = new SingletonLazy();

        return instance;
    }



    public void setText(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

}
