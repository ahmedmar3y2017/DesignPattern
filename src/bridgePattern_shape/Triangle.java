package bridgePattern_shape;

public class Triangle extends ShapeAbstraction {

  @Override
  public void draw() {

    System.out.println("This is Triangle Shape ");

  }

  @Override
  public void fillColor() {

    color.fillColor();
    System.out.println("Fill Triangle Color ");

  }

}
