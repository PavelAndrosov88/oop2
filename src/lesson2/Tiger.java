package lesson2;

import java.util.Date;

public class Tiger extends WildAnimal {
    public Tiger(Double height, Double weight, int eyeColor, String wlHabitat, Date fDate) {
        super(height, weight, eyeColor, "Рык", wlHabitat, fDate);
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Тигры (дикие животные)\n" +
                        "Дата нахождения = " + getfDate() + "\n" +
                        "Ареал обитания = " + getWlHabitat() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight()
        );
    }
}
