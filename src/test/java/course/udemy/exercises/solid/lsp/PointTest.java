package course.udemy.exercises.solid.lsp;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private final Point2D reference = new Point2D(3, 5);
    private final List<Point2D> test_point = Arrays.asList(
            new Point2D(2, 3),
            new Point2D(3, 5),
            new Point2D(4, 3)
          //  new Point3D(3, 5, 1)
    );


    @Test
    void test_equal_if_only_if_distance_0() {

        for (Point2D point : test_point) {
            assertEquals(point.equals(reference), point.distance(reference) == 0, "test para " + reference + " y " + point);
        }
    }

}