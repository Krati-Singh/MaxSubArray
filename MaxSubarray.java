import java.util.*;
public class MaxSubarray 
{
    public static void SUM(int a[],int n)
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n;j++)
            {
                int current_sum=0;
                for(int k=i; k<=j; k++)
                {
                    current_sum+=a[k];
                }
                System.out.println("\n Current sum is" + current_sum);
                if(max_sum<current_sum)
                {
                    max_sum = current_sum;
                }
            }
        }
        System.out.print("The maximum subarray sum is" + max_sum);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("Enter the size of array: \n");
        int n =sc.nextInt();
        System.out.println("Enter the array elements: \n");
        for(int i=0; i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        SUM(a,n);
    }
}
