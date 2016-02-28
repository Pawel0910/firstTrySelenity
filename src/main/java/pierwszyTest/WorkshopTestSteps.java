package pierwszyTest;

import java.text.ParseException;

/**
 * Created by Kielan on 27.02.2016.
 */
public class WorkshopTestSteps {
    public static void main(String[] args) throws ParseException {
        String napis="od 146,85 EUR";
       // NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
       // Number number = format.parse(napis.substring(3,9).replace(",","."));
        double cena = Double.parseDouble(napis.substring(3,9).replace(",","."));
        cena+=1;
        System.out.println(cena);
        String[] ja=napis.split(" ");
        for (int i = 0; i <ja.length ; i++) {
            System.out.println(ja[i]);

        }
    }
}
