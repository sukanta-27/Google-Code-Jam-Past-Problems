import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class CookieClicker{
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		input.close();
		Scanner in = new Scanner(new File(fileName));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = in.nextInt();
		int ij = 1;
		DecimalFormat df = new DecimalFormat("###.0000000");
		
		while(ij <= N){
			double cps = 2.0;
			double sum = 0;
			String output = "";
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
		
			while(true){
				double time = 0;
				double xt = (x/cps);
				double yt = (c/cps)+(x/(cps+f));

				if(xt > yt){
					time = (c/cps);
					sum += time;
					cps += f;
				}
				else{
					time = (x/cps);
					sum += time;
					break;
				}
			}
			output = df.format(sum);
			out.write("Case #"+(ij)+": "+output+"\n");
			ij++;
		}
		out.flush();
	}
	
}