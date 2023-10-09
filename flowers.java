import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class flowers {
    public static class Rose {
        static String flowerName = "Роза";
        static int amount = 5;
    }
    public static class Chamomile {
        static String flowerName = "Ромашка";
    }
    public static class whiteChamomile extends Chamomile {
        static String color = "Белый";
    }
    public static class whiteMiddleChamomile extends whiteChamomile {
        static String length = "Средняя";
        static int price = 50;
        static int amount = 3;
    }
    public static class whiteLongChamomile extends whiteChamomile {
        static String length = "Длинная";
        static int price = 70;
        static int amount = 4;
    }
    public static class greenChamomile extends Chamomile {
        static String color = "Зеленый";
    }
    public static class greenMiddleChamomile extends greenChamomile {
        static String length = "Длинная";
        static int price = 50;
        static int amount = 6;
    }
    public static class yellowChamomile extends Chamomile {
        static String color = "Желтый";
    }
    public static class yellowSmallChamomile extends yellowChamomile {
        static String length = "Маленькая";
        static int price = 100;
        static int amount = 5;
    }
    public static class yellowMiddleChamomile extends yellowChamomile {
        static String length = "Средняя";
        static int price = 150;
        static int amount = 1;
    }
    public static class yellowLongChamomile extends yellowChamomile {
        static String length = "Длинная";
        static int price = 250;
        static int amount = 2;
    }
    public static class whiteRose extends Rose {
        static String color = "Белый";
    }
    public static class whiteMiddleRose extends whiteRose {
        static String length = "Средняя";
        static int price = 50;
    }
    public static class whiteLongRose extends whiteRose {
        static String length = "Длинная";
        static int price = 70;
    }
    public static class greenMiddleRose extends Rose {
        static String color = "Зеленый";
        static String length = "Средняя";
        static int price = 50;
    }
    public static class yellowRose extends Rose {
        static String color = "Желтый";
    }
    public static class yellowSmallRose extends yellowRose {
        static String length = "Маленькая";
        static int price = 100;
    }
    public static class yellowMiddleRose extends yellowRose {
        static String length = "Средняя";
        static int price = 150;
    }
    public static class yellowLongRose extends yellowRose {
        static String length = "Длинная";
        static int price = 250;
    }
    public static class redRose extends Rose {
        static String color = "Красный";
    }
    public static class redSmallRose extends redRose {
        static String length = "Маленькая";
        static int price = 50;
    }
    public static class redMiddleRose extends redRose {
        static String length = "Средняя";
        static int price = 70;
    }
    public static class pinkRose extends Rose {
        static String color = "Розовый";
    }
    public static class pinkSmallRose extends pinkRose {
        static String length = "Маленькая";
        static int price = 100;
    }
    public static class pinkLongRose extends pinkRose {
        static String length = "Длинная";
        static int price = 50;
    }
    public static class burgundyRose extends Rose {
        static String color = "Бордовый";
    }
    public static class burgundyMiddleRose extends burgundyRose {
        static String length = "Средняя";
        static int price = 150;
    }
    public static class burgundyLongRose extends burgundyRose {
        static String length = "Длинная";
        static int price = 250;
    }
    public static void main(String[] args) throws IOException, InterruptedException, MyException {
        System.out.println("Здравствуйте! Список цветов в наличии:");
        Thread.sleep(1500);
        for (int i = 1; i < 19; i++) {
            if (i < 7) { // Ромашки
                System.out.print(i + "." + " Тип цветка: " + Chamomile.flowerName);
                if (i < 3) {
                    System.out.print(", Цвет: " + whiteChamomile.color);
                    if (i == 1) {
                        System.out.println(", Длина: " + whiteMiddleChamomile.length + ", Стоимость: " + whiteMiddleChamomile.price + ", Количество в наличии: " + whiteMiddleChamomile.amount + ".");
                    }
                    if (i == 2) {
                        System.out.println(", Длина: " + whiteLongChamomile.length + ", Стоимость: " + whiteLongChamomile.price + ", Количество в наличии: " + whiteLongChamomile.amount + ".");
                    }
                }
                if (i == 3) {
                    System.out.println(" , Цвет: " + greenMiddleChamomile.color + ", Длина: " + greenMiddleChamomile.length + ", Стоимость: " + greenMiddleChamomile.price + ", Количество в наличии: " + greenMiddleChamomile.amount + ".");
                }
                if (i > 3) {
                    System.out.print(" , Цвет: " + yellowChamomile.color);
                    if (i == 4) {
                        System.out.println(", Длина: " + yellowSmallChamomile.length + ", Стоимость: " + yellowSmallChamomile.price + ", Количество в наличии: " + yellowSmallChamomile.amount + ".");
                    }
                    if (i == 5) {
                        System.out.println(", Длина: " + yellowMiddleChamomile.length + ", Стоимость: " + yellowMiddleChamomile.price + ", Количество в наличии: " + yellowMiddleChamomile.amount + ".");
                    }
                    if (i == 6) {
                        System.out.println(", Длина: " + yellowLongChamomile.length + ", Стоимость: " + yellowLongChamomile.price + ", Количество в наличии: " + yellowLongChamomile.amount + ".");
                    }
                }
            }
            else {
                System.out.print(i + "." + " Тип цветка: " + Rose.flowerName);
                if (i < 9) {
                    System.out.print(" , Цвет: " + whiteRose.color);
                    if (i == 7) {
                        System.out.println(", Длина: " + whiteMiddleRose.length + ", Стоимость: " + whiteMiddleRose.price + ", Количество в наличии: " + whiteMiddleRose.amount + ".");
                    }
                    if (i == 8) {
                        System.out.println(", Длина: " + whiteLongRose.length + ", Стоимость: " + whiteLongRose.price + ", Количество в наличии: " + whiteLongRose.amount + ".");
                    }
                }
                else if (i == 9) {
                    System.out.println(" , Цвет: " + greenMiddleRose.color + ", Длина: " + greenMiddleRose.length + ", Стоимость: " + greenMiddleRose.price + ", Количество в наличии: " + greenMiddleRose.amount + ".");
                }
                else if (i < 13) {
                    System.out.print(" , Цвет: " + yellowRose.color);
                    if (i == 10) {
                        System.out.println(", Длина: " + yellowSmallRose.length + ", Стоимость: " + yellowSmallRose.price + ", Количество в наличии: " + yellowSmallRose.amount + ".");
                    }
                    if (i == 11) {
                        System.out.println(", Длина: " + yellowMiddleRose.length + ", Стоимость: " + yellowMiddleRose.price + ", Количество в наличии: " + yellowMiddleRose.amount + ".");
                    }
                    if (i == 12) {
                        System.out.println(", Длина: " + yellowLongRose.length + ", Стоимость: " + yellowLongRose.price + ", Количество в наличии: " + yellowLongRose.amount + ".");
                    }
                }
                else if (i < 15) {
                    System.out.print(" , Цвет: " + redRose.color);
                    if (i == 13) {
                        System.out.println(", Длина: " + redSmallRose.length + ", Стоимость: " + redSmallRose.price + ", Количество в наличии: " + redSmallRose.amount + ".");
                    }
                    if (i == 14) {
                        System.out.println(", Длина: " + redMiddleRose.length + ", Стоимость: " + redMiddleRose.price + ", Количество в наличии: " + redMiddleRose.amount + ".");
                    }
                }
                else if (i < 17) {
                    System.out.print(" , Цвет: " + pinkRose.color);
                    if (i == 15) {
                        System.out.println(", Длина: " + pinkLongRose.length + ", Стоимость: " + pinkLongRose.price + ", Количество в наличии: " + pinkLongRose.amount + ".");
                    }
                    if (i == 16) {
                        System.out.println(", Длина: " + pinkSmallRose.length + ", Стоимость: " + pinkSmallRose.price + ", Количество в наличии: " + pinkSmallRose.amount + ".");
                    }
                }
                else {
                    System.out.print(" , Цвет: " + burgundyRose.color);
                    if (i == 17) {
                        System.out.println(", Длина: " + burgundyMiddleRose.length + ", Стоимость: " + burgundyMiddleRose.price + ", Количество в наличии: " + burgundyMiddleRose.amount + ".");
                    }
                    if (i == 18) {
                        System.out.println(", Длина: " + burgundyLongRose.length + ", Стоимость: " + burgundyLongRose.price + ", Количество в наличии: " + burgundyLongRose.amount + ".");
                    }
                }
            }
        }
        ArrayList<String> Length = new ArrayList<>();
        ArrayList<String> Color = new ArrayList<>();
        ArrayList<Integer> Price = new ArrayList<>();
        Thread.sleep(5000);
        System.out.println("Какое количество цветов будет у вас в букете?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String needFlowers1 = reader.readLine();
        int needFlowers = Integer.parseInt(needFlowers1);
        for (int i = 0; i < needFlowers; i++) {
            System.out.println("Выберите номер позиции, которую хотите добавить (номер - крайний слева в списке цветов): ");
            System.out.println("Выберите еще " + (needFlowers-i) + " цветка");
            String number1 = reader.readLine();
            int number = Integer.parseInt(number1);
            if (number == 1) {
                if (whiteMiddleChamomile.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(whiteMiddleChamomile.length);
                    Color.add(whiteMiddleChamomile.color);
                    Price.add(whiteMiddleChamomile.price);
                    whiteMiddleChamomile.amount = whiteMiddleChamomile.amount - 1;
                }
            }
            if (number == 2) {
                if (whiteLongRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(whiteLongRose.length);
                    Color.add(whiteLongRose.color);
                    Price.add(whiteLongRose.price);
                    whiteLongRose.amount = whiteLongRose.amount - 1;
                }
            }
            if (number == 3) {
                if (greenMiddleChamomile.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(greenMiddleChamomile.length);
                    Color.add(greenMiddleChamomile.color);
                    Price.add(greenMiddleChamomile.price);
                    greenMiddleChamomile.amount = greenMiddleChamomile.amount - 1;
                }
            }
            if (number == 4) {
                if (yellowSmallChamomile.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowSmallChamomile.length);
                    Color.add(yellowSmallChamomile.color);
                    Price.add(yellowSmallChamomile.price);
                    yellowSmallChamomile.amount = yellowSmallChamomile.amount - 1;
                }
            }
            if (number == 5) {
                if (yellowMiddleChamomile.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowMiddleChamomile.length);
                    Color.add(yellowMiddleChamomile.color);
                    Price.add(yellowMiddleChamomile.price);
                    yellowMiddleChamomile.amount = yellowMiddleChamomile.amount - 1;
                }
            }
            if (number == 6) {
                if (yellowLongChamomile.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowLongChamomile.length);
                    Color.add(yellowLongChamomile.color);
                    Price.add(yellowLongChamomile.price);
                    yellowLongChamomile.amount = yellowLongChamomile.amount - 1;
                }
            }
            if (number == 7) {
                if (whiteMiddleRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(whiteMiddleRose.length);
                    Color.add(whiteMiddleRose.color);
                    Price.add(whiteMiddleRose.price);
                    whiteMiddleRose.amount = whiteMiddleRose.amount - 1;
                }
            }
            if (number == 8) {
                if (whiteLongRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(whiteLongRose.length);
                    Color.add(whiteLongRose.color);
                    Price.add(whiteLongRose.price);
                    whiteLongRose.amount = whiteLongRose.amount - 1;
                }
            }
            if (number == 9) {
                if (greenMiddleRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(greenMiddleRose.length);
                    Color.add(greenMiddleRose.color);
                    Price.add(greenMiddleRose.price);
                    greenMiddleRose.amount = greenMiddleRose.amount - 1;
                }
            }
            if (number == 13) {
                if (redSmallRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(redSmallRose.length);
                    Color.add(redSmallRose.color);
                    Price.add(redSmallRose.price);
                    redSmallRose.amount = redSmallRose.amount - 1;
                }
            }
            if (number == 10) {
                if (yellowSmallRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowSmallRose.length);
                    Color.add(yellowSmallRose.color);
                    Price.add(yellowSmallRose.price);
                    yellowSmallRose.amount = yellowSmallRose.amount - 1;
                }
            }
            if (number == 11) {
                if (yellowMiddleRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowMiddleRose.length);
                    Color.add(yellowMiddleRose.color);
                    Price.add(yellowMiddleRose.price);
                    yellowMiddleRose.amount = yellowMiddleRose.amount - 1;
                }
            }
            if (number == 12) {
                if (yellowLongRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(yellowLongRose.length);
                    Color.add(yellowLongRose.color);
                    Price.add(yellowLongRose.price);
                    yellowLongRose.amount = yellowLongRose.amount - 1;
                }
            }
            if (number == 14) {
                if (redMiddleRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(redMiddleRose.length);
                    Color.add(redMiddleRose.color);
                    Price.add(redMiddleRose.price);
                    redMiddleRose.amount = redMiddleRose.amount - 1;
                }
            }
            if (number == 15) {
                if (pinkLongRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(pinkLongRose.length);
                    Color.add(pinkLongRose.color);
                    Price.add(pinkLongRose.price);
                    pinkLongRose.amount = pinkLongRose.amount - 1;
                }
            }
            if (number == 16) {
                if (pinkSmallRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                }  else {
                    Length.add(pinkSmallRose.length);
                    Color.add(pinkSmallRose.color);
                    Price.add(pinkSmallRose.price);
                    pinkSmallRose.amount = pinkSmallRose.amount - 1;
                }
            }
            if (number == 17) {
                if (burgundyMiddleRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(burgundyMiddleRose.length);
                    Color.add(burgundyMiddleRose.color);
                    Price.add(burgundyMiddleRose.price);
                    burgundyMiddleRose.amount = burgundyMiddleRose.amount - 1;
                }
            }
            if (number == 18) {
                if (burgundyLongRose.amount == 0) {
                    System.out.println("Этого цветка больше нет в наличии, выберите другой цветок!");
                    i--;
                } else {
                    Length.add(burgundyLongRose.length);
                    Color.add(burgundyLongRose.color);
                    Price.add(burgundyLongRose.price);
                    burgundyLongRose.amount = burgundyLongRose.amount - 1;
                }
            }
        }
        List<String> uniqueLength = Length.stream().distinct().toList();
        if (uniqueLength.size() != 1) {
            try {
                throw new MyException("Цветы должны быть одинаковой длины! Перезапустите программу!");
            } catch (MyException e) {
                throw new MyException("Цветы должны быть одинаковой длины! Перезапустите программу!");
            }
        }

        List<String> uniqueColor = Color.stream().distinct().toList();
        if (needFlowers <= 3 || uniqueColor.size()==1) {
            System.out.println("Это хороший букет!");
        }
        int sum = 0;
        for (Integer integer : Price) {
            sum = sum + integer;
        }
        System.out.println("Стоимость букета: " + sum + ".");
    }
    //
}
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}