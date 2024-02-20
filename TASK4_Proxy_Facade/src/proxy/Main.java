package proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("example.com"); // Access granted
            internet.connectTo("blockedwebsite.com"); // Access denied
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}