import java.io.; import java.util.;

public class Solution {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        System.out.println(sumMultiplesOf3And5(n));
    }
    in.close();
}
public static long sumMultiplesOf3And5(int n){
    return sumOfMultiples(n - 1, 3) + sumOfMultiples(n - 1, 5) - sumOfMultiples(n - 1, 15);
}
public static long sumOfMultiples(int n, int k){
     long m = n / k;
    return k  m  (m + 1) / 2;
}
