import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class recursion{
    //function for printing numbers in descending order
    public static void printDesNum(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        
         System.out.print(n+" ");
            printDesNum(--n);
    
        
    }
    public static void printIncOrd(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncOrd(n-1);
        System.out.print(n+" ");
    }
    public static int  factorial(int n){
        if(n==0 ){
            return 1;
        }
        return  n*factorial(n-1);
        
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    //caluculate nth term in fibonacci series
    public static int fibonacci(int n){
        if(n==0 || n==1){
            
            return n;
        }
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    //checking if array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
         return isSorted(arr, i+1);

    }
    public static int firstOcr(int arr[],int key,int i){
        if(i>arr.length -1){
            return -1;
        }
        if(arr[i]==key ){
            return i;
        }
        return firstOcr(arr, key, i+1);
        
    }
    //printing last occurence of a number index 
    public static int lastOcuurence(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOcuurence(arr, key, i-1);
    }
    public static int calcXPN(int x,int n){
        if(n==1){
            return x;
        }
        // if(n==0){
        //     return 1;     we can also write this
        // }
        return  x*calcXPN(x, n-1);
    }
    //TC O(log(n))
    public static int optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        // int result = optimizedPower(a, n/2)*optimizedPower(a, n/2);      //here actually TC is O(n) because both function doing same fn at different times.
        // if(n%2!=0){
        //     result=a*result;
        // }
                                                 //i if n is odd we are multiplying with n
        int result=optimizedPower(a, n/2);
        if(n%2 !=0){
           result= a*result*result;                           //O(log n)
        }else{result =result*result;}
        return result;
    }
    public static int tilingProblem(int n){
        //base cond
        if(n==0 || n==1){
            return 1;
        }
        //work and calls
        //vertical choice
        int  Fnm1=tilingProblem(n-1);
        //horizontal choice
        int Fnm2=tilingProblem(n-2);
        int totalways=Fnm1 +Fnm2;
        return totalways;
    }
    public static void removeDup(String str,boolean map[],int indx, StringBuilder newString){
        if(indx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(indx);
        if(map[currchar-'a'] ==true){
            //duplicate element
            removeDup(str, map, indx+1, newString);
        }
        else{
            map[currchar-'a']=true;
            removeDup(str, map, indx+1, newString.append(currchar));
        }
    }
    public static int friendPairs(int n){
        //base condition
        if(n==1 || n==2){
            return n;
        }
        //work condition
        int singles=friendPairs(n-1);
        int pair=(n-1)*friendPairs(n-2);
        int totalways=singles+pair;
        return totalways  ;

    }
    public static void printBinaryString(int n,int lastplace, String str){
        //base condition
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if(lastplace==0){
            printBinaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        
        printBinaryString(3, 0, "");
    }
}