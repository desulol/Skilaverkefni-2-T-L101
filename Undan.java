import java.time.LocalDate;

/******************************************************************************
 *  Nafn    : Asgeir Tomas Gudmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Forritið fær inn 6 breytur, dag1, mánuð1, ár1, dag2,
 *            mánuð2 og ár2. Finnur það svo út hvort x1 hafi verið
 *            dagsetning á undan x2 og prentar true ef svo er,
 *            false ef seinni dagsetningin var á undan eða er sami dagur.
 *
 *****************************************************************************/
public class Undan {

    public static void main(String[] args) {
        int dayOne = Integer.parseInt(args[0]);
        int monthOne = Integer.parseInt(args[1]);
        int yearOne = Integer.parseInt(args[2]);
        int dayTwo = Integer.parseInt(args[3]);
        int monthTwo = Integer.parseInt(args[4]);
        int yearTwo = Integer.parseInt(args[5]);

        LocalDate date1 = LocalDate.of(yearOne, monthOne, dayOne);
        LocalDate date2 = LocalDate.of(yearTwo, monthTwo, dayTwo);

        System.out.println("Fyrri dagsetningin er á undan seinni:"+date1.isBefore(date2));
    }

}
