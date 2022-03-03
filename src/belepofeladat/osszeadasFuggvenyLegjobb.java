package belepofeladat;

public class osszeadasFuggvenyLegjobb {
    static int szam1 = 3;
    static int szam2 = 5;
    
    
    int kettoSzamotOsszead(){
        return szam1 + szam2;
        
    }
    void kettoSzamOsszegetKiir(){
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, kettoSzamotOsszead());
    }
    public static void main(String[] args) {

//        int eredmeny = kettoSzamotOsszead();
//        kettoSzamOsszegetKiir();
//
//        szam1 = eredmeny;
//        szam2 = 2;
//        int masikEredmeny = kettoSzamotOsszead();
//        kettoSzamOsszegetKiir();
//
//        szam1 = 13;
//        szam2 = 8;
//        kettoSzamOsszegetKiir();
        
        osszeadasFuggvenyLegjobb ofl = new osszeadasFuggvenyLegjobb();
        int eredmeny = ofl.kettoSzamotOsszead();
        ofl.kettoSzamOsszegetKiir();
        szam1 = eredmeny;
        szam2 = 2;
        int masikEredmeny = ofl.kettoSzamotOsszead();
        ofl.kettoSzamOsszegetKiir();
        
    }
}
