package belepofeladat;

public class osszeadasFuggvenyJobb {
    static int osszeadas(int szam1, int szm2){
        return szam1 + szm2;
        
    }
    static void kettoSzamOsszegetKiir(int szam1, int szam2){
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, osszeadas(szam1, szam2));
    }
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 5;
        int eredmeny = osszeadas(szam1, szam2);
        System.out.printf("%d + %d = %d\n",szam1 ,szam2 ,szam1 + szam2);
        
        int ujeredmeny = osszeadas(eredmeny, 2);
        //System.out.printf("%d + %d = %d\n",c ,2 ,c + 2);
        kettoSzamOsszegetKiir(eredmeny, 2);
        
        kettoSzamOsszegetKiir(13, 8);
    }
}
