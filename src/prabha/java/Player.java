package prabha.java;
import java.util.Scanner;

public class Player extends Participant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Participant p=new Participant();
		p.setEmail("Sanju624@gamail.com");
		p.setPassword("624374");
		p.setName("Sanju Samson");
		p.setAge("29");
		p.setAdress("kerala");
		p.setOccupation("Indian Cricketer");
		System.out.println("Email:"+p.getEmail());
		System.out.println("Password:"+p.getPassword());
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Adress:"+p.getAdress());
		System.out.println("Occupation:"+p.getOccupation());
		System.out.println("Are you ready to take up the Quiz game");
		String a=sc.next().toLowerCase();
		if(a.equals("yes")){
			System.out.println("yes");
			System.out.println("rules:");
			System.out.println("1. Each question has 4 options.");
		    System.out.println("2. You have 2 lifelines to use.");
		    System.out.println("3.lifelines can be used only once");
		    System.out.println("4. If you answer incorrectly, the game ends.");
			System.out.println("start quiz!");
			System.out.println("1.what is the national flower?");
			System.out.println("a.rose  b.lilly  c.lotus  d.marigold");
			String options1=sc.next().toLowerCase();
		
		   	if (options1.equals("c")) {
               System.out.println("Correct answer! Well done.");
		   	} else {
               System.out.println("Incorrect answer. Game over.");
		   	}
       		} else {
       			System.out.println("Quiz exited. Thank you!");
       		}

       		sc.close();
			}
	}