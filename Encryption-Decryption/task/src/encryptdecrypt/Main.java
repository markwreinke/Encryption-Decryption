package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String op = "enc";
        int key = 0;
        String input = "";
        File readInFile = null;
        File writeOutFile = null;
        String alg = "shift";

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    i++;
                    op = args[i];
                    break;
                case "-key":
                    i++;
                    key = Integer.parseInt(args[i]);
                    break;
                case "-data":
                    i++;
                    input = args[i];
                    break;
                case "-in":
                    i++;
                    String inFilePath = args[i];
                    readInFile = new File(inFilePath);
                    break;
                case "-out":
                    i++;
                    String outFilePath = args[i];
                    writeOutFile = new File(outFilePath);
                    break;
                case "-alg":
                    i++;
                    alg = args[i];
                    break;
            }
        }

        /*System.out.println(op);
        System.out.println(key);
        System.out.println(input);
        System.out.println(readInFile);
        System.out.println(writeOutFile);*/

        char[] outputChars = {};

        if (readInFile != null && input.isEmpty()) {
            try (Scanner scanner = new Scanner(readInFile)) {
                input = scanner.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("Error! No file found: " + readInFile.getPath());
            }
        }

        if (op.equals("dec")) {
            outputChars = decrypt.dec(alg, input, key);
        } else {
            outputChars = encrypt.enc(alg, input, key);
        }


        if(writeOutFile != null){
            try(FileWriter writer = new FileWriter(writeOutFile)) {
                writer.write(outputChars);
            }catch (IOException e) {
                System.out.print(outputChars);
            }
        } else{
            System.out.print(outputChars);
        }
    }




}