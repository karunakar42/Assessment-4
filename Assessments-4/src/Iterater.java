import java.util.*;

public class Iterater{
	public static void main(String[] args) {
		System.out.println(javaIterator(5,8,new int[] {1,6,9,2,11}));
	}
    public static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num < k) {
                itr.remove();
            }
        }
        Collections.sort(list);
        return list;
    }
}
