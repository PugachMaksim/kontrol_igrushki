package igrushki;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 10;
        boolean flag = true;
        Lottery lot = new Lottery(count);
        while (flag) {
            System.out.println("""
                    1. розыгыш 10 игрушек
                    2. изменить шанс выпадания игрушек
                    3. выдать игрушку
                    4. выход""");
            switch (n = sc.nextInt()) {
                case (1) -> lot.raffle();
                case (2) -> lot.random();
                case (3) -> lot.FileRW();
                case (4) -> flag = false;
                default -> throw new IllegalStateException("Unexpected value: " + (n = sc.nextInt()));
            }
        }
    }
}