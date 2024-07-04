//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Упражнение 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" Упражнение 2");

        int clientDeviceYear = 2015;
String msg = clientDeviceYear <=2015 ? " облеченную" : ""
        ;if (clientOS == 0||clientOS ==1) {
            String os = clientOS ==0 ? " iOS" : "Android";

            System.out.println(" Установите " + msg+ " версию приложения для" + os+ " iOS по ссылке.");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else  {
            System.out.println(" Ошибка");
        }

        System.out.println(" Упражнение 3");

        int year = 2021;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println(year + " год находится на числовой оси до введения високосного года в 1584");
        } else {
            System.out.println(year + " год не является високосным");
        }



        System.out.println( " Упражнение 4");

int deliveryDistance=95;
int day=1;
if (deliveryDistance<20){
    System.out.println( " Доставка карты займет " +day+" день");
} else if (deliveryDistance>=20 && deliveryDistance<60) {
    System.out.println( " Доставка карты займет " +(day+1)+" суток");

} else if (deliveryDistance>=60 && deliveryDistance<100){
    System.out.println( " Доставка карты займет " +(day+2)+" суток");
}  else
    System.out.println("Доставки нет");

        System.out.println( " Упражнение 4");
int monthNumber = 12;
switch (monthNumber  ) {
    case 1:
        System.out.println("Зима");
        break;
    case 2:
        System.out.println("Зима");
        break;
    case 3:
        System.out.println("Весна");
        break;
    case 4:
        System.out.println("Весна");
        break;
    case 5:
        System.out.println("Весна");
        break;
    case 6:
        System.out.println("Лето");
        break;
    case 7:
        System.out.println("Лето");
        break;
    case 8:
        System.out.println("Лето");
        break;
    case 9:
        System.out.println("Осень");
        break;
    case 10:
        System.out.println("Осень");
        break;
    case 11:
        System.out.println("Осень");
        break;
    case 12:
        System.out.println("Зима");
        break;
    default:
        System.out.println("Такого месяца не существует");






}


    }}