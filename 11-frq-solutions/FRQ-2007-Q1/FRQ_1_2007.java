import java.util.*;

public class SelfDevisor{
  public static void main(String[] args) {


  }
    /** @param number the number to be tested
  *         Precondition: number > 0
  *  @return true if every decimal digit of number is a divisor of number;
  *          false otherwise
  */
  public static boolean isSelfDivisor(int number){
   String s = String.valueOf(number);
   for (int i = 0; i < s.length(); i++)
   {
     int d = Integer.parseInt(s.substring(i, i+1));
     if (d == 0 || number % d != 0)
       return false;
   }
   return true;
 }
 /** @param start starting point for values to be checked
   *         Precondition: start > 0
   *  @param num the size of the array to be returned
   *         Precondition: num > 0
   *  @return an array containing the first num integers >= start that are self-divisors
   */
  public static int[] firstNumSelfDivisors(int start, int num){
    int[] a = new int[num]; 1
    int count = 0;
    int n = start;
    while (count < num)
    {
      if (isSelfDivisor(n))
      {
        a[count] = n;
        count++;
      }
      n++;
    }
    return a;
  }
  }
