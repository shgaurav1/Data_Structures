import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Suffix_Arrays {

	/**
	 * Author: Gaurav Shrivastava
	 */
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String buffer = in.readLine();
		int n = buffer.length();
		String SuffixArray[] = new String[n];
		for (int i = 0; i < n; i++) {
			SuffixArray[i] = buffer.substring(i, n);
		}
		Arrays.sort(SuffixArray);

	}

}
