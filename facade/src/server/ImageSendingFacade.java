package server;

import connection.ServerConnectionService;
import file.FileService;
import image.ImageCompressionService;

public class ImageSendingFacade {

    public void sendImageToServer(String pathToImage, String url) {

        FileService fileService = new FileService();
        byte[] image = fileService.loadFile(pathToImage);

        ImageCompressionService imageCompressionService = new ImageCompressionService();
        image = imageCompressionService.compressImage(image);

        ServerConnectionService serverConnectionService = new ServerConnectionService(url);
        serverConnectionService.sendImageToServer(image);

    }

}
