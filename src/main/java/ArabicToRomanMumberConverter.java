public class ArabicToRomanMumberConverter {
    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
          return getDefaultRomanNumber();

        String romanNumber = getRomanNumber(arabicNumber);
        romanNumber=romanNumber.replace("IIII","IV");
        romanNumber=replaceInterlasedDigits(romanNumber);
        return romanNumber;
    }

    private  static String replaceInterlasedDigits(String romanNumber) {
        for (int i = 2; i < romanNumber.length(); i++) {
            if (romanNumber.charAt(i-2)==romanNumber.charAt(i)&&romanNumber.charAt(i-1)!=romanNumber.charAt(i)){
                romanNumber=romanNumber.substring(0,i-2)+
                        romanNumber.charAt(i-1)+
                        nextDigit(romanNumber.charAt(i))+
                        romanNumber.substring(i+1);
            }
        }
        return romanNumber;

    }

    private static char nextDigit(char digit) {
        return new DigitsMap().nextDigit(digit);
    }


    private String getRomanNumber(int arabicNumber) {
       String romanNumber = "";
      DigitsMap digitsMap = new DigitsMap();

        for(PairOfDigits digit :digitsMap.digits){
            while (arabicNumber >= digit.getArabic()) {
                romanNumber += digit.getRoman();
                arabicNumber-=digit.getArabic();
            }
        }

        return romanNumber;
    }

    private String getDefaultRomanNumber () {
        return "";
    }

    }


