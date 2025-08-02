package numbers;

public class ArmstrongNo {
    public static void main(String[] args) {
        int n=371;
        int temp = n;
        int sum =0;
        int length = String.valueOf(n).length();

        while(n!=0){
            int rem =n%10;
            sum +=(int) Math.pow(rem,length);
            n/=10;
        }
        if(temp == sum) System.out.println("armstrong");
        else{
            System.out.println("not armstrong");
        }
    }
}
