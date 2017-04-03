import java.util.*;
import java.io.*;
class StandingOvation{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		Scanner input = new Scanner(new File(fileName));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = input.nextInt();
		int ij = 1;
		//int space = 1;
		while(input.hasNext()){

			int n = input.nextInt();
			String s = input.next();

			char[] ch = s.toCharArray();

			int insert = 0, total = 0;
			//System.out.println("i\tch[i]\ttotal\tinsert");
			for(int i = 0;i<=n;i++){
				//System.out.println(i+"\t"+ch[i]+"\t"+total+"\t"+insert);
				int current = Character.getNumericValue(ch[i]);
				if(current > 0){
					if(i <= total){
						total += current;
					}
					else{
						insert += i-total;
						total += current+(i-total);
					}
					/*if(total >= n){
						break;
					}*/
				}
			}
			//String outputMessage = ("Case #"+(ij)+": "+output);
			out.write("Case #"+(ij)+": "+insert+"\n");
			ij++;
		}
		//input.close();
		out.flush();
	}
	
}
