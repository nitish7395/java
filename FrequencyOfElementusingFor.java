
    package frequencyofelement;

    import java.util.Scanner;


    public class FrequencyOfElementusingFor {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size,i,j,count;
            System.out.println("Enter size of arrary ");
            size=sc.nextInt();
            int arr[]=new int[size];
            int freq[]=new int[size];        
            System.out.println("Enter the element of array ");
            for(i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
                freq[i]=-1;
            }


            for(i=0;i<size;i++)
            {
                count=1;
                for(j=i+1;j<size;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        freq[j]=0;
                    }
                }
                if(freq[i]!=0)
                {
                    freq[i]=count;
                }
            }
            System.out.println("Frequency of element : ");
            for(i=0;i<size;i++)
            {
                if(freq[i]!=0)
                {
                    System.out.println(arr[i]+" occurs "+freq[i]+" times ");
                }
            }
        }
    }


