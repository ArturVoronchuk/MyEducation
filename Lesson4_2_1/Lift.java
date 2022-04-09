package Lesson4_2_1;

import java.util.*;

public class Lift {
    public static void main(String[] args) {
        ArrayDeque<Integer> lift = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;

        while (true) {
            System.out.println("Ожидаю ввода номера этажа: (для завершения нажмите 0)");
            int currentFloor = scan.nextInt();
            lift.offer(currentFloor);
            if(previousFloor == currentFloor) { // если нажат тот же этаж, на котором находится лифт
                // TODO: 30.03.2022  доработать код, согласно замечаниям преподавателя - "lift.removeLast();
                //  - не понимаю, почему нельзя СНАЧАЛА определить, подходит ли этаж, а уже потом его добавлять?
                //  Зачем эти добавления-удаления лишние?"
                lift.removeLast();
                continue;
            } else if (currentFloor == 0) {
                System.out.print("Лифт проследовал по следующим этажам:\n");
                for (int floor : lift) {
                    System.out.print("этаж " + lift.poll() + " -> ");
                }
                break;
            }else if (currentFloor < 0 || currentFloor > 25) {
                lift.removeLast();
                System.out.println("Такого этажа нет в доме");
            } else if (previousFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
            }
            previousFloor = currentFloor;
        }
        System.out.println("\nВремя затраченное лифтом на маршрут : " + totalSeconds + " с.");
    }
}
