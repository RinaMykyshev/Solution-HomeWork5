package Task2.src.flyweight;

public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void applyStyle(int x, int y) {
        System.out.printf("Drawing '%s' icon at (%d,%d) with color=%s, labelStyle=%s%n",
                iconType, x, y, color, labelStyle);
    }
}