package src;
import src.proxy.Image;
import src.proxy.ProxyImage;
import src.proxy.ProtectedImageUploader;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Viewing Image ---");
        Image img = new ProxyImage("house1.jpg");
        img.displayThumbnail();
        img.displayFullImage();

        System.out.println("\n--- Upload Access ---");
        ProtectedImageUploader uploader = new ProtectedImageUploader(false);
        uploader.uploadImage("newHouse.jpg");

        uploader = new ProtectedImageUploader(true);
        uploader.uploadImage("newHouse.jpg");
    }
}
