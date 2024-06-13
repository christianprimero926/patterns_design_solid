package course.udemy.exercises.solid.lsp;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Point2D {
    protected final int x;
    protected final int y;

    public double distance(Point2D other) {
        int distX = x - other.x;
        int distY = y - other.y;
        return Math.sqrt( distX * distX + distY * distY);
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }
}
