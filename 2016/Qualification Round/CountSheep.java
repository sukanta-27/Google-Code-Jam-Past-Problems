import java.util.*;
import java.io.*;

public class CountSheep{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		in.close();
		Scanner input = new Scanner(new File(fileName));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		int t = input.nextInt();
		input.nextLine();
		int ij = 1;
		int space = 1;
		for(int i_t = 0;i_t<t;i_t++){
			int n = input.nextInt();
			boolean run = true;
			Set<Integer> digits  = new HashSet<Integer>();
			ArrayList<Integer> ns = new ArrayList<>();
			int i = 1;
			String output = "";
			while(run){
				int temp = i*n;
				if(ns.contains(temp)){
					run = false;
					output = "INSOMNIA";
				}
				else{
					ns.add(temp);
				}
				
				for(int k = temp;k>0;k /= 10){
					int temp2 = k%10;
					digits.add(temp2);
				}
				if(digits.size() == 10){
					output = (temp)+"";
					break;
				}
				i++;
				
			}

			String outputMessage = ("Case #"+(ij)+": "+output);
			out.write(outputMessage+"\n");
			ij++;
		}
		out.flush();
	}
}
