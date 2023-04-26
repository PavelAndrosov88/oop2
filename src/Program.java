import lesson2.*;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите команду: \n" +
                "1 - добавить животное, 2 - убрать животное, 3 - посмотреть инф по животному, 4 - издать животному звук\n" +
                "5 - посмотреть инф по всем животным, 6 - издать звук всем, 7 - летать, 8 - ласка, 9 - дрессировать:");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                myZoo.addAnimal(new Chicken(25.1, 1.9, 0xFF0000)); // Писать диалоги под каждый вид, имхо, ту мач...
                break;
            case 2:
                System.out.println("Кого будем убирать? ");
                ex = scan.nextInt();
                myZoo.killAnimal(ex);
                break;
            case 3:
                System.out.println("Номер животного? ");
                ex = scan.nextInt();
                myZoo.getInfo(ex);
                break;
            case 4:
                System.out.println("Номер животного? ");
                ex = scan.nextInt();
                myZoo.kickAnimal(ex);
                break;
            case 5:
                myZoo.printAllAnimals();
                break;
            case 6:
                myZoo.kickAllAnimals();
                break;
            case 7:
                System.out.println("Номер животного ");
                ex = scan.nextInt();
                myZoo.doFly(ex);
                break;
            case 8:
                System.out.println("Кого погладим? ");
                ex = scan.nextInt();
                myZoo.toShowKindness(ex);
                break;
            case 9:
                System.out.println("Кого подрессируем? ");
                ex = scan.nextInt();
                myZoo.doTrain(ex);
                break;

        }

    }
}
