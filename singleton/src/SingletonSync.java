
public class SingletonSync {

    private static SingletonSync instance;

    private String text;

    private SingletonSync() {

    }

    public static synchronized SingletonSync getInstance() {

        if (instance == null)
            instance = new SingletonSync();

        return instance;
    }



    public void setText(String text) {

        this.text = text;
    }

    public String getText() {

        return text;
    }

}
