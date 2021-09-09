/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Forritið tekur inn 2 breytur ( 97 og 1 ). Reiknar svo og skilar
 *            þeim tölum í ákveðnri röð sem ASCII kóða eftir þrem breytum;
 *            97;
 *            97+1;
 *            97+2;
 *
 *
 *****************************************************************************/


public class Stafaruna {

    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);

        int utreikningur1 = aTala + bil;
        int utreikningur2 = aTala + (2 * bil);

        System.out.print((char) aTala);
        System.out.print((char) utreikningur1);
        System.out.print((char) aTala);
        System.out.print((char) utreikningur2);
        System.out.print((char) aTala);
        System.out.print((char) utreikningur1);
        System.out.print((char) aTala);
    }
}
