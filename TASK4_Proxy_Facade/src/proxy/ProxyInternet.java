package proxy;

class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (serverHost.equals("blockedwebsite.com")) {
            throw new Exception("Access Denied. This website is blocked.");
        }
        realInternet.connectTo(serverHost);
    }
}