import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        House house = new House();
//        house.openWindow();
//        house.lockDoor();
//        house.setColorRoof("Burgundy");
//        house.showAbout();
        house.openWindow().lockDoor().setColorRoof("Brown").showAbout();
        System.out.println("_".repeat(50));

        List<Integer> intList = new ArrayList<>(List.of(2, 5, 33, 54, 22, 21, 36, 81, 10, 15, 3));

        Stream<Integer> streamList = intList.stream();
        Stream<Integer> divisibleByThree = streamList.filter(num -> num % 3 == 0);
        List<Integer> divisibleByThreeList = divisibleByThree.toList();
        System.out.println(divisibleByThreeList);

        List<Integer> stremedList = intList.stream().filter(num -> num % 3 == 0).sorted().toList();
        System.out.println(stremedList);

        List<Integer> mappedStreamList = intList.stream().map(e -> e * 100).sorted().toList();
        System.out.println(mappedStreamList);
        System.out.println("_".repeat(50));

        //// challenges








    }
}
