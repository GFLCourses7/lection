package proxy;

// Проксі для контролю доступу до Інтернету
class ProxyInternet implements Internet {
    private final RealInternet realInternet;
    private static final String[] restrictedSites = {"facebook.com", "twitter.com", "instagram.com"};

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) {
        boolean siteAllowed = true;
        for (String site : restrictedSites) {
            if (serverHost.equalsIgnoreCase(site)) {
                siteAllowed = false;
                break;
            }
        }
        if (siteAllowed) {
            realInternet.connectTo(serverHost);
        } else {
            System.out.println("Access denied to " + serverHost);
        }
    }
}