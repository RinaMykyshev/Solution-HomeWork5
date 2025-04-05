package Task2.src.flyweight;
public class MapMarker {
    private final int x;
    private final int y;
    private final MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void draw() {
        style.applyStyle(x, y);
    }
}
