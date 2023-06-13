import java.util.*;

public class LaptopFilter {
    Set<Laptop> laptops;
    Set<Colour> byColour;
    Set<Brand> byBrand;

    public LaptopFilter(Set<Laptop> laptops) {
        this.laptops = laptops;
        this.byBrand = new HashSet<>();
        this.byColour = new HashSet<>();
    }

    public void inputFilter() {
        int command = 0;
        while (command != 3) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - цвет\n2 - бренд\n3 - вывести ноутбуки");
            Scanner scanner = new Scanner(System.in);
            command = Integer.parseInt(scanner.next());
            switch (command) {
                case 1:
                    inputColour(scanner);
                    break;
                case 2:
                    inputBrand(scanner);
                    break;
                case 3:
                    filter();
                    break;
                default:
                    System.out.println("Ошибка! Действие не определено");
                    return;
            }
        }
    }

    void inputColour(Scanner scanner) {
        System.out.print("Введите цвет (WHITE, BLACK, RED, PINK) :");
        Colour colour = Colour.valueOf(scanner.next().toUpperCase());
        byColour.add(colour);
    }

    void inputBrand(Scanner scanner) {
        System.out.print("Введите бренд (SAMSUNG, ASUS, LENOVO, MSI, HP): ");
        Brand brand = Brand.valueOf(scanner.next().toUpperCase());
        byBrand.add(brand);
    }

    void filter() {
        List<Laptop> laptopList = new ArrayList<>(laptops);
        if (!byBrand.isEmpty()) {
            laptopList.removeIf(laptop -> !byBrand.contains(laptop.getBrand()));
        }
        if (!byColour.isEmpty()) {
            laptopList.removeIf(laptop -> !byColour.contains(laptop.getColour()));
        }

        System.out.println(laptopList);
    }
}