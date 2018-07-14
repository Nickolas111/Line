package lesson02.homework.Line;

public final class LineRunner {
	public static void main(String[] args) {
		Point a = new Point(1, 1);
        Point b = new Point(4,8);
        Line ab = new Line(a,b);

        System.out.println(ab);
        System.out.println("Length ab is "+ab.length());

        Lines lines = new Lines();
        lines.addLine(ab);
        System.out.println();
        lines.addLine(new Line(new Point(-5,4), new Point(0,6)));
        lines.addLine(new Line(new Point(4,5), new Point(2, -6)));

        System.out.println(lines);
        System.out.println("Sum of lengths is "+lines.sumLength());
        System.out.println("Longest line is "+lines.longestLine());
    }
}
