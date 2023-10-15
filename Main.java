import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Brand 1", "Model 1 Белый", 8, 500, 10, 1));
        notebooks.add(new Notebook("Brand 2", "Model 2 Чёрный", 16, 1000, 11, 2));
        notebooks.add(new Notebook("Brand 3", "Model 3 Белый", 8, 1000, 8, 1));
        notebooks.add(new Notebook("Brand 4", "Model 4 Чёрный", 16, 500, 11, 2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет (1 - белый , 2 - чёрный)");
        System.out.println("0 - Выход");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        int criterion = scanner.nextInt();
                // Запрос минимального значения критерия фильтрации
        if (criterion == 0){
                System.exit(0);    
                }
                System.out.println("Введите минимальное значение для выбранного критерия:");
                int minValue = scanner.nextInt();
                scanner.close();
                // Фильтрация и вывод ноутбуков
                notebooks = filterNotebooks(notebooks, criterion, minValue);
                System.out.println("Результаты фильтрации:");
                for (Notebook notebook : notebooks) {
                    System.out.println(notebook.getBrand() + " " + notebook.getModel());
                }
            
    }

    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, int criterion, int minValue) {
        Set<Notebook> filteredNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            // Проверка соответствия критерию фильтрации
            switch (criterion) {
                case 1:
                    if (notebook.getRam() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getStorage() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 3:
                    if(notebook.getOs() >= minValue){
                        filteredNotebooks.add(notebook);    
                    }
                case 4:
                    if(notebook.getColor() == minValue){
                        filteredNotebooks.add(notebook);    
                    }           

            }
        }
        return filteredNotebooks;
    }
}
