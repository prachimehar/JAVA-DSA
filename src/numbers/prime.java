package numbers;

public class prime {
    public static boolean isPrimeByRecursion(int n,int i){
        if(n<=1) return false;
        if(i*i > n) return true;
        if(n%i == 0) return false;

        return isPrimeByRecursion(n,i+1);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // prime number in range
        int start = 10, end = 100;
        int c=0;
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                c++;
                System.out.println(i);
            }
        }
        int count =0;
        System.out.println("count = "+c);
        for (int i = start; i <= end; i++) {
            if(isPrimeByRecursion(i,2)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count = "+count);


//  brute force --------------------
//        int n = 9;
//        int c = 0;
//        boolean isPrime = false;
//        for(int i=1; i<= n; i++){
//            if(n%i == 0){
//                c++;
//                if(c == 2){
//                    isPrime = true;
//                }
//                else{
//                    isPrime = false;
//                }
//            }
//        }
//        String ans = isPrime ? "Prime no. ": "not prime no";
//        System.out.println(ans);



    }
}
