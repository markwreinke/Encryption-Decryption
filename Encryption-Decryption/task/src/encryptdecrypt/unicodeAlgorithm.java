package encryptdecrypt;

public class unicodeAlgorithm implements encryptionAlgorithm, decryptionAlgorithm {
    @Override
    public char[] dec(String input, int key) {
        char[] inputChars = input.toCharArray();

        for(int i = 0; i < input.length(); i++){
            if(inputChars[i] > 31 && inputChars[i] < 127){
                int temp = (int)inputChars[i] - 32;
                temp -= key;
                temp = temp % 95;
                inputChars[i] = (char)(temp + 32);
            }
        }


        return inputChars;
    }

    @Override
    public char[] enc(String input, int key) {
        char[] inputChars = input.toCharArray();

        for(int i = 0; i < input.length(); i++){
            if(inputChars[i] > 31 && inputChars[i] < 127){
                int temp = (int)inputChars[i] - 32;
                temp += key;
                temp = temp % 95;
                inputChars[i] = (char)(temp + 32);
            }
        }

        return inputChars;
    }
}
