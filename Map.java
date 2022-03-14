

import java.util.*;
public class Map {
	public static void main (String[]args)
	{
	        System.out.println("   |--------------------------------------------------------------------------------------------------------------------------------|");
	        System.out.println("   |                                                                                                                                |");      
	        System.out.println("   |                                                                                                                                |");
	        System.out.println("   |    |-----/  |-----|  |      |  -----|-----  |------       |--------      |       | --------  |---- )    |-------   |-----/     |");
	        System.out.println("   |    |    /   |     |  |      |       |       |             |              |       |     |     |      )   |          |    /      |");
	        System.out.println("   |    |   /    |     |  |      |       |       |             |              |       |     |     |       )  |          |   /       |");
	        System.out.println("   |    |  /     |     |  |      |       |       |             |              |       |     |     |       )  |          |  /        |");
	        System.out.println("   |    | /      |     |  |      |       |       |-------      |----------|   |       |     |     |       )  |-------   | /         |");
	        System.out.println("   |    |-----|  |     |  |      |       |       |             |       |  |   |       |     |     |       )  |          |-----|     |");
	        System.out.println("   |    |     |  |     |  |      |       |       |             |       |  |   |       |     |     |       )  |          |     |     |");
	        System.out.println("   |    |     |  |     |  |      |       |       |             |       |  |   |       |     |     |      )   |          |     |     |");
	        System.out.println("   |    |     |  |-----|  |------|       |       |--------     |-------|  |   |-------|  -------  |-----)    |--------  |     |     |");
	        System.out.println("   |                                                                                                                                |");
	        System.out.println("   |--------------------------------------------------------------------------------------------------------------------------------|");
        int choice,ans;
        char option;
        String pswd;
        Scanner sc=new Scanner(System.in);
        Graph g = new Graph ();
        g.existingCities ();
        g.existingPlaces();
        do
        {
        	System.out.println("\t\t--- WELCOME ---\n");
            System.out.print("Enter : 1 if you are the owner / 2 if you are a user >> ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Please enter password : ");
                    pswd=sc.next();
                    String p="map@0210";
                    if(!pswd.equals(p))
                    {
                    	System.out.println("Wrong password !!\n");
                        break;
                    }
                    else
                        System.out.println("Welcome Owner !!\n");
                    do
                    {
                    	System.out.println("A. To get the list of all the cities and the connection among cities\nB. To get the list of all the locations in all the cities as well as their connections\nC. Add a new city\nD. Add a new place in a city\n");
                        System.out.print("Enter an option : ");
                        option=sc.next().charAt(0);
                        System.out.println();
                        switch(option)
                        {
                            case 'A':
                   	           g.displayCities();
                   	           g.displayConnectedCities();
                   	           System.out.println();
                   	           break;
                   	     
                            case 'B':
                       	       g.displayConnectedPlaces();
                       	       g.displayConnectedPlaces();
                       	       System.out.println();
                       	       break;
                       	       
                            case 'C':
                            	g.addNewCity();
                            	System.out.println();
                                break;
                            
                            case 'D':
                        	    g.addNewPlace();
                        	    System.out.println();
                                break;
                        
                            default:
                                System.out.println("Please enter a valid choice !!\n");
                                break;
                          }
                        System.out.print("Do you wish to access more options ?(1 for YES / 0 for NO ) >> ");
                        ans=sc.nextInt();
                        System.out.println();
                    }while(ans==1);
                    
                    break;
                   
                    
                case 2:
                	do
                	{
                		System.out.println("A. To get the list of all the cities and the connection among cities\nB. To get the list of all the locations in all the cities as well as their connections\nC. Find the shortest path between two cities\nD. Get list of same kind of places (Eg. All restaurants) in a particular city\n");
                        System.out.print("Enter an option : ");
                        option=sc.next().charAt(0);
                        switch(option)
                        {
                            case 'A':
                        	     g.displayCities();
                        	     g.displayConnectedCities();
                        	     System.out.println();
                        	     break;
                        	     
                            case 'B':
                            	g.displayPlaces();
                            	g.displayConnectedPlaces();
                            	System.out.println();
                            	break;
                        	     
                            case 'C':
                            	g.displayCities();
                            	String src,dest;
                                System.out.print("Enter source city >> ");
                                src=sc.next();
                                System.out.print("Enter destination city >> ");
                                dest=sc.next();
                                g.shortestdist(src,dest);
                                System.out.println();
                                break;
                            
                           case 'D':
                        	    g.searchPlace();
                        	    System.out.println();
                                break;
                            
                           default:
                                System.out.println("Please enter a valid choice !!\n");
                                break;
                        }
                        System.out.print("Do you wish to access more options ?(1 for YES / 0 for NO ) >> ");
                        ans=sc.nextInt();
                        System.out.println();
                	}while(ans==1);
                    break;
            }
        }while(true);
    }
}

