package learn.scanner;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println("您输入了"+ str);
            if(str.equals("exit")) {
                scanner.close();
            }
        }
        System.out.println("end!");
    }
}
