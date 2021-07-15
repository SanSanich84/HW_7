package HomeWork_7;

import java.sql.Array;
import java.util.Scanner;

public class HW_7 {

    public static void main(String[] args) {
        catEatFood();
    }

    public static void catEatFood() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        Plate plate = new Plate();
        System.out.print("Вывалите еду в кошачью тарелку: ");
        plate.plateAddFood(scan.nextInt());
        Cats[] cats = {
                new Cats("Барсик", 80, 50),
                new Cats("Мурзик", 60, 70),
                new Cats("Жульен", 90, 45)};

        while (plate.getFood() > 0) {
            for (int j = 0; j < cats.length; j++) {
                if (plate.getFood() > 0) {
                    cats[j].eat(plate);

                }

            }
        }
    }

}
