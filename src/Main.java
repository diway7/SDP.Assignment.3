import renderer.RasterRenderer;
import renderer.Renderer;
import renderer.VectorRenderer;
import shape.Circle;
import shape.Shape;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0f);
        Shape square = new Square(rasterRenderer, 10.0f);

        System.out.println("--- Initial Rendering ---");
        circle.draw();
        square.draw();

        System.out.println("\n--- Dynamic Switching of Implementations ---");
        circle.setRenderer(rasterRenderer);
        square.setRenderer(vectorRenderer);

        circle.draw();
        square.draw();
    }
}