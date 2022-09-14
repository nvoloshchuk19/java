package primitives;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1.
        byte byteBinVar = 0b1, byteOctVar = 011, byteDecVar = 10, byteHexVar = 0x10;
        short shortBinVar = 0b101, shortOctVar = 031, shortDecVar = 355, shortHexVar = 0xCAF;
        int intBinVar = 0b110, intOctVar = 0754, intDecVar = 2900, intHexVar = 0xFF;
        long longBinVar = 0b10L, longOctVar = 0321L, longDecVar = 20L, longHexVar = 0xAAL;

        float floatDecVar = 20.65f, floatHexVar = 0xAAf;
        double doubleDecVar = 2.9, doubleHexVar = 0xAp2;

        char charBinVar = 0b101, charOctVar = 043, charDecVar = 99, charHexVar = 0xFFF, charVar = 'A';

        // 2.
        int sumByte = byteBinVar + byteOctVar + byteDecVar + byteHexVar;
        int sumShort = shortBinVar + shortOctVar + shortDecVar + shortHexVar;
        int sumInt = intBinVar + intOctVar + intDecVar + intHexVar;
        long sumLong = longBinVar + longOctVar + longDecVar + longHexVar;

        float sumFloat = floatDecVar + floatHexVar;
        double sumDouble = doubleDecVar + doubleHexVar;

        int sumChar = charBinVar + charOctVar + charDecVar + charHexVar + charVar;

        // 3.
        double result = sumByte + sumShort + sumInt + sumLong + sumFloat + sumDouble + sumChar;
        System.out.println("Result: " + (long) result);

    }
}
