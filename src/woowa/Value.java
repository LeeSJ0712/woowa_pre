package woowa;
import java.util.Scanner;
public class Value {
	public static int WhosWin(int Pobi,int Crong) {
		int Pobitmp=Pobi,PobiNum=0,PobiMax=0;
		int Crongtmp=Crong,CrongNum=0,CrongMax=0;
		for(int y=0;y<2;y++) {
			Pobi =Pobitmp+y;
			Crong =Crongtmp+y;
			int tmp,tmp1=0,tmp2=1;
			if(Pobi>=100){
			tmp = Pobi/100;
			tmp1+=tmp;
			tmp2*=tmp;
			Pobi = Pobi%100;
			tmp = Pobi/10;
			tmp1+=tmp;
			tmp2*=tmp;
			Pobi = Pobi%10;
			tmp1+=Pobi;
			tmp2*=Pobi;
			}
			else if(Pobi>=10) {
				tmp = Pobi/10;
				tmp1+=tmp;
				tmp2*=tmp;
				Pobi = Pobi%10;
				tmp1+=Pobi;
				tmp2*=Pobi;
			}
			else {
				tmp1+=Pobi;
				tmp2*=Pobi;
			}
			if(tmp1>=tmp2 && PobiMax<tmp1)PobiMax = tmp1;
			if(tmp1<=tmp2 && PobiMax<tmp2)PobiMax=tmp2;
		

			tmp=0;
			tmp1=0;
			tmp2=1;
			if(Crong>=100){
			tmp = Crong/100;
			tmp1+=tmp;
			tmp2*=tmp;
			Crong = Crong%100;
			tmp = Crong/10;
			tmp1+=tmp;
			tmp2*=tmp;
			Crong = Crong%10;
			tmp1+=Crong;
			tmp2*=Crong;			
			}
			else if(Crong>=10) {
				Crong = Crong%100;
				tmp = Crong/10;
				tmp1+=tmp;
				tmp2*=tmp;
				Crong = Crong%10;
				tmp1+=Crong;
				tmp2*=Crong;
			}
			else {
				tmp1+=Crong;
				tmp2*=Crong;
			}
			if(tmp1>=tmp2 && CrongMax<tmp1) CrongMax = tmp1;
			if(tmp1<=tmp2 && CrongMax<tmp2) CrongMax=tmp2;
		}
		PobiNum =PobiMax; 
		CrongNum =CrongMax; 
		if(PobiNum == CrongNum) return 0;
		else if(PobiNum>CrongNum)  return 1;
		else return 2;
		
	}
	public static void main(String[] args) {
		for(int y=0;y<3;y++) {
		int []Pobi= new int [2];
		int []Crong= new int [2];
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		if(num1+1 !=num2 || num1%2==0 ||num3+1 != num4 || num3 % 2 ==0) {
			System.out.println(-1);
			continue;
		}
		Pobi[0] = num1;
		Pobi[1] = num2;
		Crong[0] = num3;
		Crong[1] = num4;
		int result = WhosWin(Pobi[0],Crong[0]);
		System.out.println(result);
		}
	}
}
