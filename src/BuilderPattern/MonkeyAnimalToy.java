package BuilderPattern;

public class MonkeyAnimalToy extends AnimalToyBuilder {

  @Override
  public void setAnimalName() {

    getAnimalToy().setAnimalName("Monkey");

    System.out.println("Monkey name ....");

  }

  @Override
  public void BuildAnimalHead() {

    getAnimalToy().setAnimalHead("Monkey Head ...");
    System.out.println("Monkey Head ....");

  }

  @Override
  public void BuildAnimalBody() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("Monkey body");

    System.out.println("Monkey Body ....");
  }

  @Override
  public void BuildAnimalLeg() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("Monkey Leg");

    System.out.println("Monkey Leg ....");
  }

  @Override
  public void BuildAnimalArm() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("Monkey Arm");

    System.out.println("Monkey Arm ....");
  }

  @Override
  public void BuildAnimalTail() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("Monkey Tail");

    System.out.println("Monkey Tail ....");
  }

  @Override
  public AnimalToy CreateAnimalToy() {
    // TODO Auto-generated method stub
    return new AnimalToy();
  }
}
