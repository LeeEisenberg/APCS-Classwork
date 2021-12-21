public class Bird extends Animal {
  public double height;
  public String color;
  //Lee starts

  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }


  public void speak(){
    /*WITHOUT REPEATING CODE:
    print the following message replacing the ? with name/age/noise/color/height:
    My name is ?.
    I am ? years old.
    I say ?.
    I am ?
    I am ? inches tall
    */
    super.speak();
    System.out.println("I am " + color);
    System.out.println("I am " + height + " inches tall");
  }
}
