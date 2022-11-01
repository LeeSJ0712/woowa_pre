package woowa;
import java.util.Scanner;
import java.util.Arrays;
public class Value {
	static int global_flag=0;
	public static String cutting(String str) {
		int s_len = str.length();
		char [] chars= str.toCharArray();
		for(int x=0;x<s_len-1;x++) {
			if(chars[x] == chars[x+1]&& chars[x] != '"') {
				chars[x] =' ';
				chars[x+1] = ' ';
				global_flag=1;
			}
		}
		String a = new String(chars);
		a= a.replaceAll(" ", "");
		return a;
	}
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        while(true) {
        	global_flag=0;
        	str = cutting(str);
        	if(global_flag==0)break;
        }
        System.out.println(str);

	}
}
