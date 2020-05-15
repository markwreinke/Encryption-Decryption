import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input % 2 == 1){
            System.out.println(input + 1);
        } else {
            System.out.println(input + 2);
        }
    }
}