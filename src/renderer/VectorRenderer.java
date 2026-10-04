package renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.printf("Drawing a circle of radius %.2f as vector lines.%n", radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.printf("Drawing a square of side %.2f as vector vectors.%n", side);
    }
}