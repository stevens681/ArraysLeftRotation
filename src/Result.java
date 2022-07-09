import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int n = a.size();
        for(int i = 0; i < n; i++){
            res.add(a.get((i+d)%n));
        }
        return res;
    }

    public static void main(String[] args) {
        String list = "1 2 3 4 5";
        List<Integer> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add(Character.getNumericValue(i));

        }
        System.out.println(rotLeft(arr, 4));
    }
}
