public class statement13 {
    static int factorial(int n){
        int fact=1;
        for(int i = n; i >0; i-- ){
            fact = fact * i ;
            // System.out.println(fact);
            }
            return fact;
    }
        public static void main(String[] args) {
            int n = 2; 
            int sum = 0 ;
            int rem = 0;
            int z=n;
            
            while(n>0){
                rem = n % 10;
                // System.out.println(rem);

               
                sum = factorial(rem) + sum;
                // System.out.println(sum);
                n = n / 10;
                // System.out.println(n);
            }
            if(z== sum){
                System.out.println("strong");
                }else
                System.out.println("weak");
        }
    
}
