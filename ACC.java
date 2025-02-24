package ACCOUNT;

import ACNGEN.*;
import INDEXPACK.*;
import java.util.*;
class AC {
  Scanner sc = new Scanner(System.in);
  int balance = 0, amount;
  String acholder, acno;
  int pin;

  public AC(int p, String a) {
    this.acno = a;
    this.pin = p;
  }

  void deposit() {
    System.out.print("    Enter the amount you want to deposit : ");
    amount = sc.nextInt();
    balance = balance + amount;
    System.out.println("   'Amount Successfully Deposited in your account'");
    System.out.print("    Your Current balance = " + balance + "\n");
  }

  void withdrawal() {

    System.out.print("    Enter the amount you want to withdrawal : ");
    amount = sc.nextInt();
    if (amount > balance) {
      System.out.println("    INSUFFICIENT BALANCE\n");
    } else {
      balance = balance - amount;
      System.out.println("   'Amount Successfully withdraw from your account'");
      System.out.print("    Your Current balance = " + balance + "\n");
    }
  }

  void showbalance() {
    System.out.print("    Your Current balance = " + balance + "\n");
  }

  void details() {
    System.out.println("    A/C HOLDER NAME : " + acholder);
    System.out.println("    A/C NUMBER : " + acno);
    System.out.println("    YOUR PIN NUMBER : " + pin);
  }

  void Transfer(int amount) {
    balance = balance - amount;
    System.out.print("    Your Current balance = " + balance + "\n");
  }

  void receiver(int amount) {
    balance = balance + amount;
  }
}

class ACC {
  @SuppressWarnings("static-access")
  public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
          INDEXFIND i = new INDEXFIND();
          AC[] bk = new AC[3];
          String holdername, phno;
          int op, acctype, check = 0, k = 1, y, z, w, q;
          String x, re;
          System.out.println("    WELCOME TO KARTHIK BANK PORTAL");
          while (k == 1) {
              System.out.println("------------------------------------------------------------\n");
              System.out.println("    1.Create New A/c\n    2.Deposit\n    3.Withdrawal\n    4.Transfer\n    5.Account Balance\n    6.EXIT\n");
              System.out.print("    ENTER THE CHOICE : ");
              op = sc.nextInt();
              switch (op) {
                  case 1 -> {
                      // .balance();
                      System.out.print("    Enter your name : ");
                      holdername=sc.next();
                      System.out.print("    Enter your Mobile number : ");
                      phno=sc.next();
                      System.out.print("    Enter '1' for savings account \n    Enter '0' for business account\n");
                      System.out.println("------------------------------------");
                      System.out.print("    Enter your account type : ");
                      acctype=sc.nextInt();
                      System.out.println("------------------------------------");
                      System.out.println("   'Account successfully created!'");
                      ACN gn = new ACN(acctype,phno, check);
                      bk[check] = new AC(gn.pinnumber(), gn.display());
                      bk[check].acholder = holdername;
                      bk[check].details();
                      check = check + 1;
                  }
                  case 2 -> {
                      System.out.print("    Enter your a/c number : ");
                      x = sc.next();
                      System.out.print("    Enter your pin : ");
                      z = sc.nextInt();
                      y = i.index(x);
                      if (bk[y].pin == z) {
                          bk[y].deposit();
                      } else {
                          System.out.println("    -----Wrong pin-----");
                      }
                  }
                  case 3 -> {
                      System.out.print("    Enter your a/c number : ");
                      String x2 = sc.next();
                      System.out.print("    Enter your pin : ");
                      int z2 = sc.nextInt();
                      int y2 = i.index(x2);
                      if (bk[y2].pin == z2) {
                          bk[y2].withdrawal();
                          System.out.println("1");
                      } else {
                          System.out.println("    -----Wrong pin-----");
                      }
                  }
                  case 4 -> {
                      System.out.print("    Enter your a/c number : ");
                      String x1 = sc.next();
                      System.out.print("    Enter your pin : ");
                      int z1 = sc.nextInt();
                      int y1 = i.index(x1);
                      if (bk[y1].pin == z1) {
                          System.out.print("    PLEASE ENTER THE A/C NUMBER OF THE RECEIVER ACCOUNT : ");
                          re = sc.next();
                          w = i.index(re);
                          if (bk[w].acno.equals(re)) {
                              System.out.print("    Enter the amount : ");
                              q = sc.nextInt();
                              System.out.println("   'Successfully Transfered'");
                              System.out.print("    RS." + q + "amount transfer to " + re+"\n");
                              bk[y1].Transfer(q);
                              bk[w].receiver(q);
                          } else {
                              System.out.println("    ----invalid a/c no---- ");
                          }
                      } else {
                          System.out.println("    -----Wrong pin----- ");
                      }
                  }
                  
                  case 5 -> {
                      System.out.print("    Enter your a/c number : ");
                      String x3 = sc.next();
                      System.out.print("    Enter your pin : ");
                      int z3 = sc.nextInt();
                      int y3 = i.index(x3);
                      if (bk[y3].pin == z3) {
                          bk[y3].showbalance();
                      } else {
                          System.out.println("    -----Wrong pin------");
                      }
                  }
                  
                  case 6 -> k = 0;
                  default -> System.out.println("------YOU ENTERED INVALID NUMBER------");
                  
              }
          } }

  }
}
