package prototype;

import java.util.HashMap;

public class AnimalCache {

  private static HashMap<String, Dog> hashMap = new HashMap<String, Dog>();

  public static Animal getAnimal(String name) {

    Dog dog = hashMap.get(name);

    if (dog == null) {

      DogLeg dogLeg = new DogLeg();
      dogLeg.setLeg(1);
      DogEyes dogEyes = new DogEyes();
      dogEyes.setDogEyes(10);

      Dog dog2 = new Dog("aaa", "black", dogEyes, dogLeg);
      hashMap.put("dog", dog);
      System.out.println("Create New Dog");
      return dog2;

    }
    System.out.println("Return Existing Dog");
    return dog;

  }

}
