package DAY8;

public class RevStr {
  public static String reverseString(String s) {
    int left = 0;
    int right = s.length() - 1;
    StringBuilder sb = new StringBuilder(s);

    while (left < right) {
      char temp = sb.charAt(left);
      sb.setCharAt(left, sb.charAt(right));
      sb.setCharAt(right, temp);
      left++;
      right--;
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "srushti";
    System.out.println(reverseString(s));

  }

}
