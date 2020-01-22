
package frequencyofelement;

import java.util.Scanner;


public class frequencyofElementusingDoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,i=0,j,count;
        System.out.println("Enter size of arrary ");
        size=sc.nextInt();
        int arr[]=new int[size];
        int freq[]=new int[size];        
        System.out.println("Enter the element of array ");
        do
        {
            arr[i]=sc.nextInt();
            freq[i]=-1;
           i++;
        }while(i<size);
        
    
        do
        {
            count=1;
            j=i+1;
            do
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=0;
                }
                j++;
            }while(j<size);
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
           i++; 
        }while(i<size);
        System.out.println("Frequency of element : ");
        do
        {
            if(freq[i]!=0)
            {
                System.out.println(arr[i]+" occurs "+freq[i]+" times ");
            }
        }while(i<size);
    }
    
}
