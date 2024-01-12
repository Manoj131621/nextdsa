package nextdsa.GeeksforGeeks;

import java.util.Scanner;

public class AbsoluteValue {
    public int absolute(int I){
        return Math.abs(I);
    }
    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.absolute(num);
        System.out.println("Absolute value of " + num + " is " + result);
      }
    
}
