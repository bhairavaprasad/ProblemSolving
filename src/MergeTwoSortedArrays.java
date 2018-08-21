import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 8 };
		int[] b = { 1, 3, 6, 9 };
		int[] c = merge(a, b);
		System.out.println(Arrays.toString(c));
	}

	private static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int c_length = a.length + b.length;
		int a_index = 0;
		int b_index = 0;
		int i = 0;
		for (; i < c_length; i++) {
			if (a_index == a.length || b_index == b.length) {
				break;
			}
			if (a[a_index] <= b[b_index]) {
				c[i] = a[a_index];
				a_index++;
			} else {
				c[i] = b[b_index];
				b_index++;
			}
		}
		while (a_index < a.length) {
			c[i] = a[a_index];
			i++;
			a_index++;
		}
		while (b_index < b.length) {
			c[i] = b[b_index];
			i++;
			b_index++;
		}

		return c;
	}

}
