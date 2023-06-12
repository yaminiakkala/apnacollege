import java.util.*;
public class strings{
    public static void declarations(){
        char arr[]={'y','a','m','i','n','i'};
        String name="yamini";
        String str=new String("saraswathi");
        System.out.println(str);
        System.out.println(name);
        System.out.println(arr);
    }
    public static void stringprrint(String s){
              for(int i=0;i<s.length();i++){
                    System.out.println(s.charAt(i)+" ");
              }
    }
    public static void isStringpolindrome(String s){
        boolean b=false;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                 b=true;
            }
            else{
                b=false;
                break;
            }
        }
        if (b==true){
            System.out.println("Given String is polindrome");
        }
        else{
            System.out.println("Given String is not polindrome");
        }
    }
    public static void shortestpath(String  s){
        int y=0,x=0;
         for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='w'){
                   x--;
            }
            else if (s.charAt(i)=='e'){
                x++;
            }
            else if (s.charAt(i)=='n'){
                y++;
            }
            else if (s.charAt(i)=='s'){
                y--;
            }
         }
         double d=Math.sqrt(x*x +y*y);
         System.out.println(d);
    }
    public static void Substring(String s,int si,int ei){
        String substring="";
        for(int i=0;i<s.length();i++){
             substring +=s.charAt(i);
        }
        System.out.println(substring);
    }
    public static void largeststring(String s[]){
          String largest = s[0];
          for(int i=1;i<s.length;i++){
                if(s[i].compareTo(largest)<0){
                           largest=s[i];
                }
          }
          System.out.println(largest);
    }
    public static void stringbuilder(){
        int cnt=0;
           // StringBuilder sc=new StringBuilder("");
           String sc="yamini";
            for(char ch ='a';ch <='z';ch++){
                sc+=ch;
               cnt++;
            }
            System.out.println(sc);
            System.out.println(cnt);
    }
    public static void Touppercase(String s){
           StringBuilder sc=new StringBuilder("");
           sc.append(Character.toUpperCase(s.charAt(0)));
           for(int i=1; i<s.length(); i++){
                if(s.charAt(i)==' ' && i<s.length()-1){
                    sc.append(s.charAt(i));
                    i++;
                    sc.append(Character.toUpperCase(s.charAt(i)));
                }
                else{
                    sc.append(s.charAt(i));
                }
           }
           System.out.println(sc);

    }
    public static void stringcompression(String str){
        StringBuilder sb=new StringBuilder("");
        //String newstring ="";
          for(int i=0;i<str.length();i++){
             Integer cnt=1;
             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                cnt++;
                i++;
             }
             sb.append(str.charAt(i));
             //newstring += str.charAt(i);
             if(cnt >1){
                
                 sb.append(cnt);
                //newstring += cnt.toString();
             }
             
          }
          System.out.println(sb);
    }
         public static void main(String[] main){
           System.out.println();
         }
}
