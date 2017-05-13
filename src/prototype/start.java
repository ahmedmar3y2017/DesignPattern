package prototype;

public class start {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Dog dog = (Dog) AnimalCache.getAnimal("dog");
    System.out.println(dog.getName());

    // make clone and modify ....
    Dog dog1 = (Dog) AnimalCache.getAnimal("dog");
    dog1.setName("llll");
    System.out.println(dog1.getName());

  }

}
