package proxy;

// Реальна реалізація доступу до Інтернету
class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}