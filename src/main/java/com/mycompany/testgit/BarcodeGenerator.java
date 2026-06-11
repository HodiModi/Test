public class BarcodeGenerator {

    public static String erzeugeBarcode(String text) {

        StringBuilder barcode = new StringBuilder();

        for (char c : text.toCharArray()) {

            int wert = (int) c;

            if (wert % 2 == 0) {
                barcode.append("||| ");
            } else {
                barcode.append("|| ");
            }
        }

        return barcode.toString();
    }
}
