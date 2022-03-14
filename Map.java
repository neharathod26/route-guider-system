

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

/*
 * OUTPUT :
    |--------------------------------------------------------------------------------------------------------------------------------|
   |                                                                                                                                |
   |                                                                                                                                |
   |    |-----/  |-----|  |      |  -----|-----  |------       |--------      |       | --------  |---- )    |-------   |-----/     |
   |    |    /   |     |  |      |       |       |             |              |       |     |     |      )   |          |    /      |
   |    |   /    |     |  |      |       |       |             |              |       |     |     |       )  |          |   /       |
   |    |  /     |     |  |      |       |       |             |              |       |     |     |       )  |          |  /        |
   |    | /      |     |  |      |       |       |-------      |----------|   |       |     |     |       )  |-------   | /         |
   |    |-----|  |     |  |      |       |       |             |       |  |   |       |     |     |       )  |          |-----|     |
   |    |     |  |     |  |      |       |       |             |       |  |   |       |     |     |       )  |          |     |     |
   |    |     |  |     |  |      |       |       |             |       |  |   |       |     |     |      )   |          |     |     |
   |    |     |  |-----|  |------|       |       |--------     |-------|  |   |-------|  -------  |-----)    |--------  |     |     |
   |                                                                                                                                |
   |--------------------------------------------------------------------------------------------------------------------------------|
		--- WELCOME ---

Enter : 1 if you are the owner / 2 if you are a user >> 1
Please enter password : map000
Wrong password !!

		--- WELCOME ---

Enter : 1 if you are the owner / 2 if you are a user >> 1
Please enter password : map@0210
Welcome Owner !!

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Add a new city
D. Add a new place in a city

Enter an option : A

List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Connection betewen cities :

|------------------|-------------------------------------------------------------------------------
|  1)Pune          |    Pune -> Mumbai -> Nashik -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  2)Mumbai        |    Mumbai -> Nashik -> Pune -> 
|------------------|-----------------------------------------------------------------------------
|  3)Nashik        |    Nashik -> Pune -> Mumbai -> Dhule -> 
|------------------|-----------------------------------------------------------------------------
|  4)Dhule         |    Dhule -> Nashik -> Aurangabad -> Amravati -> 
|------------------|-----------------------------------------------------------------------------
|  5)Amravati      |    Amravati -> Aurangabad -> Dhule -> Nanded -> 
|------------------|-----------------------------------------------------------------------------
|  6)Aurangabad    |    Aurangabad -> Pune -> Solapur -> Nanded -> Amravati -> Dhule -> 
|------------------|-----------------------------------------------------------------------------
|  7)Nanded        |    Nanded -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  8)Solapur       |    Solapur -> Pune -> Aurangabad -> Nanded -> 
|------------------|-----------------------------------------------------------------------------

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Add a new city
D. Add a new place in a city

Enter an option : C

Enter name of the city you want to add >> ABCD
List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Enter number of cities you want to connect to this city >> 3
Enter name of the city you want to connect >> Nashik
Enter distance between the 2 cities in KM >> 110
Enter name of the city you want to connect >> Amravati
Enter distance between the 2 cities in KM >> 256
Enter name of the city you want to connect >> Dhule
Enter distance between the 2 cities in KM >> 79

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Add a new city
D. Add a new place in a city

Enter an option : A

List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Connection betewen cities :

|------------------|-------------------------------------------------------------------------------
|  1)Pune          |    Pune -> Mumbai -> Nashik -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  2)Mumbai        |    Mumbai -> Nashik -> Pune -> 
|------------------|-----------------------------------------------------------------------------
|  3)Nashik        |    Nashik -> Pune -> Mumbai -> Dhule -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  4)Dhule         |    Dhule -> Nashik -> Aurangabad -> Amravati -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  5)Amravati      |    Amravati -> Aurangabad -> Dhule -> Nanded -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  6)Aurangabad    |    Aurangabad -> Pune -> Solapur -> Nanded -> Amravati -> Dhule -> 
|------------------|-----------------------------------------------------------------------------
|  7)Nanded        |    Nanded -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  8)Solapur       |    Solapur -> Pune -> Aurangabad -> Nanded -> 
|------------------|-----------------------------------------------------------------------------
|  9)ABCD          |    ABCD -> Nashik -> Amravati -> Dhule -> 
|------------------|-----------------------------------------------------------------------------

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Add a new city
D. Add a new place in a city

Enter an option : D

List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Enter the name of city in which you want to add a place >> Aurangabad
Enter the name of place which you want to add >> XYZ
Enter the kind of place the new place is (Eg. Restaurant,Hospital) >> Hospital
Enter the number of places you want to connect to this place >> 2
List of all the places in the city  are :

|----------------|---------------------------------------------------------------------------------------------------------|
|  Pune          |      1)Hospital 1 (Hospital) , 2)Hospital 2 (Hospital) , 3)Mall 1 (Mall) , 
|                |          4)Bank 1 (Bank) , 5)Temple 1 (Temple) , 6)Cafe 1 (Cafe) , 
|                |          7)Restaurant 1 (Restaurant) , 8)Restaurant 2 (Restaurant) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Mumbai        |      1)Hospital 1 (Hospital) , 2)Temple 1 (Temple) , 3)Hospital 2 (Hospital) , 
|                |          4)Mall 1 (Mall) , 5)BusStop 1 (Bus Stop) , 6)Theatre 1 (Theatre) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Nashik        |      1)Hospital 1 (Hospital) , 2)Restaurant 1 (Restaurant) , 3)Library 1 (Library) , 
|                |          4)Temple 1 (Temple) , 5)School 1 (School) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Dhule         |      1)Bank 2 (Bank) , 2)Restaurant 1 (Restaurant) , 3)Temple 1 (Temple) , 
|                |          4)Bank 1 (Bank) , 5)City Hospital (Hospital) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Amravati      |      1)Hospital 1 (Hospital) , 2)RailwayStation (Railway Station) , 3)College 1 (College) , 
|                |          4)Court (Court) , 5)Hospital 2 (Hospital) , 6)Church (Church) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Aurangabad    |      1)Church 1 (Church) , 2)School 1 (School) , 3)RailwayStation (Railway Station) , 
|                |          4)Bank 1 (Bank) , 5)Temple 1 (Temple) , 6)XYZ (Hospital) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Nanded        |      1)Temple 1 (Temple) , 2)Hospital 1 (Hospital) , 3)Restaurant 1 (Restaurant) , 
|                |          4)Temple 2 (Temple) , 5)BusStop 1 (Bus Stop) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Solapur       |      1)College 2 (College) , 2)Bank 1 (Bank) , 3)Hospital 1 (Hospital) , 
|                |          4)College 1 (College) , 5)School 1 (School) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  ABCD
|----------------|-------------------------------------------------------------------------------------------------------|

Enter name of the already existing place you want to connect >> Temple 1
Enter the kind of place this already existing place is (Eg. Restaurant,Hospital) >> Temple
Enter distance between the 2 cities in KM >> 6
Enter name of the already existing place you want to connect >> School 1
Enter the kind of place this already existing place is (Eg. Restaurant,Hospital) >> School
Enter distance between the 2 cities in KM >> 11

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Add a new city
D. Add a new place in a city

Enter an option : B

Connection betewen places :

|---------------|-------------------------------------------------------------------------------------------------
| Pune          |    Hospital 1 connections :Hospital 1 -> Temple 1 -> 
|               |    Hospital 2 connections :Hospital 2 -> Restaurant 2 -> 
|               |    Mall 1 connections :Mall 1 -> Restaurant 2 -> 
|               |    Bank 1 connections :Bank 1 -> Cafe 1 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> Restaurant 1 -> 
|               |    Cafe 1 connections :Cafe 1 -> Restaurant 2 -> Hospital 2 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Temple 1 -> Cafe 1 -> 
|               |    Restaurant 2 connections :Restaurant 2 -> Hospital 1 -> Hospital 2 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Mumbai        |    Hospital 1 connections :Hospital 1 -> Theatre 1 -> BusStop 1 -> Temple 1 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> 
|               |    Hospital 2 connections :Hospital 2 -> BusStop 1 -> Mall 1 -> 
|               |    Mall 1 connections :Mall 1 -> Theatre 1 -> Hospital 2 -> 
|               |    BusStop 1 connections :BusStop 1 -> Hospital 2 -> Hospital 1 -> 
|               |    Theatre 1 connections :Theatre 1 -> Hospital 1 -> Mall 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Nashik        |    Hospital 1 connections :Hospital 1 -> Restaurant 1 -> School 1 -> Temple 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Hospital 1 -> Library 1 -> 
|               |    Library 1 connections :Library 1 -> Restaurant 1 -> Temple 1 -> 
|               |    Temple 1 connections :Temple 1 -> School 1 -> Library 1 -> Hospital 1 -> 
|               |    School 1 connections :School 1 -> Temple 1 -> Hospital 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Dhule         |    Bank 2 connections :Bank 2 -> Restaurant 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Temple 1 -> Hospital 1 -> Bank 2 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> Bank 1 -> 
|               |    Bank 1 connections :Bank 1 -> Temple 1 -> 
|               |    City Hospital connections :City Hospital -> Temple 1 -> Restaurant 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Amravati      |    Hospital 1 connections :Hospital 1 -> School 1 -> 
|               |    RailwayStation connections :RailwayStation -> RailwayStation -> Church 1 -> 
|               |    College 1 connections :College 1 -> School 1 -> Temple 1 -> Bank 1 -> 
|               |    Court connections :Court -> RailwayStation -> 
|               |    Hospital 2 connections :Hospital 2 -> RailwayStation -> 
|               |    Church connections :Church -> Hospital 2 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Aurangabad    |    Church 1 connections :Church 1 -> 
|               |    School 1 connections :School 1 -> XYZ -> 
|               |    RailwayStation connections :RailwayStation -> 
|               |    Bank 1 connections :Bank 1 -> 
|               |    Temple 1 connections :Temple 1 -> XYZ -> 
|               |    XYZ connections :XYZ -> Temple 1 -> School 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Nanded        |    Temple 1 connections :Temple 1 -> Hospital 1 -> 
|               |    Hospital 1 connections :Hospital 1 -> Temple 1 -> Restaurant 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Hospital 1 -> Temple 1 -> BusStop 1 -> 
|               |    Temple 2 connections :Temple 2 -> Restaurant 1 -> 
|               |    BusStop 1 connections :BusStop 1 -> Restaurant 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Solapur       |    College 2 connections :College 2 -> Bank 1 -> 
|               |    Bank 1 connections :Bank 1 -> Hospital 1 -> College 2 -> School 1 -> 
|               |    Hospital 1 connections :Hospital 1 -> Bank 1 -> College 1 -> 
|               |    College 1 connections :College 1 -> Hospital 1 -> School 1 -> 
|               |    School 1 connections :School 1 -> Bank 1 -> College 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| ABCD
|---------------|------------------------------------------------------------------------------------------------
Connection betewen places :

|---------------|-------------------------------------------------------------------------------------------------
| Pune          |    Hospital 1 connections :Hospital 1 -> Temple 1 -> 
|               |    Hospital 2 connections :Hospital 2 -> Restaurant 2 -> 
|               |    Mall 1 connections :Mall 1 -> Restaurant 2 -> 
|               |    Bank 1 connections :Bank 1 -> Cafe 1 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> Restaurant 1 -> 
|               |    Cafe 1 connections :Cafe 1 -> Restaurant 2 -> Hospital 2 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Temple 1 -> Cafe 1 -> 
|               |    Restaurant 2 connections :Restaurant 2 -> Hospital 1 -> Hospital 2 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Mumbai        |    Hospital 1 connections :Hospital 1 -> Theatre 1 -> BusStop 1 -> Temple 1 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> 
|               |    Hospital 2 connections :Hospital 2 -> BusStop 1 -> Mall 1 -> 
|               |    Mall 1 connections :Mall 1 -> Theatre 1 -> Hospital 2 -> 
|               |    BusStop 1 connections :BusStop 1 -> Hospital 2 -> Hospital 1 -> 
|               |    Theatre 1 connections :Theatre 1 -> Hospital 1 -> Mall 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Nashik        |    Hospital 1 connections :Hospital 1 -> Restaurant 1 -> School 1 -> Temple 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Hospital 1 -> Library 1 -> 
|               |    Library 1 connections :Library 1 -> Restaurant 1 -> Temple 1 -> 
|               |    Temple 1 connections :Temple 1 -> School 1 -> Library 1 -> Hospital 1 -> 
|               |    School 1 connections :School 1 -> Temple 1 -> Hospital 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Dhule         |    Bank 2 connections :Bank 2 -> Restaurant 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Temple 1 -> Hospital 1 -> Bank 2 -> 
|               |    Temple 1 connections :Temple 1 -> Hospital 1 -> Bank 1 -> 
|               |    Bank 1 connections :Bank 1 -> Temple 1 -> 
|               |    City Hospital connections :City Hospital -> Temple 1 -> Restaurant 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Amravati      |    Hospital 1 connections :Hospital 1 -> School 1 -> 
|               |    RailwayStation connections :RailwayStation -> RailwayStation -> Church 1 -> 
|               |    College 1 connections :College 1 -> School 1 -> Temple 1 -> Bank 1 -> 
|               |    Court connections :Court -> RailwayStation -> 
|               |    Hospital 2 connections :Hospital 2 -> RailwayStation -> 
|               |    Church connections :Church -> Hospital 2 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Aurangabad    |    Church 1 connections :Church 1 -> 
|               |    School 1 connections :School 1 -> XYZ -> 
|               |    RailwayStation connections :RailwayStation -> 
|               |    Bank 1 connections :Bank 1 -> 
|               |    Temple 1 connections :Temple 1 -> XYZ -> 
|               |    XYZ connections :XYZ -> Temple 1 -> School 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Nanded        |    Temple 1 connections :Temple 1 -> Hospital 1 -> 
|               |    Hospital 1 connections :Hospital 1 -> Temple 1 -> Restaurant 1 -> 
|               |    Restaurant 1 connections :Restaurant 1 -> Hospital 1 -> Temple 1 -> BusStop 1 -> 
|               |    Temple 2 connections :Temple 2 -> Restaurant 1 -> 
|               |    BusStop 1 connections :BusStop 1 -> Restaurant 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| Solapur       |    College 2 connections :College 2 -> Bank 1 -> 
|               |    Bank 1 connections :Bank 1 -> Hospital 1 -> College 2 -> School 1 -> 
|               |    Hospital 1 connections :Hospital 1 -> Bank 1 -> College 1 -> 
|               |    College 1 connections :College 1 -> Hospital 1 -> School 1 -> 
|               |    School 1 connections :School 1 -> Bank 1 -> College 1 -> 
|               |    
|---------------|------------------------------------------------------------------------------------------------
| ABCD
|---------------|------------------------------------------------------------------------------------------------

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 0

		--- WELCOME ---

Enter : 1 if you are the owner / 2 if you are a user >> 2
A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Find the shortest path between two cities
D. Get list of same kind of places (Eg. All restaurants) in a particular city

Enter an option : C
List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Enter source city >> Nanded
Enter destination city >> Dhule
path from location Nanded to location Dhule is:
Nanded->Aurangabad->Solapur->Dhule
total distance=378

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Find the shortest path between two cities
D. Get list of same kind of places (Eg. All restaurants) in a particular city

Enter an option : D
List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Enter name of city you want to search place in >> Mumbai
List of all the places in the city  are :

|----------------|---------------------------------------------------------------------------------------------------------|
|  Pune          |      1)Hospital 1 (Hospital) , 2)Hospital 2 (Hospital) , 3)Mall 1 (Mall) , 
|                |          4)Bank 1 (Bank) , 5)Temple 1 (Temple) , 6)Cafe 1 (Cafe) , 
|                |          7)Restaurant 1 (Restaurant) , 8)Restaurant 2 (Restaurant) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Mumbai        |      1)Hospital 1 (Hospital) , 2)Temple 1 (Temple) , 3)Hospital 2 (Hospital) , 
|                |          4)Mall 1 (Mall) , 5)BusStop 1 (Bus Stop) , 6)Theatre 1 (Theatre) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Nashik        |      1)Hospital 1 (Hospital) , 2)Restaurant 1 (Restaurant) , 3)Library 1 (Library) , 
|                |          4)Temple 1 (Temple) , 5)School 1 (School) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Dhule         |      1)Bank 2 (Bank) , 2)Restaurant 1 (Restaurant) , 3)Temple 1 (Temple) , 
|                |          4)Bank 1 (Bank) , 5)City Hospital (Hospital) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Amravati      |      1)Hospital 1 (Hospital) , 2)RailwayStation (Railway Station) , 3)College 1 (College) , 
|                |          4)Court (Court) , 5)Hospital 2 (Hospital) , 6)Church (Church) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Aurangabad    |      1)Church 1 (Church) , 2)School 1 (School) , 3)RailwayStation (Railway Station) , 
|                |          4)Bank 1 (Bank) , 5)Temple 1 (Temple) , 6)XYZ (Hospital) , 
|                |          
|----------------|-------------------------------------------------------------------------------------------------------|

|  Nanded        |      1)Temple 1 (Temple) , 2)Hospital 1 (Hospital) , 3)Restaurant 1 (Restaurant) , 
|                |          4)Temple 2 (Temple) , 5)BusStop 1 (Bus Stop) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  Solapur       |      1)College 2 (College) , 2)Bank 1 (Bank) , 3)Hospital 1 (Hospital) , 
|                |          4)College 1 (College) , 5)School 1 (School) , 
|----------------|-------------------------------------------------------------------------------------------------------|

|  ABCD
|----------------|-------------------------------------------------------------------------------------------------------|

Enter type of place you want to search in Mumbai >> Hospital
List of all the places of type Hospital in Mumbai :
Hospital 1
Hospital 2

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 1

A. To get the list of all the cities and the connection among cities
B. To get the list of all the locations in all the cities as well as their connections
C. Find the shortest path between two cities
D. Get list of same kind of places (Eg. All restaurants) in a particular city

Enter an option : A
List of all cities in the map :

|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|
|         |            |            |           |              |                |            |             |          |
| 1) Pune |  2) Mumbai |  3) Nashik |  4) Dhule |  5) Amravati |  6) Aurangabad |  7) Nanded |  8) Solapur |  9) ABCD | 
|         |            |            |           |              |                |            |             |          |
|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|


Connection betewen cities :

|------------------|-------------------------------------------------------------------------------
|  1)Pune          |    Pune -> Mumbai -> Nashik -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  2)Mumbai        |    Mumbai -> Nashik -> Pune -> 
|------------------|-----------------------------------------------------------------------------
|  3)Nashik        |    Nashik -> Pune -> Mumbai -> Dhule -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  4)Dhule         |    Dhule -> Nashik -> Aurangabad -> Amravati -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  5)Amravati      |    Amravati -> Aurangabad -> Dhule -> Nanded -> ABCD -> 
|------------------|-----------------------------------------------------------------------------
|  6)Aurangabad    |    Aurangabad -> Pune -> Solapur -> Nanded -> Amravati -> Dhule -> 
|------------------|-----------------------------------------------------------------------------
|  7)Nanded        |    Nanded -> Aurangabad -> Solapur -> 
|------------------|-----------------------------------------------------------------------------
|  8)Solapur       |    Solapur -> Pune -> Aurangabad -> Nanded -> 
|------------------|-----------------------------------------------------------------------------
|  9)ABCD          |    ABCD -> Nashik -> Amravati -> Dhule -> 
|------------------|-----------------------------------------------------------------------------

Do you wish to access more options ?(1 for YES / 0 for NO ) >> 0

		--- WELCOME ---

Enter : 1 if you are the owner / 2 if you are a user >> 
 */
