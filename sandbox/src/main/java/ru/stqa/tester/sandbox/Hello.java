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

          Square s = new Square (10);
          System.out.println("Площадь квадрата со стороной " + s.l + " = " + ploshad(s));

            Rectangle r = new Rectangle(5,10);
            System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + pryamougolnik(r));
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
    public static double ploshad(Square s){
      return s.l * s.l;

    }
    public static double pryamougolnik (Rectangle r){
      return r.a * r.b;
    }

}
	