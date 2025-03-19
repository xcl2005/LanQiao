import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Tanxin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		int sum = 0;
		while (list.size()>1) {
			Collections.sort(list);
			sum+=list.get(0)+list.get(1);
			list.add(list.get(0)+list.get(1));
			list.remove(list.get(0));
			list.remove(list.get(0));
		}
		System.out.println(sum);
	}

}
