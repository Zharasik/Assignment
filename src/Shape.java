public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        int numPoints = points.length;
//comment.
        for (int i = 0; i < numPoints; i++) {
            Point cPoint = points[i];
            Point nextPoint = points[(i + 1) % numPoints];

            perimeter += cPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }
    public double longestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double cDistance = points[i].distanceTo(points[j]);
                if (cDistance > longestSide) {
                    longestSide = cDistance;
                }
            }
        }

        return longestSide;
    }
    public double averageSide() {
        double total = 0;

        for (int i = 0; i < points.length; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % points.length]; // Loop back to the first point
            total += currentPoint.distanceTo(nextPoint);
        }

        return total / points.length;
    }
}