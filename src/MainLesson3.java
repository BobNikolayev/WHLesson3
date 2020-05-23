import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

public class MainLesson3 {

    static Scanner sc;
    static Random random;

    public static void main(String[] args) {

        int counter = 0;

        while(counter == 0){

            GameGuessNum();

            System.out.println("Чтобы повторить игру введите 1 чтобы закончить 0.");

            int userConntinue = sc.nextInt();

            switch (userConntinue){
                case 1:break;

                case 0: System.out.println("Спасибо за игру.");
                    counter++;
            }
        }

    }

    public static void GameGuessNum() {

        random = new Random();

        int randNum = random.nextInt(9);

        sc = new Scanner(System.in);

        int counter = 0;

        System.out.println("Введите число от 0 до 9.");


        for (int i = 0; i < 3; i++) {

            int userNum = sc.nextInt();

            if(userNum < randNum){
                System.out.println("Ваше число меньше Загаданого.");
            }
            else if(userNum > randNum){
                System.out.println("Ваше число больше загаданого.");
            }
            else if(userNum == randNum){
                System.out.println("Вы угадали!");
                counter++;
                break;
            }

        }

        System.out.println("Игра закончена.");



    }
}