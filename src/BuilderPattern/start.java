package BuilderPattern;

public class start {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    AnimalToy dogAnimalToy = ToyMaker.BuildToy(ToyMaker.Dog);
    System.out.println(dogAnimalToy);
    AnimalToy MonkeyAnimalToy = ToyMaker.BuildToy(ToyMaker.Monkey);
    System.out.println(MonkeyAnimalToy);

  }

}
