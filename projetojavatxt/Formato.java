import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Formato {
    public static String formatString(String value, String strings) {
        MaskFormatter mf;
        try {
            mf = new MaskFormatter(strings);
            mf.setValueContainsLiteralCharacters(false);
            return mf.valueToString(value);
        } catch (ParseException ex) {
            return value;
        } 
}
}
