package encryptdecrypt;

public class shiftAlgorithm implements encryptionAlgorithm, decryptionAlgorithm {
    @Override
    public char[] dec(String input, int key) {
        char[] output = new char[input.length()];
        char[] inputChars = input.toCharArray();
        for(int i = 0; i < inputChars.length; i++){
            char letter = inputChars[i];
            if(letter >= 65 && letter <= 90) {
                letter -= 65;
                letter -= key;
                if(letter < 0) {
                    letter += 26;
                }
                letter += 65;
                output[i] = letter;
            }
            else if(letter  >= 97 && letter <= 122) {
                letter -= 97;
                letter -= key;
                if(letter < 0) {
                    letter += 26;
                }
                letter += 97;
                output[i] = letter;
            } else {
                output[i] = letter;
            }
        }
        return output;
    }

    @Override
    public char[] enc(String input, int key) {
        char[] output = new char[input.length()];
        char[] inputChars = input.toCharArray();
        for(int i = 0; i < inputChars.length; i++){
            char letter = inputChars[i];
            if(letter >= 65 && letter <= 90) {
                letter -= 65;
                letter += key;
                if(letter > 25) {
                    letter -= 26;
                }
                letter += 65;
                output[i] = letter;
            }
            else if(letter  >= 97 && letter <= 122) {
                letter -= 97;
                letter += key;
                if(letter > 25) {
                    letter -= 26;
                }
                letter += 97;
                output[i] = letter;
            } else {
                output[i] = letter;
            }
        }
        return output;
    }
}
