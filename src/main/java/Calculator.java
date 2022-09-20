public class Calculator {

  public int add(int a, int b) {
    //check at a og b ligger under eller lig med max. grænse 100

    if(a > 100 || b > 100) {
      //ellers fejlhåndtering, som er ????
      throw new IllegalArgumentException("Tal er for høje, må ikke være over 100");
    }
      return a + b;
  }
}
