
package frequencyofelement;

import java.util.Scanner;


public class frequencyofElementusingwhile {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,i=0,j,count;
        System.out.println("Enter size of arrary ");
        size=sc.nextInt();
        int arr[]=new int[size];
        int freq[]=new int[size];        
        System.out.println("Enter the element of array ");
        while(i<size)
        {
            arr[i]=sc.nextInt();
            freq[i]=-1;
           i++;
        }
        
    
        while(i<size)
        {
            count=1;
            j=i+1;
            while(j<size)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=0;
                }
                j++;
            }
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
           i++; 
        }
        System.out.println("Frequency of element : ");
        while(i<size)
        {
            if(freq[i]!=0)
            {
                System.out.println(arr[i]+" occurs "+freq[i]+" times ");
            }
        }
    }
}
