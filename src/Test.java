import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Direction[] kierunek = Direction.values();
        for (int i = 0; i < kierunek.length; i++) {
            System.out.println(kierunek[i]);
        }


        System.out.println("podaj kierunek geogrficzny");
        String desiredDirection = scanner.nextLine();
        Direction direction = Direction.valueOf(desiredDirection);



        System.out.println("ok wiec idziemy na "+ direction.printDirection());
    }
}
