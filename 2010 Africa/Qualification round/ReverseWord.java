/*
  Sukanta Roy
  2010 Africa Qualification Round Problem B - Reverse Word
*/

import java.util.*;
import java.io.*;

public class ReverseWord{
	public static void main(String args[]) throws IOException{
		ArrayList<String> input = new ArrayList<String>();
		Scanner in2 = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("output2.txt", true), true);
		String fileName = in2.nextLine();
		in2.close();
		Scanner in = new Scanner(new File(fileName));
		int N = in.nextInt();
		//in.nextLine();
		int i1 = 0;
		while(in.hasNext()){
			//System.out.println("IN FOR LOOP");
			String temp = in.nextLine(); 
			input.add(temp);
			ArrayList<String> words = new ArrayList<String>(Arrays.asList(input.get(i1).split("\\s")));
			Collections.reverse(words);
			String reverseLine = "";
			for(String i2: words){
				reverseLine+= i2+" ";
			}
			input.set(i1 , reverseLine);
			i1++;
		}
		
		for(int i = 1;i< input.size();i++){
			String output = ("Case #"+(i)+": "+input.get(i));
			out.write(output);
			out.write("\n");
		}
		in.close();
		out.close();
		
		
	}
}
