package com.app.client;

import java.util.Scanner;

import com.app.CLCService;
import com.app.impl.CLCServiceImpl;

public class Institude {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = " ";
		CLCService clcs = new CLCServiceImpl(); 
		
		do{ 
			
			System.out.println("1} AddCource");
			System.out.println("2} AddBatch");
			System.out.println("3} AddTrainer");
			System.out.println("4} AddSudent");
			System.out.println("5} DisplayCource");
			System.out.println("6} DisplayBatch");
			System.out.println("7} DisplayTrainer");
			System.out.println("8} Displaystudent");
			
			
			System.out.println( "Select any Option: ");
			int option = sc.nextInt();
			switch(option) {
			case 1: 
				clcs.addCource();
				break;
			case 2:
				clcs.addBatch();
				break;
			case 3:
				clcs.addTrainer();
				break;
			case 4:
				clcs.addStudent();
				break;
			case 5:
				clcs.displayCource();
				break;
			case 6:
				clcs.displayBatch();
				break;
			case 7:
				clcs.displayTrainer();
				break;
			case 8:
				clcs.displayStudent();
				break;
			
			 default:
				   System.exit(0);
			   break;
			}
			System.out.println("do you want to continue: ");
				s = sc.next();
				
		}while(s.equals("y"));
	}

}



