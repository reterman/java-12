
import java.io.*;

public class lab12 {


	public static void main(String[] args)
	{

		try {

			FileReader fr = new FileReader("Input.txt");
			FileWriter fw = new FileWriter("Output.txt");
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
			fw.close();

			System.out.println("File reading and writing both done");
        }

		catch (IOException e) {


			System.out.println("There are some IOException");
		}
	}
}
