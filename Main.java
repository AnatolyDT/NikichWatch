import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует СЧЕТЧИК КАЛОРИЙ");
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1){
                // Вводим количество шагов за день
            }else if (userInput == 2){
                //Печатаем статистику за определенный месяц
            }else if (userInput == 3){
                newTarget (scanner); //Изменяем цель по шагам в день
            }else if (userInput == 4){
                break; // это выход по команде, готово
            }else {
                System.out.println("Такой команды не существует. Пожалуйста, введите верную команду");
            }


            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }


    private static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день;");
        System.out.println("2 - Напечатать статистику за определённый месяц;");
        System.out.println("3 - Изменить цель по количеству шагов в день;");
        System.out.println("4 - Выйти из приложения.");
    }
    public static int newTarget (Scanner scanner){
        int target = 10000;
        System.out.println("Введите новую цель.");
        int userTarget = scanner.nextInt();

        if (userTarget>=0) {
            target = userTarget;
            System.out.println("Новая цель - " + target);
        } else {
            System.out.println("Ввод отрицательного числа невозможен, попробуйте задать цель еще раз!");
        }
        return target;
    }
}

class Converter {

}

class StepTracker {

    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
    }
}