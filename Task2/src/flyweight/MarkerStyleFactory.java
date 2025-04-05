package Task2.src.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "-" + color + "-" + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(iconType, color, labelStyle));
            System.out.println("Created new MarkerStyle: " + key);
        }
        return styles.get(key);
    }
    public static int getTotalStyles() {
        return styles.size();
    }
}
