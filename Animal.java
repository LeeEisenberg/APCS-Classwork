public class Animal {
  private String noise;
  private int age;
  private String name;
//Marie starts
  public Animal(String noise, int age, String name){
    //initialize the values (hint use this.varname to clarify)
    noise = this.noise;
    age = this.age;
    name = this.name;
  }

  public String getName() {
    //accessor
    return name;
  }

  public void speak(){
    /*print the following message replacing the ? with name/age/noise:
    My name is ?.
    I am ? years old.
    I say ?.
    */
    System.out.println("My name is " + name);
    System.out.println("I am " + age + " years old");
    System.out.println("I say " + noise);
  }
}
