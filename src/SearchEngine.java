import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class SearchEngine {
    public static void find_data(String data,String[]ar)
    {

        String info="";
        int f=0;
        ArrayList<String> result= new ArrayList<String>();

        for(int i=0;i<ar.length;i++)
        {
            ArrayList<String> check= new ArrayList<String>();

            info=ar[i];
            StringTokenizer str=new StringTokenizer(info);
            while(str.hasMoreTokens())
            {
                check.add(str.nextToken());
            }
            for(int j=0;j<check.size();j++)
            {

                if(check.get(j).toLowerCase().indexOf(data.toLowerCase())!=-1)
                {
                    result.add(ar[i]);
                    f=1;
                    break;
                }
            }
        }
        if(f==0)
        {
            System.out.println("No matching people found.");
        }
        else
        {
            System.out.println();
            System.out.println("Found people:");
            for(int i=0;i<result.size();i++)
            {
                System.out.println(result.get(i));
            }
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        //scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println();
        System.out.println("Enter all  people:");
        scanner.nextLine();
        String[] info=new String[n];
        for(int i=0;i<n;i++)
        {
            info[i]=scanner.nextLine();


        }
        System.out.println();
        while(true)
        {
            System.out.println("=== Menu ===");
            System.out.println("1. Find a person");
            System.out.println("2. Print all people");
            System.out.println("0. Exit");
            int op=scanner.nextInt();
            if(op==1)
            {
                String data="";
                System.out.println();
                System.out.println("Enter a name or email to search all suitable people.");
                scanner.nextLine();
                data = scanner.nextLine();
                find_data(data,info);
            }
            else if(op==2)
            {
                System.out.println();
                System.out.println("=== List of people ===");
                for(int i=0;i<n;i++)
                {
                    System.out.println(info[i]);


                }
            }
            else if(op==0)
            {
                System.out.println();
                System.out.println("Bye!");
                break;
            }
            else
            {
                System.out.println();
                System.out.println("Incorrect option! Try again.");
            }
        }

    }
}