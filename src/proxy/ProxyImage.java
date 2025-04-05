package src.proxy;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }
    @Override
    public void displayThumbnail() {
        System.out.println("Displaying cached thumbnail of: " + filename);
    }
    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}