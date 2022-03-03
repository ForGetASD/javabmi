package progtetelek;

import java.util.Random;

public class PrimSzamMetodusokkal {

    public static void main(String[] args) {
        int szam = 9;
        boolean prim = prime(szam);
        
        //Random rnd = new Random();
        //int sz = rnd.nextInt();
        int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt()};
        sorozatKiir(sorozat);
        
        int dbPrim = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (prime(sorozat[i])) {
                dbPrim++;
            }
        }
        System.out.println(dbPrim);
        
        //van e prim?
        int i = 0;
        while (i < sorozat.length && !(prime(sorozat[i]))){
            i++;
        }
        

//        int szam = 1;
//        boolean prim;
//        if (szam < 2) {
//            prim = false;
//        } else {
//
//            int i = 2;
//            while (i <= Math.sqrt(szam) && !(szam % i == 0)) {
//                i++;
//            }
//
//            //boolean vanOsztoja = i < szam-1;
//            //boolean nincsOsztoja = i >= szam-1;
//            //boolean prim = i >= szam-1;
//            //boolean nemprim = i >= szam-1;
//            prim = i > Math.sqrt(szam);
//        }
//        System.out.printf("%d az prím: %b\n", szam, prim);
    }

    static boolean prime(int szam) {
        if (szam < 2) {
            return false;
        } else {

            int i = 2;
            while (i <= Math.sqrt(szam) && !(szam % i == 0)) {
                i++;
            }

            //boolean vanOsztoja = i < szam-1;
            //boolean nincsOsztoja = i >= szam-1;
            //boolean prim = i >= szam-1;
            //boolean nemprim = i >= szam-1;
            return i > Math.sqrt(szam);
        }
    }

    static void sorozatKiir(int[] sorozat) {
        for (int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + " ");
        }
        System.out.println("");
    }
}
