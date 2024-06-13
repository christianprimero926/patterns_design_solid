package course.udemy.exercises.solid.lsp;

public class Point3D extends Point2D {
    private final int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }


    public double distance(Point3D other) {
        int distX = x - other.x;
        int distY = y - other.y;
        int distZ = z - other.z;
        return Math.sqrt( distX * distX + distY * distY + distZ * distZ);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point3D other))
            return false;
        return x == other.x && y == other.y && z == other.z;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + x + ", y=" + y + ", z = " + z + "]";
    }
}
