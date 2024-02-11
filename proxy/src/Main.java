import scene.Renderable;
import scene.SceneRenderProxy;

public class Main {

    public static void main(String[] args) {

        Renderable renderer = new SceneRenderProxy();

        // lazy initialization created with proxy

        System.out.println("Program moves on.");

        renderer.render("Rendered: Scene is completely blue!");

        System.out.println("load occurs only when scene is loaded, not when object is declared.");

        // Security
        // setRefreshRate, getLibLocation and getSceneId
        // are hidden from user by proxy

    }
}
