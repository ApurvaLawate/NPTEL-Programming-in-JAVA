import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
// Write code below
 char abc[]=input.toCharArray(); 
int outflag=0; 
double apurva=0.0,lifeline=0.0;
String o1="" ,o2=""; 
double a=0.0;

for(int i=0; i<abc.length; i++)
	abc[i]=gui_map(abc[i]);

outerloop:
	for (int i=0; i<abc.length; i++)
	{
  		int r=0;
  		if(abc[i]=='+'||abc[i]=='-'||abc[i]=='/'||abc[i]=='X'||abc[i]=='=')
  		{
   		 for (int j=0; j<i; j++)
      		o1+=Character.toString(abc[j]);
    		apurva=Double.parseDouble(o1);
    	 for(int k=i+1; k<abc.length; k++)
    	{
      	   if(abc[k]=='=')
      		{
        	outflag=1;
        	lifeline=Double.parseDouble(o2);
        	if(abc[i]=='+')
        		a=apurva+lifeline;
        	else if(abc[i]=='-')
       		  a=apurva-lifeline;
       	    else if(abc[i]=='/')
         	 a=apurva/lifeline;
        	else if(abc[i]=='X')
         	 a=apurva*lifeline;
        	break outerloop;
      }
      else
        o2+=Character.toString(abc[k]);
    }
 }
 else if(abc[i]=='R'||abc[i]=='S'||abc[i]=='F')
 {
   for (int j=0;j<i;j++)
     o1+=Character.toString(abc[j]);
     apurva=Double.parseDouble(o1);
   		if(abc[i]=='R')
          System.out.print(Math.sqrt(apurva));
   		else if(abc[i]=='S')
          System.out.print(apurva*apurva);
        else if(abc[i]=='F')
          System.out.print(1/apurva);
    }
}
	if(outflag==1)
      System.out.print(a);
	}// The main() method ends here.
	
// A method that takes a character as input and returns the corresponding GUI character
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','R'}
					,{'b','0'}
					,{'c','.'}
					,{'d','='}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','+'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','-'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','*'}
					,{'q','S'}
					,{'r','F'}
					,{'s','C'}
					,{'t','/'}};
					/*
					R = Square root
					C = Clear/Restart
					F = Fraction
					S = Square
					*/
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
