package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

    public static void main(String[] args) {
        HashMap d = new HashMap();
        Scanner f = new Scanner(System.in);
        System.out.print("Степень многочлена n= ");
        int n = f.nextInt();
        System.out.print("D(x)= c0 ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" + c" + i + "*x^" + i);
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("c" + i + "=");
            d.put(i, f.nextInt());
        }
        System.out.print("D(x)= " + d.get(0));
        for (int i = 1; i <= n; i++) {
            System.out.print(" + " + d.get(i) + "x^" + i);
        }
        System.out.println();
        HashMap e = new HashMap();
        System.out.print("E(x)= a0 ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" + a" + i + "*x^" + i);
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("a" + i + "=");
            e.put(i, f.nextInt());
        }
        System.out.print("E(x)= " + e.get(0));
        for (int i = 1; i <= n; i++) {
            System.out.print(" + " + e.get(i) + "x^" + i);
        }
        System.out.println();
        HashMap h = new HashMap();
        h.put(0,(int ) d.get(0) + (int)e.get(0));
        System.out.print("D(x)+E(x)= " + h.get(0));
        for (int i = 1; i <= n; i++) {
            h.put(i, (int )d.get(i) +(int) e.get(i));
            System.out.print(" + " + h.get(i) + "x^" + i);
        }
    }
}


