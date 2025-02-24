package ACNGEN;

import java.util.Random;

public class ACN {

  public static int t;
  public static String p;
  public static String acno;
  public static String n = "38439";
  public static int index;

  public ACN(int a, String b, int c) {
    t = a;
    p = b;
    index = c;
  }

  public static String display() {
    acno = n + String.valueOf(t) + p.substring(6, 10) + index;
    return acno;
  }

  public int pinnumber() {
    Random random = new Random();
    int randomNumber = random.nextInt(9000);
    randomNumber += 1000;
    return randomNumber;

  }
}
