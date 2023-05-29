import java.text.NumberFormat;
import java.util.Locale;

public class BRLNumberFormat {
    public static String format(Double value){
        Locale localeBR = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeBR);
        return numberFormat.format(value);
    }
}