package BuilderPattern;

public class ToyMaker {

  public final static String Dog = "Dog";
  public final static String Monkey = "Monkey";

  public static AnimalToy BuildToy(String name) {
    AnimalToyBuilder animalToyBuilder = null;

    if (name.equalsIgnoreCase(Dog)) {

      animalToyBuilder = new DogAnimalToy();

    } else if (name.equalsIgnoreCase(Monkey)) {
      animalToyBuilder = new MonkeyAnimalToy();

    } else {

      System.out.println("You cant make toy : " + name);
      System.exit(0);

    }

    return animalToyBuilder.BuildAnimalToy();
  }

}
