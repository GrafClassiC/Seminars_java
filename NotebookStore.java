package seminar1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Notebook {
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Notebook(int ram, int storage, String os, String color) {
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook [ram=" + ram + ", storage=" + storage + ", os=" + os + ", color=" + color + "]";
    }
}

public class NotebookStore {
    private static Set<Notebook> notebooks = new HashSet<>();

    public static void main(String[] args) {
        // Создание множества ноутбуков
        createNotebooks();

        // Запрос критериев фильтрации
        Map<String, Integer> filterCriteria = getFilterCriteria();

        // Фильтрация ноутбуков
        Set<Notebook> filteredNotebooks = filterNotebooks(filterCriteria);

        // Вывод отфильтрованных ноутбуков
        System.out.println("Отфильтрованные ноутбуки:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    private static void createNotebooks() {
        notebooks.add(new Notebook(8, 256, "Windows 10", "Черный"));
        notebooks.add(new Notebook(16, 512, "macOS", "Серебристый"));
        notebooks.add(new Notebook(8, 1024, "Ubuntu", "Белый"));
        notebooks.add(new Notebook(12, 256, "Windows 11", "Синий"));
        notebooks.add(new Notebook(16, 512, "macOS", "Золотой"));
    }

    private static Map<String, Integer> getFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> filterCriteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        switch (choice) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                filterCriteria.put("ram", scanner.nextInt());
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                filterCriteria.put("storage", scanner.nextInt());
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                filterCriteria.put("os", scanner.nextLine().trim().hashCode());
                break;
            case 4:
                System.out.print("Введите цвет: ");
                filterCriteria.put("color", scanner.nextLine().trim().hashCode());
                break;
            default:
                System.out.println("Некорректный выбор.");
                return getFilterCriteria();
        }

        return filterCriteria;
    }

    private static Set<Notebook> filterNotebooks(Map<String, Integer> filterCriteria) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean matchesFilter = true;

            for (Map.Entry<String, Integer> entry : filterCriteria.entrySet()) {
                String field = entry.getKey();
                int value = entry.getValue();

                switch (field) {
                    case "ram":
                        if (notebook.getRam() < value) {
                            matchesFilter = false;
                            break;
                        }
                        break;
                    case "storage":
                        if (notebook.getStorage() < value) {
                            matchesFilter = false;
                            break;
                        }
                        break;
                    case "os":
                        if (notebook.getOs().hashCode() != value) {
                            matchesFilter = false;
                            break;
                        }
                        break;
                    case "color":
                        if (notebook.getColor().hashCode() != value) {
                            matchesFilter = false;
                            break;
                        }
                        break;
                }

                if (!matchesFilter) {
                    break;
                }
            }

            if (matchesFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}