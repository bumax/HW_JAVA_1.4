import exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                Ex1.RunRev(20);
                break;
            case 2:
                // За названия класса сорян, но я их обзываю по номеру задания :-)
                Ex2 queue = new Ex2(20);
                // Исходный список
                queue.print();
                // enqueue:
                System.out.println("Проверяем метод enqueue:");
                queue.enqueue(123);
                queue.print();
                // dequeue:
                System.out.println("Проверяем метод dequeue:");
                System.out.println("Первый элемент очереди был: " + queue.dequeue() + ", и мы его удалили :-(");
                queue.print();
                // first:
                System.out.println("Проверяем метод first:");
                System.out.println("Первый элемент очереди: " + queue.first() + ", и мы его оставили! :-)");
                queue.print();
                break;
        }

    }
}