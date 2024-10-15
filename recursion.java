public class recursion{
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(fib(7));
        
    }
    public static float factorial(float n){
        if( n ==0){ 
            return 1;
        }
        else{
            return n * (factorial(n-1));
        }
    }
    public static int fib(int n){
        if(n ==1 || n ==2){return 1;}

        else{
            return fib(n-2) + fib(n-1);
        }
    }
}