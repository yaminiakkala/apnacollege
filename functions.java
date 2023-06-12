import java.util.*;

public class functions{
    //functio to print my name
    public static void printout(){
        System.out.print("Yamini Saraswathi Akkala");
    }
    //function for swapping the numbers using only two variables
    public static int[] swap(int a,int b){
        int []swa=new int[2];
            b=a+b;
            a=b-a;
            b=b-a;
            swa[0]=a;
            swa[1]=b;
            return(swa) ;
         }
         //function to calculate product
         public static void product(int a,int b){
            int product=a*b;
            System.out.println(product);

         }
         //function to calculate factorial of a given numbers
         public static int factorial(int n){
            int fact=1;
            while(n>0){
                  fact=fact*n;
                  n=n-1;
            }
            return fact;
         }
         //function to calculate binomial coffetient
         public static void binomial_coefficient(){
            int r=2;
            int n=3;
            int r_fact=factorial(r);

            int n_fact=factorial(n);
            int nr_fact=factorial(n-r);
            int bin_coeff=(n_fact)/(r_fact*nr_fact);
            System.out.println(bin_coeff);
           
         }
         //function to add two integer values
         public static int addition(int a,int b){
            int c =a+b;
            return c;
         }
         //function to add 3 integer values
         public static int addition(int a,int b,int c){
            int d=a+b+c;
            return d;
         }
         //function to add two float numbers
         public static float addition(float a,int b){
            float c =a+b;
            return c;
         }
        //function to find whether a given number is prime or composite number
        public static boolean isprime(int n){
            boolean flag=true;
            if(n==2){
                 //flag =true;
                 return true;
            }
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if (n%i==0){
                        // flag=false;
                        // break;
                        // no need for break 
                       return false;
                    }
                    
                }
                return true;
                
            }
            // if(flag==true){
            //     System.out.print("Prime number");
            //   }
            //   else{
            //     System.out.print("Composite number");
            //   }
    

        }
        //function to conver binary number system to decimal number system
        public static int binarytodecimal(int n){
            int power=0;
             int decimal=0;
             while(n>0){
                int last_digit=n%10;
                //
                decimal+=Math.pow(2,power)*last_digit;
                n=n/10;
                power++;
             }
                return decimal;
        }
        //function for converting decimal number to  binary number
        public static int decTObin(int n){
            int pow=0;
            int binary=0;
            while(n>0){
                int rem=n%2;
                binary+=rem*Math.pow(10,pow);
                pow++;
                n/=2;
            }
            return binary;
        }
    public static void main(String []args){
         
       
          int a=10;
          
        System.out.println(++a);


        

       

    }
}
