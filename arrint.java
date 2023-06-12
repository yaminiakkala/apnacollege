import java.util.*;
import java.util.Arrays;

import javax.print.attribute.standard.RequestingUserName;
public  class arrint{
    public static void arrayintro(){

        //creating an array
       int []marks=new int[4];
       Scanner sc=new Scanner(System.in);
       //taking user inputs
       marks[0]=sc.nextInt();//enter a maths marks
       marks[1]=sc.nextInt();//enter a phy marks
       marks[2]=sc.nextInt();//enter a chem marks
       //printing ouput of an array
       System.out.println("phy marks:"+marks[1]);
       System.out.println("math marks:"+marks[0]);
       System.out.println("chem marks:"+marks[2]);
       //updating an array
       marks[2]=marks[0]+marks[1];
       System.out.println("updated chem marks:"+marks[2]);
       //length of an array
       System.out.println(" marks length:"+marks.length);
    }
    public static void update(int array[]){
        for(int i=0;i<array.length;i++){
               array[i]=array[i]+1;
        }
    }
    //linear search of an array
    public static int linSearch(int arr[],int value){
    //     int a[]={10,20,30,40,50,60};
    //     int val=50;
    //    int index=linSearch(a, val);
    //    if(index==-1){
    //     System.out.println( "Value not found");
    //    }
    //    else{
    //     System.out.println( " found value at index:"+index);
    //    }
        
                for( int i=0;i<arr.length;i++){
                if (arr[i]==value){
                    return i;
                }
                    
              }
              return -1;
              
    }
   //largest number in an array
   public static int getlargest(int arr[]){
    int largest=arr[0];//or Integer.MIN_VALUE means -infinity
   
    for(int i=1 ;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
   }
   //getting smallest number in an array
   
   public static int getsmallest(int arr[]){
    int smallest=Integer.MAX_VALUE;//or Integer.MIN_VALUE means -infinity
    for(int i=0 ;i<arr.length;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
        }
    }
    return smallest;
   }
   //finding binarysearch of an array
   public static int Binarysearch(int arr[],int value){
    // int a[]={1,2,3,4,9};
    //      int value=1;
    //      int index=Binarysearch(a, value);
    //      if(index==-1){
    //             System.out.println( "Value not found");
    //            }
    //            else{
    //             System.out.println( " found value at index:"+index);
    //            }
         int start=0,end=arr.length-1;
         while(start<=end){
              int mid=(start+end)/2;
              if(arr[mid]==value){
                    return mid;
              }
              else if(value<arr[mid]){
                end=mid-1;
              }
              else if(value >arr[mid]){
                start=mid+1;
              }
         }
         return -1;
   }
   public static void Revearray(int a[]){
         int i=0,end=a.length-1,mid=(i+end)/2;
         while(i<=mid){
            int temp=a[i];
            a[i]=a[end];
            a[end]=temp;
            i++;
            end--;
         }
         
   }
   public static void arrpairs(int a[]){
    int tp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                 System.out.print("("+a[i]+","+a[j]+")  ");
                 tp++;
            }
            System.out.println();
        }
        System.out.println("total paris:"+tp);
   }
   public static void subarrays(int a[]){
    int max_subarray=Integer.MIN_VALUE,min_subarray=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
            System.out.print(" (");
            int sum=0;
            for(int k=i;k<=j;k++){
                System.out.print(a[k] );
                sum+=a[k];
                
            }
            if(sum>max_subarray){
                max_subarray=sum;
            }
            if(sum<min_subarray){
                min_subarray=sum;
            }
            System.out.print(")");
            // System.out.println();
        
        }
        System.out.println();
    }
    System.out.println("maximum subarray:"+ max_subarray);
    System.out.println("minimum subarray:"+ min_subarray);
   }
    public static int max_subarray_prefixsum(int numbers[]){
        int max_sum=Integer.MIN_VALUE;
        int n=numbers.length;
        //declaring prefix index
        int prefix[]=new int[n];
        prefix[0]=numbers[0];
        //creating A prefix index
        for(int i=1;i<n;i++){
              prefix[i]=prefix[i-1]+numbers[i];
        }
        //finding max sub array using prefix array
        for(int i=0;i<n;i++){
            for(int j=i;(j<n) ;j++){
                int sub_sum = i==0?prefix[j]:prefix[j]-prefix[i-1];//finding sum of sub array
                if(max_sum<sub_sum){
                    max_sum=sub_sum;     //checking wheather given sum is less or more


                }
            }
        }
        return max_sum;
    }
    public static int max_sum_kadens(int a[]){
        int cur_sum=a[0],max_sum=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            cur_sum +=a[i];
            if (cur_sum<0){
                cur_sum=0;
            }
            if (cur_sum>max_sum){
                max_sum=cur_sum;
            }
        }
        if(max_sum==0){
            int max_value=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]>max_value){
                    max_value=a[i];
                }
            }
            return max_value;
        }
        return max_sum;
    }
    public static int trapping_rain_water(int height[]){
               int n=height.length;
               //taking left max array and filling it
               int max_left[]=new int[n];
               max_left[0]=height[0];
               
               for(int i=1;i<n;i++){
                max_left[i]=Math.max(max_left[i-1], height[i]);
               }
             //Taking right max array and filling it
               int max_right[]=new int[n];
               max_right[n-1]=height[n-1]; 
               
             for(int i=n-2;i>=0;i--){
              max_right[i]=Math.max(max_right[i+1], height[i]); 
              }
             //loop and trapped water
             int trappedwater=0;
             for(int i=0;i<n;i++){
                int waterlevel=Math.min(max_left[i], max_right[i]);
                trappedwater +=(waterlevel-height[i]);
                   
             }
             return trappedwater;
    }
    public static int buy_sell_stocks(int stock[]){
        //finding lowest buying price
        // int Buyprice=Integer.MAX_VALUE;
        // for(int i=0;i<stock.length;i++){
        //     if(stock[i]<Buyprice){
        //         Buyprice=stock[i];//updating stock
        //     }
        // }
        int Buyprice=Integer.MAX_VALUE;
        int Maxprofit=Integer.MIN_VALUE;
        //finding maximum profit
        for(int i=0;i<stock.length;i++){
            //checking sellingprice>buyingprice
            if(stock[i]>Buyprice){
                 int profit=stock[i]-Buyprice;
                 Maxprofit=Math.max(profit,Maxprofit);
            }
            else{
                Buyprice=stock[i];
            }
            
        }
        return Maxprofit;
        
        
    }
    public static void bubblesort(int a[]){
        int n=a.length;
        int count=0;
        //first loop
        for(int i=0;i<n;i++ ){
            //second loop
            for(int j=0;j<n-1-i;j++){
              //checking maximum of two elements for swaping
              if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                count++;
              
                
            }
            if(count==0){
                break;
            }
        }
        }
    }
    public static void selectionsort(int a[]){
        int n=a.length;
        //number of turns loop
         for(int i=0;i<n-1;i++){
            //intializing minimum position
             int minposition=i;
             for(int j=i+1;j<n;j++){
                if(a[j]<a[minposition]){
                    minposition=j;
                }
             }
             int temp=a[i];
             a[i]=a[minposition];
             a[minposition]=temp;
         }
    }
    public static void insertionsort(int a[]){
        int n=a.length;
          for(int i=1;i<n;i++){
            //putting currennt element in temp
               int temp=a[i];;
               int prev=i-1;
               //finding out the correct position to insert
               while(prev>=0 && a[prev]>temp) {
                     a[prev+1]=a[prev];
                     prev--;
               }
               a[prev+1]=temp;
               
          }
    }
    public static void printArr( Integer a[]){
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
         }
    }
    public static void inbulit(){
        //sorting using inbuitlt functions
        Integer a[]={1,8,5,9,10,2};
        // Arrays.sort(a);
        // printArr(a);
        // Arrays.sort(a,1,3);
        // System.out.println();
        // printArr(a);
        Arrays.sort(a,Collections.reverseOrder());
        printArr(a);
    }
    public static void countsort(int a[]){
        int n=getlargest(a);
        int count[]=new int[n+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        for(int i=0;i<=n;i++){
            if(count[i]>0){
                System.out.print( i +" ");
                count[i]--;
            }
        }
    }
     public static void main(String []args){
        
       int a[]={1,4,6,57,23,2};
       countsort(a);
        
        
    }
    
     
}