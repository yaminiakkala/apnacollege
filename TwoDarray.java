import java.util.*;
public class TwoDarray{
    public static void MatrixPrint(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        //printing a matrix
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              System.out.print(matrix[i][j] +" ");
          }
          System.out.println();
        }
  }
     public static boolean matrixSearch(int matrix[][],int key){
        int m=matrix.length;
        int n=matrix[0].length;
                   for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(matrix[i][j]==key){
                            System.out.print("Value found at:"+i+","+j);
                            return true;
                        }
                    }
                   }
                  
                System.out.print("key not found ");
                return false;
                 
     }
     public static void SpriralPrint(int matrix[][]){
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix[0].length-1;
        while((start_row<=end_row) && (start_col<=end_col)){
              //top or start_row print
        for(int j=start_col;j<=end_col;j++){
            System.out.print(matrix[start_row][j] +" ");
        }
        //right or end_col  print
        for(int i=start_row+1;i<=end_row;i++){
            System.out.print(matrix[i][end_col]+" ");
        }
        //bottom  end_row  print
        for(int j=end_col-1;j>=start_col;j--){
            if(start_row==end_row){
                break;
            }
            System.out.print(matrix[end_row][j] + " ");
        }
        //left   start_col print
        for(int i=end_col-1;i>start_row;i--){
            if(start_col==end_col){
                break;
            }
            System.out.print(matrix[i][start_col]+" ");
        }
        //top ++
        start_row ++;
        //right --
        end_col--;
        //bottom--
        end_row--;
        //left++
        start_col++;

        }
       
     }
     public static void DiagonalSum(int matrix[][]){
            int sum=0;
             int n=matrix.length;
            //     for(int i=0;i<n;i++){
            //         for(int j=0;j<n;j++){
            //             if((i==j)|| (i+j== n-1)){
            //                 sum +=matrix[i][j];
            //             }
            //         }
            //     }
            // if(n%2==0){
            //     System.out.println(sum);
            // }
            // else{
            //     System.out.println(sum);
            // }
         for(int i=0;i<n;i++){
            sum +=matrix[i][i];
            if(i!=n-i-1){
                sum+=matrix[i][n-i-1];
            }
         }
         System.out.println(sum);

     }
    public static boolean staircaseSearchtopFirst(int a[][], int key ){
        int n=a.length;
        int m=a[0].length;
        int row=0,col=n-1;
        
        while(row <n && col >=0){
            if(a[row][col] == key){
                System.out.println("found key at "+ row +","+ col);
                return true;
            }
            else if(key<a[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
         return false;
            
    }
    public static boolean staicasesearchbottomfirst(int matrix[][],int key){
        int m=matrix[0].length;
        int row=m-1,col=0;
        while(row >=0 && col<m){
            if(matrix[row][col] ==key){
                System.out.println("Key found at :"+ row +","+ col);
                return true;
            }
            else if(matrix[row][col] < key){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Key not found");
         return false;
    }
    public static void main(String args[]){
              
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,12,13}
                        };
        staircaseSearchtopFirst(matrix, 12);
}
}