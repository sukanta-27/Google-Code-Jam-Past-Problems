/*
  Sukanta Roy
  2010 Africa Qualification Round Problem C - T9 Spelling
*/

import java.util.*;
import java.io.*;

public class T9Spelling{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		in.close();
		Scanner input = new Scanner(new File(fileName));
		PrintWriter out = new PrintWriter(new FileWriter("output1.txt", true), true);
		Map<Character,Integer> map = new HashMap<>();
		map.put('a',2);map.put('b',22);map.put('c',222);
		map.put('d',3);map.put('e',33);map.put('f',333);
		map.put('g',4);map.put('h',44);map.put('i',444);
		map.put('j',5);map.put('k',55);map.put('l',555);
		map.put('m',6);map.put('n',66);map.put('o',666);
		map.put('p',7);map.put('q',77);map.put('r',777);map.put('s',7777);
		map.put('t',8);map.put('u',88);map.put('v',888);
		map.put('w',9);map.put('x',99);map.put('y',999);map.put('z',9999);map.put(' ',0);
		int N = input.nextInt();
		input.nextLine();
		//input.nextLine();
		int ij = 1;
		int space = 1;
		while(input.hasNext()){
			String output = "";
			String message = input.nextLine();
			int count1 = 1;
			if(message != null){
				char[] characters = message.toCharArray();
				System.out.println("FOR MESSEGE :"+message+"\n\n");
				for(char a : characters){
					int count = map.get(a)%10;
					
					System.out.println("Count for "+a+" is: "+count+"\t Count1 :"+count1);
					if(map.containsKey(a)){
						if(count!=count1){
							System.out.println("In IF BLOCK");
							output += map.get(a);
							count1 = count;
						}
						else{
							System.out.println("In ELSE BLOCK");
							output += " "+map.get(a);
							count1 = count;
						}
					}
				}
			}
			String outputMessage = ("Case #"+(ij)+": "+output);
			out.write(outputMessage);
			out.write("\n");
			ij++;
		}
		
		input.close();
		out.close();
	}
}
