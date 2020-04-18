package ru.stqa.tester.sandbox;

public class Hello {
    public static void main(String[] args) {
        ride();
        world();
        David("David");

        ride();
        world();
        David("Abramchik");

        ride();
        world();
        David("Iosik");

        double l = 10;
      System.out.println("Площадь квадрата со стороной " + l + " = " + ploshad(l));

      double a = 5;
      double b = 10;
      System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + pryamougolnik(a,b));
    }
    public static void ride(){
      System.out.print("I ride ");
    }
    public static void world(){
    System.out.print("the world ");
  }
    public static void David (String somebody){
      System.out.println("and I love my little son " +  somebody +"!");
    }
    public static double ploshad(double len){
      return len*len;

    }
    public static double pryamougolnik (double a, double b){
      return a*b;
    }

}
	