import server.ImageSendingFacade;

public class Main {

    public static void main(String[] args) {

        ImageSendingFacade imageSendingFacade = new ImageSendingFacade();
        imageSendingFacade.sendImageToServer("C:\\...\\images\\photo_01.png", "https://example.com/db");

    }

}
