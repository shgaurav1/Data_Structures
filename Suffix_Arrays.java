import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class Suffix{

	public String element;
	int index;
}
class Suffix_Arrays {

	/**
	 * Author: Gaurav Shrivastava
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String buffer = in.readLine();
		int n = buffer.length();
		Suffix suffixArray[] = new Suffix[n];
		for (int i = 0; i < n; i++) {
			suffixArray[i].element = buffer.substring(i, n);
			suffixArray[i].index = i;
		}
		Arrays.sort(suffixArray);

	}

}
