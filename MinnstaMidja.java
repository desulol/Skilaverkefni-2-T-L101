/******************************************************************************
 *  Nafn    : Asgeir Tomas Gudmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Forritið tekur inn 3 Breytur ( Handhófskenndar tölur ) og athugar
 *            hvort talan sem er gefin upp í miðjunni af þeim 3 tölum sé sú minnsta
 *            af þeim. Prentar svo true/false eftir gefnum forsendum.
 *
 *
 *****************************************************************************/


public class MinnstaMidja {

    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        boolean center;

        center = (secondNumber < firstNumber && secondNumber < thirdNumber);


        System.out.println("miðjustakið af " + firstNumber + "," + secondNumber + "," + thirdNumber + " er minnst:" + center);
    }
}
