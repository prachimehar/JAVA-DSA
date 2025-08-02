package Arrays;

import java.util.Arrays;

public class mergeTwoSortedArray {


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int k = 0;
        int[] ans = new int[m+n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        return ans;
    }

    public static void inPlaceMerge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;
        int k = m+n-1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int m=3;
        int n=3;
        int[] ans = merge(n1,m,n2,n);
        System.out.println(Arrays.toString(ans));
        inPlaceMerge(n1,m,n2,n);
        System.out.println(Arrays.toString(n1));

    }

}
