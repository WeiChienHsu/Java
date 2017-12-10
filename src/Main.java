public class Main {

    public static void main(String[] args) {
        pointOutPrime(21, 7);

    }

    public static void pointOutPrime(int num, int start){
        int count = 1;
        for ( int n = start; n <= num; n++){
            if (isPrime(n)){
                System.out.println( count + ". " + n + " is Prime!");
                count ++;
                if(count > 3){
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

}
