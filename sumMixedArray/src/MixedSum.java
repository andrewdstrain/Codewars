import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer or String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(num -> Integer.parseInt(num.toString())).sum();
    }
}
