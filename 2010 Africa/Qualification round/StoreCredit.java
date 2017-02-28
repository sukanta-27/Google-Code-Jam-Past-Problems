/*
  Sukanta Roy
  2010 Africa Qualification Round Problem A - Store Credit
*/

import java.util.*;
import java.io.*;

public class StoreCredit{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		String outputFileName = in.nextLine();
		in.close();
		Scanner input = new Scanner(new File(fileName));
		PrintWriter out = new PrintWriter(new FileWriter((outputFileName+".txt"), true), true);
		int N = input.nextInt();
		input.nextLine();
		int ij = 1;
		int space = 1;
		for(int i = 0;i<N;i++){
			int credit = input.nextInt();
			int I = input.nextInt();
			int c[] = new int[I];
			for(int j = 0;j<I;j++){
				c[j] = input.nextInt();
			}
			int sum = 0;
			for(int a = 0;a<I;a++){
				for(int b = a+1;b<I;b++){
					sum = c[a]+c[b];
					if(sum == credit){
						out.write("Case #"+(ij)+": "+(a+1)+" "+(b+1));
						out.write("\n");
						ij++;
					}
				}
			}
		}
		input.close();
		out.close();
	}
}
