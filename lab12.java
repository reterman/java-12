
import java.io.*;

public class lab12 {


	public static void main(String[] args)
	{
		FileReader fr = null;
		FileWriter fw = null;

		try
		
			{
			fr = new FileReader("Input.txt");
			fw = new FileWriter("Output.txt");
			String str = "";
			int i;

			while ((i = fr.read()) != -1) {

				str += (char)i;
			}

			String[] numbers = str.split(" ");
			int[] ints = new int[numbers.length];
			for(int c = 0; c < numbers.length; c++) ints[c] = Integer.parseInt(numbers[c]);
			int a = ints[0]/ints[1];
			System.out.println(a);

			fw.write(Integer.toString(a));
			fr.close();
			


			System.out.println("File reading and writing both done");
        }

		catch (IOException e) {


			System.out.println("There are some IOException");
		}
		finally {
      	try {
			fr.close();
			fw.close();

      	}
      	catch(Exception e)
      	{
      	  if(fw != null)
      	  {
			//e.addSuppressed(fw); //Add to primary exception
      	    //throw e;
      	  }
      	}
    }
	}
}
