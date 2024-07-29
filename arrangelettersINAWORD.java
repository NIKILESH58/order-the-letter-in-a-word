import java.util.*;
public class arrangelettersINAWORD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String A=in.nextLine();
        int n=A.length();
        char ch1,chr=' ';
        String str="";
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
           char ch=A.charAt(i);
           arr[i]=ch;  
        }
        for(int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]>=arr[j])
          {
              ch1=arr[i];
              arr[i] =arr[j];
              arr[j]=ch1;
          }
        }
        str=str+arr[i];
        }
        System.out.println("SORTED ARRAY---->"+str);
    }
}