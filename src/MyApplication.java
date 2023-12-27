import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\acer\\IdeaProjects\\Zhass\\src\\coordinates";
        try {
            List<Point> pointsList = readPointsFromFile(filePath);

            Point[] points = pointsList.toArray(new Point[0]);


            Shape shape = new Shape(points);


            System.out.println("perimeter: " + shape.perimeter());
            System.out.println("longestSide: " + shape.longestSide());
            System.out.println("averageSide: " + shape.averageSide());
        } catch (IOException e) {
            System.err.println("error file: " + e.getMessage());
        }
    }

    private static List<Point> readPointsFromFile(String filePath) throws IOException {
        List<Point> points = new ArrayList<>();

        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            String[] coordinates = line.split(" ");
            double x = Double.parseDouble(coordinates[0]);
            double y = Double.parseDouble(coordinates[1]);
            points.add(new Point(x, y));
        }

        return points;
    }
}
