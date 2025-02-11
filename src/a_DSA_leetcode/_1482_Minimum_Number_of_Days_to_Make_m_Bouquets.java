package a_DSA_leetcode;

public class _1482_Minimum_Number_of_Days_to_Make_m_Bouquets {

	public static int minDays(int[] bloomDay, int m, int k) {
        int l = 1;
        int r = (int) Math.pow(10, 9);

        if (bloomDay.length < m * k) {
            return -1;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        int exed = (int) Math.pow(10, 9);
        if (l == exed + 1) {
            return -1;
        }

        return l;
    }

    public static boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int took = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                took++;
            } else {
                took = 0;
            }

            if (took == k) {
                m -= 1;
                took = 0;
            }

            if (m == 0) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2}, m = 3, k = 1;
        System.out.println(minDays(bloomDay, m, k)); 
    }
}
