package Task1.src;
import Task1.src.proxy.Image;
import Task1.src.proxy.ProxyImage;
import Task1.src.proxy.ProtectedImageUploader;

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
