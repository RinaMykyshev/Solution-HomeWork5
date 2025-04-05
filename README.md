Flyweight Pattern — Map Marker Optimization
 Project Overview
This project demonstrates the Flyweight Design Pattern through a real-world scenario: a map application that needs to render thousands of location markers such as gas stations, restaurants, and hospitals.

Since many markers share the same visual style (icon type, color, label style), we avoid redundant memory usage by sharing those styles using the Flyweight pattern.

Instead of creating duplicate style data for every marker, we share them using a factory (MarkerStyleFactory) that creates and reuses existing style objects (MarkerStyle).
This dramatically reduces memory usage and improves scalability when rendering a large number of objects.

🏗 Structure
MarkerStyle.java — Flyweight class storing shared marker styles.

MarkerStyleFactory.java — Factory class that manages and reuses style instances.

MapMarker.java — Context class storing coordinates and referencing a shared style.

Main.java — Entry point that creates and draws 10,000 markers, logging memory savings and stats.

 How to Run
Clone or download the project.

Open a terminal and navigate to the src directory.

Compile the code:

nginx
Копировать
Редактировать
javac flyweight/*.java
Run the program:

nginx
Копировать
Редактировать
java flyweight.Main
 Output Summary
The program will:

Create 10,000 map markers.

Share styles between markers using the Flyweight pattern.

Print how many unique style objects were created.

Print estimated memory usage with and without the pattern.

Show the savings achieved using Flyweight.

💡 Benefits
✅ Efficient memory usage
✅ Improved performance for rendering large datasets
✅ Easy to extend with new marker types or styles
