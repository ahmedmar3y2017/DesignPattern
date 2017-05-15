package FacadePattern;

public class ShapeMaker {

  Shape circle;
  Shape triangle;

  ShapeMaker() {

    this.circle = new Circle();
    this.triangle = new Triangle();

  }

  public void DrawCircle() {
    circle.Draw();
  }

  public void DrawTriangle() {
    triangle.Draw();
  }

}
