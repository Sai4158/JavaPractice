package a_DSA_leetcode;

public class _2129_Capitalize_the_Title {

	public static String capitalizeTitle(String title) {

		title = title.toLowerCase();
		String words[] =  title.split(" ");
		String ans = "";
		int n =  words.length;

		for (int i = 0; i < n; i++) {

			String w =  words[i];

			if(w.length() <= 2) {
				ans += w;
			}

			else {
				ans += w.substring(0,1).toUpperCase()+ w.substring(1);

			}

			if(i != n-1) {
				ans += " ";
			}

		}

		return ans;

	}

	public static void main(String[] args) {
		System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
		System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
		System.out.println(capitalizeTitle("i lOve leetcode"));
	}
}
