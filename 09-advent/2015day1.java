import java.util.*;

public class Santa_2015_day_1 {
  public static void main(String[] args) {

    Scanner num = new Scanner(System.in);
    String parenthesis = num.nextLine();
    int floor = 0;
    char b = ' ';
    for (int i = 0; i < parenthesis.length(); i++){
      b = parenthesis.charAt(i);
      if (b == '('){
        floor ++;}
        else{
          floor--;
        }
      }
      System.out.println(floor);
    }
}
