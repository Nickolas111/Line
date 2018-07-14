package lesson02.homework.Line;

import java.util.ArrayList;

public class Lines {
	private final ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double sumLength() {
        double sum = 0;
        for (Line line : lines) {
            sum += line.length();
        }
        return sum;
    }

    public Line longestLine() {
        Line longestline = lines.get(0);
        for (Line line : lines) {
            if (line.length() > longestline.length()) {
                longestline = line;
            }
        }
        return longestline;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}
