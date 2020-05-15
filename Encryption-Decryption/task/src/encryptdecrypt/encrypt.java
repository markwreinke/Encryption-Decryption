package encryptdecrypt;

public class encrypt {
    public static char[] enc(String alg, String input, int key) {
        encryptionAlgorithm encAlg;
        if(alg.equals("unicode")) {
            encAlg = new unicodeAlgorithm();
        } else {
            encAlg = new shiftAlgorithm();
        }
        return encAlg.enc(input, key);
    }
}
