

import java.util.ArrayList;


public class ArabicToRomanMumberConverter {
    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        String romanNumber = getRomanNumber(arabicNumber);
            return romanNumber;
        }


    private String getRomanNumber(int arabicNumber) {
        String romanNumber = "";
        ArrayList<PairOfDigits> digits =new ArrayList<PairOfDigits>();
        digits.add(new PairOfDigits(5,'V'));
        digits.add(new PairOfDigits(1,'I'));

        for(PairOfDigits digit :digits){
            while (arabicNumber >= digit.getArabic()) {
                romanNumber += digit.getRomen();
                arabicNumber-=digit.getArabic();
            }
        }

        return romanNumber;
    }


    private String getDefaultRomanNumber () {
            return "";
        }
    }


