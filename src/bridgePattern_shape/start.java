package bridgePattern_shape;

public class start {

  public static void main(String[] args) {

    ShapeAbstraction shapeAbstraction = new Circle();
    shapeAbstraction.draw();
    shapeAbstraction.setColor(new GreenColor());

    shapeAbstraction.fillColor();

    // ---------------------------------------------
    System.out.println("---------------------------------------");
    ShapeAbstraction shapeAbstraction2 = new Triangle();
    shapeAbstraction2.draw();
    shapeAbstraction2.setColor(new BlueColor());
    shapeAbstraction2.fillColor();

  }

}
