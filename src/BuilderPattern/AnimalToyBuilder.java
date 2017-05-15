package BuilderPattern;

public abstract class AnimalToyBuilder {

  AnimalToy animalToy;

  public AnimalToy getAnimalToy() {
    return animalToy;
  }

  public void setAnimalToy(AnimalToy animalToy) {
    this.animalToy = animalToy;
  }

  public abstract void setAnimalName();

  public abstract void BuildAnimalHead();

  public abstract void BuildAnimalBody();

  public abstract void BuildAnimalLeg();

  public abstract void BuildAnimalArm();

  public abstract void BuildAnimalTail();

  public abstract AnimalToy CreateAnimalToy();

  public final AnimalToy BuildAnimalToy() {

    AnimalToy animalToy = CreateAnimalToy();
    setAnimalToy(animalToy);
    setAnimalName();
    BuildAnimalArm();
    BuildAnimalBody();
    BuildAnimalHead();
    BuildAnimalLeg();
    BuildAnimalTail();

    return animalToy;

  }

}
