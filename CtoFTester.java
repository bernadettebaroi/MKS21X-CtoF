/*
What should the functions have as parameter(s) ? What type should they be?
What should the functions return?
*/
public class CtoFTester {
  public static void main(String[] args) {
    celsiusToFahrenheit(32);
    fahrenheitToCelsius(33);
  }
  public static double celsiusToFahrenheit(double c) {
    return (c * (9/5) + 32);
  }
  public static double fahrenheitToCelsius(double f) {
    return (((f-32)*5)/9);
  }
}
