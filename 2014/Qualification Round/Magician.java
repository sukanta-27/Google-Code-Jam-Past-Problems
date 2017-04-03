import java.util.*;
import java.io.*;

public class Magician{
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();

		Scanner in = new Scanner(new File(fileName));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t= in.nextInt();
		in.nextLine();
		int ij = 1;
		int N = 4;
		while(in.hasNext()){
			int ans1 = in.nextInt();
			int[][] arr1 = new int[N][N];
			int[][] arr2 = new int[N][N];
			String output = "";
			for(int i = 0;i<N;i++){
				for(int j = 0;j<N;j++){
					arr1[i][j] = in.nextInt(); 
				}
			}
			int ans2 = in.nextInt();
			for(int i = 0;i<N;i++){
				for(int j = 0;j<N;j++){
					arr2[i][j] = in.nextInt(); 
				}
			}
			int[] c1= arr1[ans1-1];
			int[] c2 = arr2[ans2-1];
			int count = 0, card = 0;
			for(int i = 0;i<N;i++){
				for(int j = 0;j<N;j++){
				if(c1[i] == c2[j]){
					card = c1[i];
					count++;
				}
			}}
			if(count > 1){
				output = "Bad magician!";
			}
			else if(count ==1){
				output = card+"";
			}
			else{
				output = "Volunteer cheated!";
			}
			
			//String outputMessage = ("Case #"+(ij)+": "+output);
			out.write("Case #"+(ij)+": "+output+"\n");
			ij++;
		}
		out.flush();
	}
	
}
