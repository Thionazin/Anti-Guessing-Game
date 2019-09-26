import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class reader {
    public static void main(String[] args) throws IOException{

        try
        {
            Scanner file = new Scanner(new File("list.txt"));

            ArrayList<String> total = new ArrayList<String>();

            while(file.hasNextLine())
            {
                String input = file.nextLine();
                total.add(input.toLowerCase());
            }


            //System.out.println(total.size());


            Scanner read = new Scanner(System.in);

            boolean stop = false;

            while(!stop)
            {
                System.out.println("Enter input. Format example: h___y");
                String original = read.nextLine();
                String input = original.toLowerCase();

                int count = input.length();

                ArrayList<String> all = new ArrayList<String>();

                for(int i = 0; i < total.size(); i++)
                {
                    if(total.get(i).length() == count)
                    {
                        boolean todo = true;
                        for(int j = 0; j < input.length(); j++)
                        {
                            if(input.charAt(j) == '_')
                            {

                            }
                            else if(input.charAt(j) == total.get(i).charAt(j))
                            {

                            }
                            else
                            {
                                todo =false;
                            }
                        }

                        if(todo == false)
                        {

                        }
                        else
                        {
                            System.out.println(total.get(i));
                        }
                    }
                }

                for(int i = 0; i < all.size(); i++)
                {
                    System.out.println(all.get(i));
                }

                //stop = true;


            }
        }
        catch (Exception e)
        {
            PrintWriter out = new PrintWriter("list.txt");
            out.close();
            System.out.println("Error, no list found. A new list file has been created. Copy and paste the word bank");
            System.out.println("into the file. Each word should be on its own line with no spaces");
        }





    }


}
