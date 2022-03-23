package nyugtaprojektek;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Nyugta4 {

    public static void main(String[] args) {
//        String csillagok = "********************";
        disz("*");
//        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        disz("*");
//        System.out.println(csillagok);
        
        final String HUF = "Ft";        
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);

//        for (int i = 1; i < 4; i++) {
//            System.out.printf("Tétel%2d: %8d %s\n", i, tetel1, HUF);
//        }

        //String duplaVonal = "====================";
        disz("=");
//        System.out.println(duplaVonal);
        
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        //String szaggatottVonal = "--------------------";
        disz("-");
//        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        disz("=");
//        System.out.println(duplaVonal);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        disz("-");
//        System.out.println(szaggatottVonal);
        
        System.out.println("");
        //String rovidVonal = "_______";
        ketVonalValasztoval("_");
//        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
//        System.out.print(rovidVonalValaszto);
//        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        
        disz("*");
//        System.out.println(csillagok);    
        System.out.println("        CÉG");
        disz("*");
//        System.out.println(csillagok);
        
    }

    private static void disz(String jel) {
        for (int i = 0; i < 20; i++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void ketVonalValasztoval(String jel) {
        for (int i = 0; i < 7; i++) {
            System.out.print(jel);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(jel);
        }
        System.out.println("");
    }
}
