public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
//comment.x
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
