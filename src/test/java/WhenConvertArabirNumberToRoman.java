import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenConvertArabirNumberToRoman {
    @Test
    public void Convert_0_To_EmptyString() {
        String romanNumber = convertToRomans(0);
        assertEquals("", romanNumber);
    }

    private String convertToRomans(int arabicNumber) {
        ArabicToRomanMumberConverter converter = new ArabicToRomanMumberConverter();
        return converter.Convert(arabicNumber);
    }

    @Test
    public void Convert_1_To_I() {
        String romanNumber = convertToRomans(1);
        assertEquals("I", romanNumber);
    }

    @Test
    public void Convert_2_To_II() {
        String romanNumber = convertToRomans(2);
        assertEquals("II", romanNumber);
    }

    @Test
    public void Convert_3_To_III() {
        String romanNumber = convertToRomans(3);
        assertEquals("III", romanNumber);
    }

    @Test
    public void Convert_5_To_V() {
        String romanNumber = convertToRomans(5);
        assertEquals("V", romanNumber);
    }

    @Test
    public void Convert_6_To_VI() {
        String romanNumber = convertToRomans(6);
        assertEquals("VI", romanNumber);
    }

    @Test
    public void Convert_7_To_VI() {
        String romanNumber = convertToRomans(7);
        assertEquals("VII", romanNumber);
    }

    @Test
    public void Convert_8_To_VIII() {
        String romanNumber = convertToRomans(8);
        assertEquals("VIII", romanNumber);
    }

    @Test
    public void Convert_4_To_IV() {
        String romanNumber = convertToRomans(4);
        assertEquals("IV", romanNumber);
    }

    @Test
    public void Convert_10_To_X() {
        String romanNumber = convertToRomans(10);
        assertEquals("X", romanNumber);
    }

    @Test
    public void Convert_9_To_IX() {
        String romanNumber = convertToRomans(9);
        assertEquals("IX", romanNumber);
    }
    @Test
    public void Convert_19_To_XIX() {
        String romanNumber = convertToRomans(19);
        assertEquals("XIX", romanNumber);
    }
    @Test
    public void Convert_20_To_XX() {
        String romanNumber = convertToRomans(20);
        assertEquals("XX", romanNumber);
    }
    @Test
    public void Convert_15_To_XV() {
        String romanNumber = convertToRomans(15);
        assertEquals("XV", romanNumber);
    }
    @Test
    public void Convert_17_To_XVII() {
        String romanNumber = convertToRomans(17);
        assertEquals("XVII", romanNumber);
    }
    @Test
    public void Convert_39_To_XXXIX() {
        String romanNumber = convertToRomans(39);
        assertEquals("XXXIX", romanNumber);
    }


}
