package Task1.src.proxy;

public class RealImage implements Image {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading full image from disk: " + filename);
    }
    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail of: " + filename);
    }
    @Override
    public void displayFullImage() {
        System.out.println("Displaying FULL image: " + filename);
    }
}
