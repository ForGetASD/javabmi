package belepofeladat;

public class osszeadasFuggvenyMajdnemLegjobb {
    public static int szam1 = 3;
    public static int szam2 = 5;
    
    
    static int kettoSzamotOsszead(){
        return szam1 + szam2;
        
    }
    static void kettoSzamOsszegetKiir(){
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, kettoSzamotOsszead());
    }
    public static void main(String[] args) {
//        int szam1 = 3;
//        int szam2 = 5;
        //int eredmeny = osszeadas();
//        System.out.printf("%d + %d = %d\n",szam1 ,szam2 ,szam1 + szam2);
//        
        int eredmeny = kettoSzamotOsszead();
        kettoSzamOsszegetKiir();
//        int ujeredmeny = osszeadas();
//        //System.out.printf("%d + %d = %d\n",c ,2 ,c + 2);
//        kettoSzamOsszegetKiir();
//        
        szam1 = eredmeny;
        szam2 = 2;
        int masikEredmeny = kettoSzamotOsszead();
        kettoSzamOsszegetKiir();
//        kettoSzamOsszegetKiir();

        szam1 = 13;
        szam2 = 8;
        kettoSzamOsszegetKiir();
    }
}
