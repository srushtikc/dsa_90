package DAY2;

import java.util.*;

public class VotingEligibility {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char input = 'Y';

    while (input == 'Y') {
      System.out.println("Enter the age:");
      int age = sc.nextInt();

      if (age >= 18) {
        System.out.print("You are Eligible for voting.");
      } else {
        System.out.println("You are not Eligible to vote");
      }

      System.out.println("To Continue Press 'Y");
      System.out.println("To Exit Press Any Key");

      input = sc.next().charAt(0);

    }
    sc.close();
  }
}
