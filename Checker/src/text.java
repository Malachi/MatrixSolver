import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
 
public class text
{
  public static void main(String args[])
  {
    int character[] = new int[10];
    int entires[] = new int[20];
    int counter[] = new int[20];
    for (int i = 0; i < counter.length; i++)
      counter[i] = 0;
    for (int i = 0; i < counter.length; i++)
      entires[i] = 0;
    String filename;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter file name: ");
    filename = in.nextLine();
    String line = "howdy";
    try
    {
      BufferedReader myReader =
        new BufferedReader(new FileReader(filename));
      while (line != null)
      {
        line = myReader.readLine();
        if (line == null)
          break;
        else
        {
          System.out.println(line);
        }
      }
      myReader.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
      System.exit(-1);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.exit(-1);
    }
  }
}