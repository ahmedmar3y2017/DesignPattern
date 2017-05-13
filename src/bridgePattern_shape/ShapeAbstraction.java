package bridgePattern_shape;

public abstract class ShapeAbstraction {

  public colorImplementor color;

  public colorImplementor getColor() {
    return color;
  }

  public void setColor(colorImplementor color) {
    this.color = color;
  }

  public abstract void draw();

  public abstract void fillColor();

}
