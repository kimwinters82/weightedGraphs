import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    //long/lats in degrees
    Scanner sc = new Scanner(System.in);
    double latL1 = sc.nextDouble();
    double longL1 = sc.nextDouble();
    double latL2 = sc.nextDouble();
    double longL2 = sc.nextDouble();
    sc.close();

    //long/lats in degrees
    // double longL1 = 6.5918;
    // double latL1 = 53.3813;
    // double longL2 = -114.3055;
    // double latL2 = 30.5928;
    double PI = 3.14159265359;
    //get long/lats in radians
    longL1 = longL1 * PI / 180;
    longL2 = longL2 * PI / 180;
    latL1 = latL1 * PI / 180;
    latL2 = latL2 * PI / 180;
    
    double r = 6371;

    //get absolute difference between long loc1 and long loc 2
    double absLgDiff = longL1 - longL2;
    //System.out.println("Abs diff: "+absLgDiff);

    //get the central angle
    double s = Math.sin(latL1)*Math.sin(latL2);
    double c = Math.cos(latL1)*Math.cos(latL2)*Math.cos(absLgDiff);
    double centralAngle = Math.acos(s + c);
    //System.out.println("Central Angle: "+centralAngle);

    //get the arc length
    double d = r*centralAngle;
    //System.out.println("Arc length: "+d);
    //round to nearest 100
    d = (Math.round(d/100))*100;
    //remove decimal places
    int rounded = (int)d;
    //System.out.println("Arc length: "+d);

    //output
    System.out.println(rounded);

    //System.out.println("9100 - distance in kms from loc 1 to loc 2 rounded to nearest 100"); 

  }
}