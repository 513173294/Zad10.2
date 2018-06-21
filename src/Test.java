import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Direction[] kierunek = Direction.values();
        for (Direction aKierunek : kierunek) {
            System.out.println(aKierunek);
        }


        System.out.println("podaj kierunek geogrficzny");
        String desiredDirection = scanner.nextLine();
        Direction direction = Direction.valueOf(desiredDirection);
        System.out.println("ok wiec idziemy na "+ direction.printDirection());

        System.out.println("a gdzie teraz chcesz isc? "+"\n" + "podaj od 0 - 3 ");
        int desiredDirection2 = scanner.nextInt();
        System.out.println("ok zmieniamy wieca kierunek na: " + direction.convert(desiredDirection2));
    }
}
