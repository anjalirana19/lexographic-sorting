import java.util.*;
class bubble
{
  void sort(String[] a)
  {
      for(int i=0;i<a.length;i++)
      {
          for(int j=0;j<a.length-i-1;j++)
          {
              if(compare(a[j],a[j+1]))
              {
                  String temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }

          }
      }
      for(int i=a.length-1;i>=0;i--)
      {
          System.out.println(a[i]);
      }
  }
  boolean compare(String a,String b)
  {
    
      int i;
      for(i=0;i<a.length() && i<b.length();i++)
      {
        
          if(a.charAt(i)==b.charAt(i))
          continue;
          else
          {
              if(a.charAt(i)>b.charAt(i))
              return false;
              else
              return true;
             
          }
      }
      if(a.length()==i)
      return true;
      else
      return false;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bubble obj=new bubble();
        int n=sc.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        obj.sort(a);
    }
}