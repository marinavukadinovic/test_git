package StringAndStringBuilder;

public class SumOfTheDigits {

	public static int digitSum (long calue)
}
public class Quersumme {

    // Methode zur Berechnung der Quersumme einer langen Zahl
    public static int digitSum(long value) {
        int sum = 0;

        // Solange value größer als 0 ist
        while (value > 0) {
            // Extrahiere die letzte Ziffer und addiere sie zur Summe
            sum += (int) (value % 10);
            // Dividiere value durch 10, um die nächste Ziffer zu erhalten
            value /= 10;
        }

        return sum;
    }

    // Überladene Methode zur Berechnung der Quersumme eines Strings
    public static int digitSum(String value) {
        int sum = 0;

        // Durchlaufe jeden Char im String
        for (char c : value.toCharArray()) {
            // Wenn der Char eine Ziffer ist, konvertiere ihn in einen Integer und addiere ihn zur Summe
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }

    // Beispiel zur Verwendung der Methoden
    public static void main(String[] args) {
        long longValue = 10938;
        String stringValue = "123abc456";

        System.out.println("Quersumme von " + longValue + ": " + digitSum(longValue));
        System.out.println("Quersumme von \"" + stringValue + "\": " + digitSum(stringValue));
    }
}