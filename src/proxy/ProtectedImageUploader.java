package src.proxy;

public class ProtectedImageUploader {
    private boolean isLoggedIn;

    public ProtectedImageUploader(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public void uploadImage(String filename) {
        if (isLoggedIn) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access denied. Please log in to upload images.");
        }
    }
}