package igrushki;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lottery implements LotteryI{
    int attempt;
    public Lottery(int attempt) {
        this.attempt = attempt;
    }
    List<Toys> toys = new ArrayList<>();
    TanksToys tanksToys = new TanksToys(0, "T34",60);
    CarsToys carsToys = new CarsToys(0, "Cars", 40);
    Scanner sc = new Scanner(System.in);
    @Override
    public void raffle() throws IOException {

        int i;
        int count=0;
        int MaxShans = tanksToys.getRand();
        //System.out.println(MaxShans);
        try (FileWriter file = new FileWriter("lottery.txt")){
            if (tanksToys.getRand() + carsToys.getRand() > 100){
                throw new ArithmeticException("Шанс выпадания превышен, поправьте значения");
            }
            else {
                while (count < attempt) {
                    i = (int) (Math.random() * 100) + 1;
                    if (i < MaxShans) {
                        toys.add(new TanksToys(count+1, "T34", tanksToys.getRand()));
                    } else {
                        toys.add(new CarsToys(count+1, "Cars", carsToys.getRand()));
                    }
                    count++;
                }
                for (Toys toy : toys) {
                    String str = toy.toString();
                    file.write(str + '\n');
                }
            }
        System.out.println(toys);}
    }

    @Override
    public void random() {
        System.out.println("введите шанс выпадания танков");
        tanksToys.setRand(sc.nextInt());
        System.out.println("введите шанс выпадания машинок");
        carsToys.setRand(sc.nextInt());
    }

    @Override
    public void FileRW() throws IOException {
        File file = new File("lottery.txt");
        BufferedReader delToys = new BufferedReader(new FileReader(file));
        String text = delToys.readLine();
        if (text != null) {
            System.out.println("Игрушка на выдачу : " + text);


        File temp = new File("lottery2.txt");
        BufferedWriter yyy = new BufferedWriter(new FileWriter(temp));
        String out = "delToys.readLine()";
        while (out != null){
            if (!text.equals(out)){
                out = delToys.readLine();
                yyy.write(out + "\n");
            }
        }
            delToys.close();
            yyy.close();
            boolean del = file.delete();
            boolean rename = temp.renameTo(file);
    }
        else System.out.println("призы кончились");


//        for (int k= 0; k < attempt; k++){
//            assert false;
//            if (!text.equals(out) || out != null){
//                out = delToys.readLine();
//                tmp.write(out + "\n");
//            }
//
//        }

    }
}
