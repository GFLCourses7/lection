package scene;

public class SceneRenderService implements Renderable {

    public SceneRenderService() {
        // Long load from disc
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setRefreshRate(long rate) {
        System.out.println("Refresh rate set to " + rate);
    }

    public String getLibLocation() {
        return "C:\\...\\lib\\";
    }

    public String getSceneId() {
        return "8590476650267785";
    }

    @Override
    public void render(String sceneRenderParams) {
        System.out.println(sceneRenderParams);
    }
}
