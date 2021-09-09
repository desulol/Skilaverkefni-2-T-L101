/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Forritið tekur inn 2 breytur ( radíus og hæð ). Reiknar svo og skilar
 *            bæði flatarmáli og rúmmáli.
 *
 *
 *****************************************************************************/


public class Sivalningur {

    public static void main(String[] args) {

        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double square = ((2 * Math.PI * radius) * (radius + height));
        double volume = (Math.PI * radius * radius * height);

        System.out.println("Flatarmál sívalnings með radíus " + radius + " og hæð " + height + " er:" + square);
        System.out.println("Rúmmál sívalnings með radíus " + radius + " og hæð " + height + " er:" + volume);
    }
}
