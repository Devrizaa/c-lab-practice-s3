import java.io.*;
import java.util.Scanner;
class file
{
    public static void main(String [] args) throws IOException
    {
        FileReader f = null;
        FileWriter f1 = null;
       
        
        try{
            f = new FileReader("java.txt");
            Scanner S = new Scanner(f);
            f1 = new FileWriter("empty.txt");
            while(S.hasNext())
            {
                String s = S.next();
                int c =s.length();
                f1.write(c+" ");
                System.out.println(c);
            }
            S.close();
            f1.close();
        }catch(FileNotFoundException e)
        {
            System.out.print(e);
        }
    }
}