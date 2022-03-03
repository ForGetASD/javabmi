package belepofeladat;

public class Belepofeladat {
    private static void masvalami(){
        System.out.println("Más valamit csinálok");
    }
    private static void valami(){
        System.out.println("Valamit csinálok");
        masvalami();
    }
    public static void main(String[] args) {
        valami(); 
    }
}
