package a_DSA_leetcode;

public class _1482_Minimum_Number_of_Days_to_Make_m_Bouquets {

    public static int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        if ((long) m * k > n) return -1; // Impossible case

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        // Find min and max bloom days
        for (int i = 0; i < n; i++) {
            l = Math.min(l, bloomDay[i]);
            r = Math.max(r, bloomDay[i]);
        }
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            
            if (IsPossible(bloomDay, m, k, mid)) {
                r = mid; 
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }
    
    
    public static boolean IsPossible(int[] bloomDay, int m, int k, int mid) {
        
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
