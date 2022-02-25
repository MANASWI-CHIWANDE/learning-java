import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/*
The getCurrencyInstance(Locale inLocale) method is a built-in method of the java.text.NumberFormat returns a currency format for any specifies locale.
Syntax: public static NumberFormat getCurrencyInstance?(Locale inLocale)
Parameters: The function accepts a single mandatory parameter inLocale which describes the locale which is to specifies.

Return Value: The function returns the NumberFormat instance for currency formatting.
 */
public class Java_Currency_Formatter {

    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India.
        // website : https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry
        //Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
          I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        //https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
