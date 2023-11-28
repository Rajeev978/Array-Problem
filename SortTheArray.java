//Java Program to Sort the Elements of an Array in Ascending Order				

public class ArrayAcendingOrder {
    public static void main(String[] args) {
         int temp;
       int a[]={36,19,29,12,5};
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a.length-1;j++)
           {
               if(a[j]>a[j+1])
               {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]+" ");
       }

   }
}
