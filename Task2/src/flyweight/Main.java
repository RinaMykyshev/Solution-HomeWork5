package Task2.src.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        String[] types = {"GasStation", "Restaurant", "Hospital"};
        String[] colors = {"Red", "Blue", "Green"};
        String[] labels = {"Small", "Medium", "Large"};

        Random rnd = new Random();
        int totalMarkers = 10_000;

        for (int i = 0; i < totalMarkers; i++) {
            String type = types[rnd.nextInt(types.length)];
            String color = colors[rnd.nextInt(colors.length)];
            String label = labels[rnd.nextInt(labels.length)];

            MarkerStyle style = MarkerStyleFactory.getStyle(type, color, label);
            MapMarker marker = new MapMarker(rnd.nextInt(500), rnd.nextInt(500), style);
            markers.add(marker);
        }

        System.out.println("\n--- Drawing first 5 markers ---");
        for (int i = 0; i < 5; i++) {
            markers.get(i).draw();
        }

        int uniqueStyles = MarkerStyleFactory.getTotalStyles();
        System.out.println("\nTotal markers created: " + totalMarkers);
        System.out.println("Unique MarkerStyle objects: " + uniqueStyles);

        int sizeOfStyle = 30;
        int sizeOfExtrinsic = 16;
        int naiveMemory = totalMarkers * sizeOfStyle;
        int flyweightMemory = uniqueStyles * sizeOfStyle + totalMarkers * sizeOfExtrinsic;

        System.out.println("\nMemory without Flyweight: " + naiveMemory + " bytes");
        System.out.println("Memory with Flyweight:    " + flyweightMemory + " bytes");
        System.out.printf("Savings: %d bytes%n", naiveMemory - flyweightMemory);
    }
}
