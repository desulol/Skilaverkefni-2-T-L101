/******************************************************************************
 *  Nafn    : Asgeir Tomas Gudmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Forrið fær inn 3 breytur, höfuðstól, nafnavexti og fjölda ára.
 *            Reiknar það svo út vaxtagreiðslu eftir gefnum breytum og
 *            prentar út.
 *
 *****************************************************************************/

public class Vaxtavextir {
    public static void main(String[] args){

    double total = Double.parseDouble(args[0]);
    double interest = Double.parseDouble(args[1]);
    int years = Integer.parseInt(args[2]);

    double interestYearly = 1+(interest/100);

    double interestInterest = total * (Math.pow(interestYearly, years) -1);

    System.out.println("Vaxtagreiðslan er:"+interestInterest);

    }
}
