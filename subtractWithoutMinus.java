import java.util.Scanner;

public class subtractWithoutMinus {

	final static char lastDigit0='0';
	final static char lastDigit1='9';
	final static char lastDigit2='8';
	final static char lastDigit3='7';
	final static char lastDigit4='6';
	final static char lastDigit5='5';
	final static char lastDigit6='4';
	final static char lastDigit7='3';
	final static char lastDigit8='2';
	final static char lastDigit9='1';
	
	final static char otherDigit0='9';
	final static char otherDigit1='8';
	final static char otherDigit2='7';
	final static char otherDigit3='6';
	final static char otherDigit4='5';
	final static char otherDigit5='4';
	final static char otherDigit6='3';
	final static char otherDigit7='2';
	final static char otherDigit8='1';
	final static char otherDigit9='0';
	
	public static void main(String[] args){
		String num;
		char[] result;
		int i,j;
		
		Scanner in = new Scanner(System.in);
		
		num=in.next();
		result = new char[num.length()];
		
		i=0;
		j=0;
		while(num.charAt(i)!='.'){
			result[j]= '0';
			j++;
			i++;
		}i++;
		result[j]= '.';
		j++;
		
		while(i<(num.length()-1)){
			switch(num.charAt(i)){
				case '0':
					result[j]= otherDigit0;
					break;
				case '1':
					result[j]= otherDigit1;
					break;
				case '2':
					result[j]= otherDigit2;
					break;
				case '3':
					result[j]= otherDigit3;
					break;
				case '4':
					result[j]= otherDigit4;
					break;
				case '5':
					result[j]= otherDigit5;
					break;
				case '6':
					result[j]= otherDigit6;
					break;
				case '7':
					result[j]= otherDigit7;
					break;
				case '8':
					result[j]= otherDigit8;
					break;
				case '9':
					result[j]= otherDigit9;
					break;
			}
			i++;
			j++;
		}
		
		if(i==(num.length()-1)){
			switch(num.charAt(i)){
				case '0':
					result[j]= lastDigit0;
					break;
				case '1':
					result[j]= lastDigit1;
					break;
				case '2':
					result[j]= lastDigit2;
					break;
				case '3':
					result[j]= lastDigit3;
					break;
				case '4':
					result[j]= lastDigit4;
					break;
				case '5':
					result[j]= lastDigit5;
					break;
				case '6':
					result[j]= lastDigit6;
					break;
				case '7':
					result[j]= lastDigit7;
					break;
				case '8':
					result[j]= lastDigit8;
					break;
				case '9':
					result[j]= lastDigit9;
					break;
			}
		}
		
		System.out.println(result);
		
	}
}
