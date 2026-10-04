package renderer;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.printf("Drawing a circle of radius %.2f as pixels (raster).%n", radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.printf("Drawing a square of side %.2f as pixels (raster).%n", side);
    }
}