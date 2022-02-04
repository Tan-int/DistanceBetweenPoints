public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Calculates the distance between this point and the point (0,0)
    public double distance() {
        return Math.sqrt((Math.pow(this.x, 2) + (Math.pow(this.y, 2))));
    }

    //Calculates the distance between this point and any point passed through as parameters
    public double distance(int x, int y) {
        return Math.sqrt((Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)));
    }

    //Calculates the distance between this point and another point object
    public double distance(Point point) {
        return Math.sqrt((Math.pow(point.x - getX(), 2)) + (Math.pow(point.y - getY(), 2)));
    }

    //Setters and Getters below
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
