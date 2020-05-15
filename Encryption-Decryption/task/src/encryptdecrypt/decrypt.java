package encryptdecrypt;

public class decrypt {
    public static char[] dec(String alg, String input, int key) {
        decryptionAlgorithm decAlg;
            if(alg.equals("unicode")) {
            decAlg = new unicodeAlgorithm();
        } else {
            decAlg = new shiftAlgorithm();
        }
            return decAlg.dec(input, key);
    }
}
