import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestZone1  {

    public static void mainMenu() {
        System.out.println("\nВыберите действие:\n" +
                "1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход\n");
    }

    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        while (true) {
            mainMenu();
            Scanner input = new Scanner(System.in);
            String inputDo = input.nextLine();
            int inputInt = Integer.parseInt(inputDo);

            switch (inputInt) {
                case 0:
                    System.out.println("Работа программы завершена.");
                    break;
                case 1:
                    System.out.println("Введите описание задачи");
                    String addNotice = input.nextLine();
                    System.out.println("Введите номер пункта, который необходимо добавить");
                    int addTask = input.nextInt();
                    toDoList.add(addTask - 1, addNotice);
                    break;
                case 2:
                    for (int i = 0; i < toDoList.size(); i++) {
                        String tasks = toDoList.get(i);
                        System.out.println(i + 1 + "." + tasks);
                    }
                    break;
                case 3:
                    System.out.println("Введите номер пункта, который необходимо удалить");
                    int removeTask = input.nextInt();
                    toDoList.remove(removeTask - 1);
                    break;
                default:
                    System.out.println("\nВы ввели недопустимое значение.\n");
            }
        }
    }
}
