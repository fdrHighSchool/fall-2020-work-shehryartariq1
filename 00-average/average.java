import java.util.*;

public class Average{
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double sum = 0;
     int HMN = 0;
     int count = 0;
     System.out.println("How many numbers do you want to input? ");
     HMN = input.nextInt();
     int length = input.nextInt();
     int arr[] = new int[length];
​


     while(HMN > count){
    System.out.println("enter the number: ");
    sum += input.nextInt();
    arr[sum] = input.nextInt();
    count++;

     }
​
    System.out.println(Arrays.toString(arr));
     System.out.println(sum/count);

  }
}
