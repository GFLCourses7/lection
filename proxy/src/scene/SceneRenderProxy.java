package scene;

public class SceneRenderProxy implements Renderable {

    private SceneRenderService sceneRenderService;

    public SceneRenderProxy() {

    }

    @Override
    public void render(String sceneRenderParams) {

        if (sceneRenderService == null) {
            sceneRenderService = new SceneRenderService();
        }

        sceneRenderService.render(sceneRenderParams);
    }
}
