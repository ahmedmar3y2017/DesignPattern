package bridgePattern_shape;

public class Circle extends ShapeAbstraction {

  @Override
  public void draw() {

    System.out.println("This is Circle Shape ");

  }

  @Override
  public void fillColor() {

    color.fillColor();
    System.out.println("Fill Circle Color ");

  }

}
