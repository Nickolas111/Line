package lesson02.homework.Line;

public class Line {
	private final Point firstPoint;
    private final Point lastPoint;

    public Line(Point firstPoint, Point lastPoint) {
        this.firstPoint = firstPoint;
        this.lastPoint = lastPoint;
    }
    public double length (){
        return Math.sqrt(Math.pow(lastPoint.getX()-firstPoint.getX(),2)+Math.pow(lastPoint.getY()-firstPoint.getY(),2));
    }
    @Override
    public String toString() {
        return "Line{" +
                "firstPoint=" + firstPoint +
                ", lastPoint=" + lastPoint +
                '}';
    }
}
