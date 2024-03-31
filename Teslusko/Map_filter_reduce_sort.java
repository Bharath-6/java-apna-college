import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Map_filter_reduce_sort {
    public static void main(String a[]) {
        // map
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        // Result: squaredNumbers = [1, 4, 9, 16, 25]

        // Filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        // Result: evenNumbers = [2, 4]

        // reduce
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce((x, y) -> x + y);
        // Result: sum = 15

        // Sorted
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        // Result: sortedNames = ["Alice", "Bob", "Charlie", "David"]

    }
}
