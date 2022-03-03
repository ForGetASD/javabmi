package oraifeladat;

import java.util.Locale;
import java.util.Scanner;

public class bmi {
    static  void cim(String szoveg){
        System.out.println(szoveg);
    }
    
    static int beker(String kerdes, int also, int felso){
        System.out.print(kerdes);
        Scanner sc = new Scanner(System.in);
        int szam = -1;
        boolean jo = false;
        while(!jo){
            szam = sc.nextInt();
            jo = szam >= also && szam <= felso;
            if (!jo) {
                System.out.println("Nem jó, újra");
                System.out.print(kerdes);
            }
        }
        
        return szam;
    }
    static double bmiI(int tomeg, int magassag){
        return tomeg / Math.pow(magassag / 100.0, 2);
    }
    public static void main(String[] args) {
        cim("BMI index kiszámítás");
        int tomeg = beker("Testtömeg (kg) [40; 150]:", 40, 150);
        int magassag = beker("Testmagasság (cm) [100; 200]:", 100, 200);
        double bmiIndex = bmiI(tomeg, magassag);
        ertekeles(tomeg, magassag, bmiIndex);
    }

    static void ertekeles(int tomeg, int magassag, double bmiIndex) {
        System.out.printf("Ön %d cm magas és %d kg tömegű\n", magassag, tomeg);
        System.out.printf(Locale.ENGLISH, "Így BMI indexe %.1f", bmiIndex);
        String testalkat = "túlsúlyos";
        System.out.printf(" Tehát ön %s testalkatú\n", testalkat);
    }
}
