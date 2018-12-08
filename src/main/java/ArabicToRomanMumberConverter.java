

import java.util.ArrayList;


public class ArabicToRomanMumberConverter {
    public String Convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;
        if (noNumber)
            return getDefaultRomanNumber();

        String romanNumber = getRepitingRomanNumber(arabicNumber);
            return romanNumber;
        }
    public class Pair<K, V> {

        private final K Key;
        private final V Value;

        public  <K, V> Pair<K, V> createPair(K Key, V Value) {
            return new Pair<K, V>(Key, Value);
        }

        public Pair(K Key, V Value) {
            this.Key = Key;
            this.Value = Value;
        }

        public K getKey() {
            return Key;
        }

        public V getValue() {
            return Value;
        }

    }

    private String getRepitingRomanNumber(int arabicNumber) {
        String romanNumber = "";
        Pair<Integer,String> one= new Pair<Integer, String>(1,"I");
         Pair<Integer,String> five = new Pair<Integer, String>(5,"V");
        ArrayList<Pair<Integer,String>> map =new ArrayList<Pair<Integer, String>>();
        map.add(five);
        map.add(one);

        for(Pair<Integer,String> digit :map){
            while (arabicNumber >= digit.getKey()) {
                romanNumber += digit.getValue();
                arabicNumber-=digit.getKey();
            }
        }




//        while (arabicNumber >= 5) {
//            romanNumber += "V";
//            arabicNumber-=5;
//        }
//        while (arabicNumber >= 1) {
//            romanNumber += "I";
//            arabicNumber--;
//        }
        return romanNumber;
    }

    private String getDefaultRomanNumber () {
            return "";
        }
    }


