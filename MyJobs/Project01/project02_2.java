package erg1_ask2;
import java.util.Scanner;
public class Erg1_Ask2 {

	public static void main(String[] args) {
		int sel;
		int step;
		int dir=2; //1=left 2=right 3=up 4=down		
		int pen=0;
		int penn=0;
		char arr[][]  = new char[20][20];
		int x=0,y=0;
		
		
		for (int i=0; i<20; i++) {
			for (int j=0; j<20; j++)
			{
				 arr[i][j]= '.' ;
				 
				 
			}
		} 
		
		do {
			pen=0;
			System.out.print("Please enter command : ");
            Scanner in = new Scanner(System.in); 
            sel = in.nextInt();
            
            switch (sel) {
            	
            case 1:
            	System.out.println("pen up");
            	pen=0;
            	penn=pen;
            break ;
            
            case 2:
            	System.out.println("pen down");
            	pen=1;
            	penn=pen;
            break;	
            
            case 3:
            	
            	 
            	System.out.print("right turn. Your direction : ");
                Scanner input = new Scanner(System.in); 
                dir = in.nextInt();
                if (dir==2)
                	dir=3; 
                else if (dir==1)
                	dir=4;
                else if (dir==3)
                	dir=2;
                
                else if (dir==4)
                	dir=1;
            		
                
            	
            break;	
            
            case 4:
            	
            
            	System.out.print("left turn. Your direction : ");
                Scanner input2 = new Scanner(System.in); 
                dir = in.nextInt();
                if (dir==2)
                	dir=3; 
                else if (dir==1)
                	dir=4;
                else if (dir==3)
                	dir=2;
                else if (dir==4)
                	dir=1;
                
                
            break;	
            
            case 5:
            	int l;
            	int prevy,prevx;
            	System.out.print("Step Length : ");
                Scanner input3 = new Scanner(System.in); 
                step = in.nextInt();
              
                
                	switch (dir) {
                	case 1:
                		l=x-step;
                		prevy=y;
                		prevx=x;
                		if (l<0) {System.out.print("Your going out of the floor please enter different number :" );
                			
                			Scanner input4 = new Scanner(System.in);                         
                			step = in.nextInt();
                			x=x-step;
                			System.out.println("Your current position :  "+y+","+x);}
                		else if (l>0) { 
                			x=x-step; System.out.println("Your current position :  "+y+","+x);}
                		switch (pen) {
                		
                		case 0: break;
                		
                		case 1: 
            				for (int i=prevy; i<=y;i++) {
            					for (int j=prevx; j<=x;j++) {
            						arr[i][j]='x';
            					}
            				}
                			break;
                		}
                	break;
                		
                	case 2:
                		l=x+step;
                		prevy=y;
                		prevx=x;
                		if (l>20) {System.out.print("Your going out of the floor please enter different number :" );

                			Scanner input4 = new Scanner(System.in);                         
                			step = in.nextInt();
                			x=x+step;
                			System.out.println("Your current position :  "+y+","+x);}
                		
                		else if (l<20) {
                			x=x+step; System.out.println("Your current position :  "+y+","+x);}
                //		System.out.println(penn);
                		switch (penn) {
                		
                		case 0: break;
                		
                		case 1: 
                			
            				for (int i=prevy; i<=y;i++) {
            					for (int j=prevx; j<=x;j++) {
            						arr[i][j]='x';
            					}
            				}
                			break;
                		}
                	break;
                		
                	
                	case 3:
                		l=y+step;
                		prevy=y;
                		prevx=x;
                		
                		if (l>20) {System.out.print("Your going out of the floor please enter different number :" );

                			Scanner input4 = new Scanner(System.in);                         
                			step = in.nextInt();
                			y=y+step;
                			System.out.println("Your current position :  "+y+","+x);
                		}
                		else if (l<20) {
                			y=y+step; System.out.println("Your current position :  "+y+","+x);

                			}
                		switch (pen) {
                		
                		case 0: break;
                		
                		case 1: 
            				for (int i=prevy; i<=y;i++) {
            					for (int j=prevx; j<=x;j++) {
            						arr[i][j]='x';
            					}
            				}
                			break;
                		}
                	
                	case 4:
                		l=y-step;
                		prevy=y;
                		prevx=x;
                		if (l<0) {System.out.print("Your going out of the floor please enter different number :" );
                			
                			Scanner input4 = new Scanner(System.in);                         
                			step = in.nextInt();
                			y=y-step;
                			System.out.println("Your current position :  "+y+","+x);}
                		else if (l>0) {
                			y=y-step; System.out.println("Your current position :  "+y+","+x);}
                		switch (pen) {
                		
                		case 0: break;
                		
                		case 1: 
            				for (int i=prevy; i<=y;i++) {
            					
            					for (int j=prevx; j<=x;j++) {
            						arr[i][j]='x';
            					}
            				}
                			break;
                		}
                	
                	default :
                	//	System.out.print("Wrong Input !");
                	
         //       	System.out.println("Your current position :  "+y+","+x);
                	
                	}
                        	
            break;	
            
            case 6:
            	
        		for (int i=0; i<20; i++) {
        			for (int j=0; j<20; j++)
        			{
        				 System.out.print(arr[i][j]);
        				 
        			}    System.out.println();
        		}
            	
            break;	
            
            case 7:
            	System.out.print("The program has been terminated !");
            break;	
            
            default: 
            	System.out.println("Wrong Input !");
            }
            	             
	}while (sel!=7);
	}

}
