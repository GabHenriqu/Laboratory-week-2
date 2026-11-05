public class Kata {

  public static String solution(String str) {
    
    String invertido = "";
    
    for (int i = str.length() - 1; i >= 0; i--) {
      invertido += str.charAt(i);
    }
    
    return invertido;
  }

}