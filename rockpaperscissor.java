
import java.io.InputStream;
import java.util.Scanner;

import java.util.*;
public class rockpaperscissor{
		public static void main(String[]args) {
			Scanner v= new Scanner(System.in);
        System.out.print("Enter 0 for rock,1 for paper,2 for scissor:");
        int r1=v.nextInt();
        Random r=new Random();
        int nxt = r.nextInt(2);
        System.out.println("Computer's output:"+nxt);
       	for(int i=1;i<5;i++) {
       		if(r1==nxt) {
       			System.out.println("This game is a tie");
       			break;
       		}
       		else if(r1==0 && nxt==1) {
       			System.out.println("This game is won by computer");
       			break;
       		}
       		else if(r1==0 && nxt==2) {
       			System.out.println("This game is won by player");
       			break;
       		}
       		else if(r1==1 && nxt==0) {
       			System.out.println("This game is won by player");
       			break;
       		}
       		else if(r1==1 && nxt==2) {
       			System.out.println("This game is won by computer");
       			break;
       		}
       		else if(r1==2 && nxt==0) {
       			System.out.println("This game is won by computer");
       			break;
       		}
       		else  {
       			System.out.println("This game is won by player");
       			break;
       		}
       		
       	}
	}
		
	}
