import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) throws IOException {

        List<Point> pointsList = readPointsFromFile();


        Point[] points = pointsList.toArray(new Point[0]);


        Shape shape = new Shape(points);


        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("longestSide: " + shape.longestSide());
        System.out.println("averageSide: " + shape.averageSide());
    }

    private static List<Point> readPointsFromFile() throws IOException {
        List<Point> points = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] coordinates = line.split(" ");
                double x = Double.parseDouble(coordinates[0]);
                double y = Double.parseDouble(coordinates[1]);
                points.add(new Point(x, y));
            }
        }

        return points;
    }
}
