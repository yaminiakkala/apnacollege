import java.util.*;
public class bitmanipulation{
    public static void CheckEvenOrOdd(int n){
        if((n&2)==0){
                System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int GetithBit(int n,int i){
        int bitmask=1<<i;
        
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n,int i){
        int Bitmask=~(1<<i);
        return (n&Bitmask);
    }
    public static int updateIthBit(int n,int i,int value){
        //  if(value==1){
        //     return setIthBit(n, i);
        //  }
        //  else{
        //     return clearIthBit(n, i);
        //  }
        //or we can alse use below one 
        int clear_n=clearIthBit(n, i);
        int Bitmask =value<<i;
        return clear_n|Bitmask;
    }
    public static int clearNBits(int n,int i){
          int Bitmask = (~0)<<i;
          return (n&Bitmask);
    }
    public static int cleaRangeOfBits(int n,int i,int j){
           int a=(~0) << (j+1);
           int b=(1<<i)-1;
           int Bitmask=a|b;
           return n&Bitmask;
    }
    public static int isTwoPower(int n){
        if((n &(n-1))==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int countSetBits(int n){
        int cnt=0;
        while(n > 0){
            if((n&1)!=0){
                cnt++;
            }
           n= n >> 1;
        }
        return cnt;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(fastExpo(5, 3));
    }
}