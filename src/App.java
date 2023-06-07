import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        // 1
        List<String> cities = new ArrayList<>(List.of("Vilnius", "Kaunas", "Klaipeda", "Alytus", "Siauliai", "Jurbarkas", "Marijampole"));
        cities.stream()
                .forEach(s -> System.out.print(s.length() + ", "));
        System.out.println();

        // 2
        List<Integer> numbers = new ArrayList<>();
        for(int counter = 1; counter <= 30; counter++) {
            numbers.add(new Random().nextInt(-101, 101));
        }

        Integer maxNum = numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNum = numbers.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Min=" + minNum + " , max=" + maxNum);

        // 3
        boolean isDivisibleByFive = numbers.stream()
                .anyMatch(num -> num % 5 == 0);
        System.out.println("There is a number divisible by 5: " + isDivisibleByFive);

        // 4
        Integer divisibleByThree = numbers.stream()
                .filter(num -> num % 3 == 0)
                .findFirst()
                .get();
        System.out.println("First number that divides from 3=" + divisibleByThree);

        // 5
        Integer sumOfBiggerThanFive = numbers.stream()
                .filter(num -> num > 5)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers bigger than 5=" + sumOfBiggerThanFive);

        // 6
        numbers.stream()
                .distinct()
                .forEach(num -> System.out.print(num + ", "));
        System.out.println();

        // 7
        Integer sumOfAll = numbers.stream()
                .reduce(0, (a, b )-> a + b);
        System.out.println("Sum of all numbers=" + sumOfAll);

        // 8
        boolean isPositiveNum = numbers.stream()
                .anyMatch(num -> num > 0 );
        System.out.println("There is at least one positive number: " + isPositiveNum);

        // 9
        List<String> citiesByLetterCount = cities.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(citiesByLetterCount);

        // 10
        List<String> citiesUpperCased = cities.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(citiesUpperCased);

        // 11













    }
}
