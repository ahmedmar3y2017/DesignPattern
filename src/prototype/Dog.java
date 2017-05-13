package prototype;

public class Dog implements Animal {

  private String name;
  private String color;
  private DogEyes dogEyes;
  private DogLeg dogLeg;

  public Dog(String name, String color, DogEyes dogEyes, DogLeg dogLeg) {
    super();
    this.name = name;
    this.color = color;
    this.dogEyes = dogEyes;
    this.dogLeg = dogLeg;
  }

  @Override
  public String toString() {
    System.out.println(" ///////////////////////");
    return "Dog [name=" + name + ", color=" + color + ", dogEyes=" + dogEyes + ", dogLeg=" + dogLeg
        + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DogEyes getDogEyes() {
    return dogEyes;
  }

  public void setDogEyes(DogEyes dogEyes) {
    this.dogEyes = dogEyes;
  }

  public DogLeg getDogLeg() {
    return dogLeg;
  }

  public void setDogLeg(DogLeg dogLeg) {
    this.dogLeg = dogLeg;
  }

  public Animal clone() {

    Dog dog = null;
    try {
      dog = (Dog) super.clone();
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return null;
  }

}
