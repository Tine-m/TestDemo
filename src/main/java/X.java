public class X {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int result = 0;
    try {
     // result = calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
      result = calculator.add(99, 99);
    }
    catch(IllegalArgumentException e) {
      System.out.println("FEJL!!!!! " + e.getMessage());
    }
    System.out.println("Resultat af add er " + result);
  }
}
