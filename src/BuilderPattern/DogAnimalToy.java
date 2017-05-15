package BuilderPattern;

public class DogAnimalToy extends AnimalToyBuilder {

  @Override
  public void setAnimalName() {

    getAnimalToy().setAnimalName("dog");

    System.out.println("Dog name ....");

  }

  @Override
  public void BuildAnimalHead() {

    getAnimalToy().setAnimalHead("Dog Head ...");
    System.out.println("Dog Head ....");

  }

  @Override
  public void BuildAnimalBody() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("dog body");

    System.out.println("Dog Body ....");
  }

  @Override
  public void BuildAnimalLeg() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("dog Leg");

    System.out.println("Dog Leg ....");
  }

  @Override
  public void BuildAnimalArm() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("dog Arm");

    System.out.println("Dog Arm ....");
  }

  @Override
  public void BuildAnimalTail() {
    // TODO Auto-generated method stub
    getAnimalToy().setAnimalName("dog Tail");

    System.out.println("Dog Tail ....");
  }

  @Override
  public AnimalToy CreateAnimalToy() {
    // TODO Auto-generated method stub
    return new AnimalToy();
  }

}
