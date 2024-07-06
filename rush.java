package seminar1;

import java.util.Scanner;

public class rush {

    /*
     * Метод length() позволяет узнать длину строки – сколько в ней символов.
     * н-р
     * String name = "Rome";
     * int count = name.length();
     * 
     */
    /*
     * Метод toLowerCase() позволяет преобразовать все символы строки в маленькие
     * (строчные)
     * н-р
     * String name = "ROM123";
     * String name2 = name.toLowerCase()
     */

    /*
     * Метод toUpperCase() позволяет преобразовать все символы строки в большие
     * (заглавные)
     * н-р
     * String name = "rom123";
     * String name2 = name.toUpperCase();
     */

    // Чтение с клавиатуры
    /*
     * Scanner console = new Scanner(System.in); //Создаем объект класса Scanner.
     * String name = console.nextLine(); //Читаем с клавиатуры строку текста.
     * int age = console.nextInt(); //Читаем с клавиатуры число.
     * double number = console.nextDouble(); // Чтобы считать с клавиатуры дробное
     * числo
     */

    // Метод Описание
    // nextByte() Считывает данные и преобразует их в тип byte
    // nextShort() Считывает данные и преобразует их в тип short
    // nextInt() Считывает данные и преобразует их в тип int
    // nextLong() Считывает данные и преобразует их в тип long
    // nextFloat() Считывает данные и преобразует их в тип float
    // nextDouble() Считывает данные и преобразует их в тип double
    // nextBoolean() Считывает данные и преобразует их в тип boolean
    // next() Считывает одно «слово». Слова разделяются пробелами или enter
    // nextLine() Считывает целую строку

    // Есть еще методы, которые позволяют проверить тип еще не считанных данных
    // (чтобы знать, каким методом их считывать).

    // Метод Описание
    // hasNextByte() Там тип byte? Его можно будет преобразовать к byte?
    // hasNextShort() Там тип short? Его можно будет преобразовать к short?
    // hasNextInt() Там тип int? Его можно будет преобразовать к int?
    // hasNextLong() Там тип long? Его можно будет преобразовать к long?
    // hasNextFloat() Там тип float? Его можно будет преобразовать к float?
    // hasNextDouble() Там тип double? Его можно будет преобразовать к double?
    // hasNextBoolean() Там тип boolean? Его можно будет преобразовать к boolean?
    // hasNext() Там есть еще одно слово?
    // hasNextLine() Там есть еще одна строка?

    /*
     * Чтобы Scanner принимал строку на ввод предварительно введенную
     * String str = "текст";
     * Scanner scanner = new Scanner(str);
     */

    // Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28
    // (включительно), то вывести надпись
    // "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

    // Пример ввода:
    // Amigo
    // 18
    // Пример вывода:
    // Amigo, явитесь в военкомат

    // Требования:
    // Программа должна считывать данные с клавиатуры два раза.
    // Программа должна использовать команду System.out.println() или
    // System.out.print().
    // Если возраст в пределах 18-28 (включительно), то вывести только сообщение
    // "Имя, явитесь в военкомат".
    // Если возраст не находится в указанных пределах, то ничего выводить не нужно.

    /*
     * Призывная кампания
     */

    // public static void main(String[] args) {
    // String militaryCommissar = ", явитесь в военкомат";
    // //напишите тут ваш код
    // Scanner console = new Scanner(System.in);
    // String name = console.nextLine();
    // int age = console.nextInt();
    // if (age >= 18) {
    // if (age <= 28) {
    // System.out.println(name + militaryCommissar);
    // }
    // }

    // }
    // У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран 
    // большее из них. Если числа одинаковые, то выводится любое.
    // Перепиши программу с использованием тернарного оператора, 
    // чтобы ее функционал остался без изменений.
    
    // Требования:
    // •	Программа должна считывать два числа c клавиатуры.
    // •	Вместо оператора if-else в программе нужно использовать тернарный оператор.
    // •	Функционал программы не должен измениться.
// public class Solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int numberA = scanner.nextInt();
//         int numberB = scanner.nextInt();
        
//         System.out.println(numberA > numberB ? numberA : numberB);
//     }

// Но это еще не все: разница чисел вполне может оказаться отрицательным числом. 
// Поэтому, чтобы такой подход работал, нужно сравнивать не просто разницу чисел, а модуль 
// разницы чисел: |a-b|

// В Java есть специальный метод для вычисления модуля числа — Math.abs():

// int m = Math.abs(значение);
// Поэтому исправленный вариант нашего примера выше будет выглядеть вот так:

// double a = 1.000001;
// double b = 1.000002;

// if ( Math.abs(b - a) < 0.0001 )
//    System.out.println("Числа равны");
// else
//    System.out.println("Числа не равны");


// Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и 
// выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.

// Требования:
// •	Программа должна считывать два числа c клавиатуры.
// •	Если числа равны, то программа должна вывести сообщение "числа равны".
// •	Если числа не равны, то программа должна вывести сообщение "числа не равны".
// •	Точность сравнения должна достигать одной миллионной (0.000001).

// public class Solution {
//     public static void main(String[] args) {
//         //напишите тут ваш код
//         Scanner console = new Scanner(System.in);
//         double a = console.nextDouble();
//         double b = console.nextDouble();
//         if ( Math.abs(b -a) < 0.000001) {
//             System.out.println("числа равны");
//         //напишите тут ваш код
//         } else {
//             System.out.println("числа не равны");
//         }
//     }
// }
//}
// 
// public class Solution {
//     public static void main(String[] args) {
//         //напишите тут ваш код
//         Scanner console = new Scanner(System.in);
//         String a = console.next();
//         String b = console.next();
//         if (a.equals(b)) {
//             System.out.println("строки одинаковые");
//         } else {
//         //напишите тут ваш код
//         System.out.println("строки разные");
//         }
//     }
// }




}