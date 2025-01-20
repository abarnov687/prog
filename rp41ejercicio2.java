public class rp41ejercicio2 {
    public static void main(String[] args) {

        // Con bucle for
        int [] arrayCincoEnterosFor = {100, 200, 300, 400, 500};
        for (int f = 0; f < arrayCincoEnterosFor.length; f++) {
            System.out.println(arrayCincoEnterosFor[f]);
        }
        
        // Con bucle while
        int[] arrayCincoEnterosWhile = {600, 700, 800, 900, 1000};

        int i = 0;
        while (i < arrayCincoEnterosWhile.length) {
            System.out.println(arrayCincoEnterosWhile[i]);
            i++;
        }

        // Con bucle do-while
        int[] arrayCincoEnterosDoWhile = {1100, 1200, 1300, 1400, 1500};

        int d = 0;
        do {
            System.out.println(arrayCincoEnterosDoWhile[d]);
            d++;
        } while (d < arrayCincoEnterosDoWhile.length);
    }
}