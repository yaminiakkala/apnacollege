public class DivideConquer{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //staring index for left 
        int j=mid+1; //starting index for right
        int k=0 ;//for temp
        //merging left and right indexes
        while((i<=mid) && (j<=ei)){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;i++;
            }else{
                temp[k]=arr[j];
                k++;j++;
            }
        }
      //again running loop for elements which are remaining
        while(i<=mid){
            temp[k++]=arr[i++];   //left side
        }
        //again running loop for elements which are remaining
        while(j<=ei){
            temp[k++]=arr[j++];   //right  side
        }
        //loop for copying
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void mergeSort(int arr[],int si,int ei){
        //Base condition
        if(si >=ei){
           return;
        }
        //work
        int mid=si+(ei-si)/2 ;            // we can also write (si+ei)/2
        //for left 
        mergeSort(arr, si, mid);
        //for right
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);


    }
    public static void quicSort(int arr[],int si,int ei){
       //base condition
       if(si>=ei){
         return;
       }
       int pIndx=partition(arr,si,ei);   //obtaing pivot index for futher quicksort functions
        quicSort(arr, si, pIndx-1); //again calling quick sort for elemts before pivot
        quicSort(arr, pIndx+1, ei);   //again calling quick sort for elemts after pivot

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei]; //declaring pivot
        int i=si-1;  //to make space for elemnts smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
         //swap
         int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
      return i;
    }
    public static int search(int arr[],int tar,int si,int ei){
        //base 
        if(si>ei){
            return -1;
        }
        //work
        int mid=si+(ei-si)/2 ;
        if(arr[mid]==tar){
            return mid;
        }
        //if mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
           if(arr[si]<=tar &&  tar<=arr[mid-1]){
              return search(arr, tar, si, mid-1);
           }
           //case b :Right
           else{
              return  search(arr, tar, mid+1, ei);
           }
        }
        else{
            //case c:right
            if(tar >= arr[mid] && tar <=arr[ei]){
               return  search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }

        }
       // return -1;
    }
    public static void main(String args[]){
        int a[]={1,4,2,0,12};
        
        System.out.println(search(a, 0, 0, a.length-1));

    }
}