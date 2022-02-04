public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(7, 9);
        Point secondPoint = new Point(12,-3);

        System.out.println("The distance between the point (" + firstPoint.getX() + "," + firstPoint.getY() + ") "
                + "and (0,0) is: " + firstPoint.distance());

        System.out.println("The distance between the point (" + firstPoint.getX() + "," + firstPoint.getY() + ") "
                + "and (14,5) is: " + firstPoint.distance(14, 5));

        System.out.println("The distance between the point (" + firstPoint.getX() + "," + firstPoint.getY() + ") "
                + "and (" + secondPoint.getX() + "," + secondPoint.getY() + ") is: " + firstPoint.distance(secondPoint));



    }
}
