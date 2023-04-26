package lesson2;

public class Chicken extends Bird {

    public Chicken(Double height, Double weight, int eyeColor) {
        super(height, weight, eyeColor, "Кукареку", 0.0);
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Курицы (птицы)\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота = " + getHeight()
        );
    }

    @Override
    public void doFlight() {
        System.out.println("курица не летает");
    }
}
