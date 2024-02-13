package proxy;

// Клієнтський код
public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        // Дозволені сайти
        internet.connectTo("example.com");
        internet.connectTo("google.com");

        // Заборонені сайти
        internet.connectTo("facebook.com");
        internet.connectTo("twitter.com");
        internet.connectTo("instagram.com");
    }
}