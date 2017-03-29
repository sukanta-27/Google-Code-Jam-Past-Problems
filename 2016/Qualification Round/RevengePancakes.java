import java.util.*;
import java.io.*;

public class RevengePancakes{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();

		in.close();
		Scanner input = new Scanner(new File(fileName));
		BufferedWriter out = new BufferedWriter(new FileWriter("output1.txt"));

		int N = input.nextInt();

		int ij = 1;
		int space = 1;
		while(input.hasNext()){

			String str = input.next();
			
			int len = str.length();
			char[] ch = str.toCharArray();
			int count = 0;
			String output = "";
			for(int i = len-1;i>=0;i--){
				boolean check = true;
				if(ch[i] == '-'){
					for(int j = i;j>= 0;j--){
						if(ch[j] == '-'){
							ch[j] = '+';
						}
						else{
							ch[j] = '-';
						}
					}
					count++;
				}
				
				for(int k = 0;k<len;k++){
					if(ch[k] == '-'){
						check = false;
						break;
					}
				}
				
				if(check){
					//output = count+"";
					break;
				}

			}
			
			output = count+"";
			System.out.println(count);

			String outputMessage = ("Case #"+(ij)+": "+output);
			out.write(outputMessage+"\n");
			ij++;
		}
		out.flush();
	}
	
}