package Arrays;

public class SearchIn2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixBS(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int l =0, h=( n*m) - 1;
        while(l<=h) {
            int mid = (l+h)/2;
            int row = mid / m, col= mid % m;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Brute Force:");
        System.out.println("Search for " + target1 + ": " + searchMatrix(matrix, target1)); // true
        System.out.println("Search for " + target2 + ": " + searchMatrix(matrix, target2)); // false

        System.out.println("Binary Search:");
        System.out.println("Search for " + target1 + ": " + searchMatrixBS(matrix, target1)); // true
        System.out.println("Search for " + target2 + ": " + searchMatrixBS(matrix, target2)); // false
    }

}
