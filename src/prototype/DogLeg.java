package prototype;

public class DogLeg {
  private int leg;

  public int getLeg() {
    return leg;
  }

  public void setLeg(int leg) {
    this.leg = leg;
  }

  @Override
  public String toString() {
    return "DogLeg [leg=" + leg + "]";
  }

}
