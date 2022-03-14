import java.util.*;

public class Graph {
	ArrayList<City> chead = new ArrayList<City>();

    void existingCities ()
    {
        //adding City nodes
        chead.add(new City("Pune",0));
        chead.add(new City ("Mumbai",0));
        chead.add(new City ("Nashik",0));
        chead.add(new City ("Dhule",0));
        chead.add(new City ("Amravati",0));
        chead.add(new City ("Aurangabad",0));
        chead.add(new City ("Nanded",0));
        chead.add(new City ("Solapur",0));
        
        City temp1 = chead.get(0);
        City temp2 = chead.get(1);
        City temp3 = chead.get(2);
        City temp4 = chead.get(3);
        City temp5 = chead.get(4);
        City temp6 = chead.get(5);
        City temp7 = chead.get(6);
        City temp8 = chead.get(7);

        temp1.cLink = new City ("Mumbai",162);
        temp1.cLink.cLink = new City ("Nashik",233);
        temp1.cLink.cLink.cLink = new City ("Aurangabad",134);
        temp1.cLink.cLink.cLink.cLink = new City ("Solapur",250);

        temp2.cLink = new City ("Nashik",194);
        temp2.cLink.cLink = new City ("Pune",162);
        
        temp3.cLink = new City ("Pune",234);;
        temp3.cLink.cLink = new City ("Mumbai",194);
        temp3.cLink.cLink.cLink = new City ("Dhule",178);

        temp4.cLink = new City ("Nashik",234);
        temp4.cLink.cLink = new City ("Aurangabad",149);
        temp4.cLink.cLink.cLink = new City ("Amravati",232);

        temp5.cLink = new City ("Aurangabad",495);
        temp5.cLink.cLink = new City ("Dhule",149);
        temp5.cLink.cLink.cLink = new City ("Nanded",149);

        temp6.cLink = new City ("Pune",251);
        temp6.cLink.cLink = new City ("Solapur",234);
        temp6.cLink.cLink.cLink = new City ("Nanded",242);
        temp6.cLink.cLink.cLink.cLink = new City ("Amravati",242);
        temp6.cLink.cLink.cLink.cLink.cLink = new City ("Dhule",242);
        
        temp7.cLink = new City ("Aurangabad",136);
        temp7.cLink.cLink = new City ("Solapur",267);
        
        temp8.cLink = new City ("Pune",234);
        temp8.cLink.cLink = new City ("Aurangabad",149);
        temp8.cLink.cLink.cLink = new City ("Nanded",232);
    }
    
    void existingPlaces ()
    {
    	//Adding places in Pune city
        chead.get(0).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(0).connection.add(new Place("Hospital 2", "Hospital",0));
        chead.get(0).connection.add(new Place("Mall 1","Mall",0));
        chead.get(0).connection.add(new Place("Bank 1", "Bank",0));
        chead.get(0).connection.add(new Place("Temple 1", "Temple",0));
        chead.get(0).connection.add(new Place("Cafe 1","Cafe",0));
        chead.get(0).connection.add(new Place("Restaurant 1","Restaurant",0));
        chead.get(0).connection.add(new Place("Restaurant 2","Restaurant",0));
        //Connecting the places
        chead.get(0).connection.get(0).pLink=new Place("Temple 1","Temple",0);   
        chead.get(0).connection.get(1).pLink=new Place("Restaurant 2","Restaurant",0);      
        chead.get(0).connection.get(2).pLink=new Place("Restaurant 2","Restaurant",0);    
        chead.get(0).connection.get(3).pLink=new Place("Cafe 1","Cafe",0);
        chead.get(0).connection.get(4).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(0).connection.get(4).pLink.pLink=new Place("Restaurant 1","Restaurant",0); 
        chead.get(0).connection.get(5).pLink=new Place("Restaurant 2","Restaurant",0);
        chead.get(0).connection.get(5).pLink.pLink=new Place("Hospital 2","Hospital",0);
        chead.get(0).connection.get(6).pLink=new Place("Temple 1","Temple",0);
        chead.get(0).connection.get(6).pLink.pLink=new Place("Cafe 1","Cafe",0);
        chead.get(0).connection.get(7).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(0).connection.get(7).pLink.pLink=new Place("Hospital 2","Hospital",0);
        
        //Adding places in Mumbai city
        chead.get(1).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(1).connection.add(new Place("Temple 1", "Temple",0));
        chead.get(1).connection.add(new Place("Hospital 2", "Hospital",0));
        chead.get(1).connection.add(new Place("Mall 1","Mall",0));
        chead.get(1).connection.add(new Place("BusStop 1","Bus Stop",0));
        chead.get(1).connection.add(new Place("Theatre 1","Theatre",0));
        //Connecting the places
        chead.get(1).connection.get(0).pLink=new Place("Theatre 1","Theatre",0);
        chead.get(1).connection.get(0).pLink.pLink=new Place("BusStop 1","Bus Stop",0);
        chead.get(1).connection.get(0).pLink.pLink.pLink=new Place("Temple 1","Temple",0);
        chead.get(1).connection.get(1).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(1).connection.get(2).pLink=new Place("BusStop 1","Bus Stop",0);
        chead.get(1).connection.get(2).pLink.pLink=new Place("Mall 1","Mall",0);
        chead.get(1).connection.get(3).pLink=new Place("Theatre 1","Theatre",0);
        chead.get(1).connection.get(3).pLink.pLink=new Place("Hospital 2","Hospital",0);
        chead.get(1).connection.get(4).pLink=new Place("Hospital 2","Hospital",0);
        chead.get(1).connection.get(4).pLink.pLink=new Place("Hospital 1","Hospital",0);
        chead.get(1).connection.get(5).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(1).connection.get(5).pLink.pLink=new Place("Mall 1","Mall",0);
    
        //Adding places in Nashik city
        chead.get(2).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(2).connection.add(new Place("Restaurant 1","Restaurant",0));
        chead.get(2).connection.add(new Place("Library 1","Library",0));
        chead.get(2).connection.add(new Place("Temple 1", "Temple",0));
        chead.get(2).connection.add(new Place("School 1","School",0));
        //Connecting the places
        chead.get(2).connection.get(0).pLink=new Place("Restaurant 1","Restaurant",0);
        chead.get(2).connection.get(0).pLink.pLink=new Place("School 1","School",0);
        chead.get(2).connection.get(0).pLink.pLink.pLink=new Place("Temple 1","Temple",0);       
        chead.get(2).connection.get(1).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(2).connection.get(1).pLink.pLink=new Place("Library 1","Library",0);
        chead.get(2).connection.get(2).pLink=new Place("Restaurant 1","Restaurant",0);
        chead.get(2).connection.get(2).pLink.pLink=new Place("Temple 1","Temple",0);
        chead.get(2).connection.get(3).pLink=new Place("School 1","School",0);
        chead.get(2).connection.get(3).pLink.pLink=new Place("Library 1","Library",0);
        chead.get(2).connection.get(3).pLink.pLink.pLink=new Place("Hospital 1","Hospital",0);
        chead.get(2).connection.get(4).pLink=new Place("Temple 1","Temple",0);
        chead.get(2).connection.get(4).pLink.pLink=new Place("Hospital 1","Hospital",0);
    
      //Adding places in Dhule city
        chead.get(3).connection.add(new Place("Bank 2", "Bank",0));
        chead.get(3).connection.add(new Place("Restaurant 1","Restaurant",0));
        chead.get(3).connection.add(new Place("Temple 1","Temple",0));
        chead.get(3).connection.add(new Place("Bank 1","Bank",0));
        chead.get(3).connection.add(new Place("City Hospital", "Hospital",0));
      //Connecting the places
        chead.get(3).connection.get(0).pLink=new Place("Restaurant 1","Restaurant",0);
        chead.get(3).connection.get(1).pLink=new Place("Temple 1","Temple",0);
        chead.get(3).connection.get(1).pLink.pLink=new Place("Hospital 1","Hospital",0);
        chead.get(3).connection.get(1).pLink.pLink.pLink=new Place("Bank 2","Bank",0);
        chead.get(3).connection.get(2).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(3).connection.get(2).pLink.pLink=new Place("Bank 1","Bank",0);
        chead.get(3).connection.get(3).pLink=new Place("Temple 1","Temple",0);
        chead.get(3).connection.get(4).pLink=new Place("Temple 1","Temple",0);
        chead.get(3).connection.get(4).pLink.pLink=new Place("Restaurant 1","Restaurant",0);
        
      //Adding places in Amravati city
        chead.get(4).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(4).connection.add(new Place("RailwayStation", "Railway Station",0));
        chead.get(4).connection.add(new Place("College 1", "College",0));
        chead.get(4).connection.add(new Place("Court", "Court",0));
        chead.get(4).connection.add(new Place("Hospital 2","Hospital",0));
        chead.get(4).connection.add(new Place("Church","Church",0));
      //Connecting the places
        chead.get(4).connection.get(0).pLink=new Place("RailwayStation","Railway Station",0);     
        chead.get(4).connection.get(1).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(4).connection.get(1).pLink.pLink=new Place("College 1","College",0);
        chead.get(4).connection.get(1).pLink.pLink.pLink=new Place("Court","Court",0);     
        chead.get(4).connection.get(2).pLink=new Place("RailwayStation","Railway Station",0);
        chead.get(4).connection.get(2).pLink.pLink=new Place("Court","Court",0);       
        chead.get(4).connection.get(3).pLink=new Place("RailwayStation","Railway Station",0);
        chead.get(4).connection.get(3).pLink.pLink=new Place("Hospital 2","Hospital",0);
        chead.get(4).connection.get(3).pLink.pLink.pLink=new Place("College 1","College",0);       
        chead.get(4).connection.get(4).pLink=new Place("Court","Court",0);
        chead.get(4).connection.get(4).pLink.pLink=new Place("Church 1","Church",0);
        chead.get(4).connection.get(5).pLink=new Place("Hospital 2","Hospital",0);
        
      //Adding places in Aurangabad city
        chead.get(5).connection.add(new Place("Church 1","Church",0));
        chead.get(5).connection.add(new Place("School 1", "School",0));
        chead.get(5).connection.add(new Place("RailwayStation", "Railway Station",0));
        chead.get(5).connection.add(new Place("Bank 1", "Bank",0));
        chead.get(5).connection.add(new Place("Temple 1", "Temple",0));
      //Connecting the places
        chead.get(4).connection.get(0).pLink=new Place("School 1","School",0);  
        chead.get(4).connection.get(1).pLink=new Place("RailwayStation","Railway Station",0);
        chead.get(4).connection.get(1).pLink.pLink=new Place("Church 1","Church",0);    
        chead.get(4).connection.get(2).pLink=new Place("School 1","School",0);
        chead.get(4).connection.get(2).pLink.pLink=new Place("Temple 1","Temple",0);
        chead.get(4).connection.get(2).pLink.pLink.pLink=new Place("Bank 1","Bank",0);   
        chead.get(4).connection.get(3).pLink=new Place("RailwayStation","Railway Station",0);
        chead.get(4).connection.get(4).pLink=new Place("RailwayStation","Railway Station",0);
        
        //Adding places in Nanded city
        chead.get(6).connection.add(new Place("Temple 1", "Temple",0));
        chead.get(6).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(6).connection.add(new Place("Restaurant 1", "Restaurant",0));
        chead.get(6).connection.add(new Place("Temple 2", "Temple",0));
        chead.get(6).connection.add(new Place("BusStop 1", "Bus Stop",0));
      //Connecting the places
        chead.get(6).connection.get(0).pLink=new Place("Hospital 1","Hospital",0);      
        chead.get(6).connection.get(1).pLink=new Place("Temple 1","Temple",0);
        chead.get(6).connection.get(1).pLink.pLink=new Place("Restaurant 1","Restaurant",0);       
        chead.get(6).connection.get(2).pLink=new Place("Hospital 1","Hospital",0);          
        chead.get(6).connection.get(2).pLink.pLink=new Place("Temple 1","Temple",0);
        chead.get(6).connection.get(2).pLink.pLink.pLink=new Place("BusStop 1","Bus Stop",0); 
        chead.get(6).connection.get(3).pLink=new Place("Restaurant 1","Restaurant",0); 
        chead.get(6).connection.get(4).pLink=new Place("Restaurant 1","Restaurant",0); 
        
      //Adding places in Solapur city
        chead.get(7).connection.add(new Place("College 2", "College",0));
        chead.get(7).connection.add(new Place("Bank 1", "Bank",0));
        chead.get(7).connection.add(new Place("Hospital 1", "Hospital",0));
        chead.get(7).connection.add(new Place("College 1", "College",0));
        chead.get(7).connection.add(new Place("School 1", "School",0));
      //Connecting the places
        chead.get(7).connection.get(0).pLink=new Place("Bank 1","Bank",0);          
        chead.get(7).connection.get(1).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(7).connection.get(1).pLink.pLink=new Place("College 2","College",0);
        chead.get(7).connection.get(1).pLink.pLink.pLink=new Place("School 1","School",0);        
        chead.get(7).connection.get(2).pLink=new Place("Bank 1","Bank",0);  
        chead.get(7).connection.get(2).pLink.pLink=new Place("College 1","College",0);      
        chead.get(7).connection.get(3).pLink=new Place("Hospital 1","Hospital",0);
        chead.get(7).connection.get(3).pLink.pLink=new Place("School 1","School",0);       
        chead.get(7).connection.get(4).pLink=new Place("Bank 1","Bank",0);  
        chead.get(7).connection.get(4).pLink.pLink=new Place("College 1","College",0);
    }
    
    void displayCities ()
    {
        System.out.println("List of all cities in the map :\n");
        System.out.println("|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|");
        System.out.println("|         |            |            |           |              |                |            |             |          |");
        System.out.print("|");
        for (int i = 0; i < chead.size(); i++)
            System.out.print( " "+(i+1)+") "+      chead.get(i).cName+" | ");
        
        System.out.println();
        System.out.println("|         |            |            |           |              |                |            |             |          |");
        System.out.println("|---------|------------|------------|-----------|--------------|----------------|------------|-------------|----------|");
        System.out.println("\n");
    }

    void displayConnectedCities()
    {
        System.out.println("Connection betewen cities :\n");
        System.out.println("|------------------|-------------------------------------------------------------------------------");
        for(int i=0;i<chead.size();i++)
        {
            City ptr=chead.get(i);
            System.out.print("|  "+(i+1)+")"+ptr.cName );
            City temp=chead.get(i);
            
            int sz=temp.cName.length();
            if(sz==10)
            {
                sz=sz-7;
                while(sz>=0)
                {
                    System.out.print(" ");
                    sz--;
                }
            }
            else
            {
                sz=3+(10-sz);
                while(sz>=0)
                {
                    System.out.print(" ");
                    sz--;
                }
            }
            System.out.print("|    ");
                   
            while(ptr!=null)
            {
                System.out.print(ptr.cName+" -> ");
                ptr=ptr.cLink;
                    
            }
            System.out.println("\n|------------------|-----------------------------------------------------------------------------");
        }
    }

    void displayPlaces()
    {
        System.out.println("List of all the places in the city  are :\n");
        System.out.println("|----------------|---------------------------------------------------------------------------------------------------------|");
        //System.out.println("|                |");
        for(int i=0;i<chead.size();i++)
        {
            City ptr=chead.get(i);
            System.out.print("|  "+ptr.cName);
            int sz=ptr.cName.length();
            for(int j=0;j<chead.get(i).connection.size();j++)
            {
                if(j==0)
                {
                    if(sz==10)
                    {
                        sz=sz-7;
                        while(sz>=0)
                        {
                            System.out.print(" ");
                            sz--;
                        }
                    }
                    else
                    {
                        sz=3+(10-sz);
                        while(sz>=0)
                        {
                            System.out.print(" ");
                            sz--;
                        }
                    }
                    
                    System.out.print("|      ");
                }
                    
                System.out.print((j+1)+")"+chead.get(i).connection.get(j).pName+" ("+chead.get(i).connection.get(j).pType+")"+" , ");
                if((j+1)%3==0)
                {
                    System.out.println();
                    System.out.print("|");
                    System.out.print("                |          ");
                }
            }
            System.out.println();
            System.out.println("|----------------|-------------------------------------------------------------------------------------------------------|");
            System.out.println();
        }
    }
        
    void displayConnectedPlaces()
    {
        System.out.println("Connection betewen places :\n");
        System.out.println("|---------------|-------------------------------------------------------------------------------------------------");
        //  System.out.println("|");
        for(int i=0;i<chead.size();i++)
        {
            City temp=chead.get(i);
            System.out.print("| "+chead.get(i).cName);
            for(int j=0;j<chead.get(i).connection.size();j++)
            {
                int sz=temp.cName.length();
                if(j==0)
                {
                   if(sz==10)
                   {
                        sz=sz-7;
                        while(sz>=0)
                        {
                            System.out.print(" ");
                            sz--;
                        }
                       
                   }
                    else
                    {
                        sz=3+(10-sz);
                        while(sz>=0)
                        {
                            System.out.print(" ");
                            sz--;
                        }
                    }
                    System.out.print("|    ");
                }
                    
                Place ptr=chead.get(i).connection.get(j);
                System.out.print(ptr.pName+" connections :");
            	while(ptr!=null)
                {
                    System.out.print(ptr.pName+" -> ");
                    ptr=ptr.pLink;
                }
                System.out.println();
                System.out.print("|               |    ");
            }
            System.out.println("");
            System.out.println("|---------------|------------------------------------------------------------------------------------------------");
        }
    }
   
    void addNewCity()
    {
    	Scanner obj=new Scanner(System.in);
    	String name;
    	int n;
    	System.out.print("Enter name of the city you want to add >> ");
    	name=obj.nextLine();
    	City temp=new City(name,0);
        chead.add(temp);
    	displayCities();
    	System.out.print("Enter number of cities you want to connect to this city >> ");
    	n=obj.nextInt();
    	
    	for(int i=0;i<n;i++)
    	{
    		Scanner s =new Scanner(System.in);
    		System.out.print("Enter name of the city you want to connect >> ");
        	String connected=s.nextLine();
        	System.out.print("Enter distance between the 2 cities in KM >> ");
        	int d=s.nextInt();
        	
        	City c1=new City(connected,d);
        	City ptr1=temp;
        	
        	while(ptr1.cLink!=null)
        	{
        		ptr1=ptr1.cLink;
        	}
        	
        	ptr1.cLink=c1;
        	
        	Iterator<City> itr= chead.iterator();
        	City c=itr.next();
        	while(itr.hasNext())
        	{
        	    c=itr.next();
        	    if(c.cName.equals(connected))
        	    {
        	        break;
        	    }
        	}
        	while(c.cLink!=null)
        	{
        		c=c.cLink;
        	}
        	City c3=new City(name,d);
        	c.cLink=c3;
    	}
    	
    }
    
    void addNewPlace()
    {
    	Scanner sc3=new Scanner(System.in);
    	String name,pname,kind;
    	int n;
    	displayCities();
    	System.out.print("Enter the name of city in which you want to add a place >> ");
    	name=sc3.nextLine();
    	Iterator<City> itr= chead.iterator();
    	City c=itr.next();
    	while(itr.hasNext())
    	{
    	    c=itr.next();
    	    if(c.cName.equals(name))
    	    {
    	        break;
    	    }
    	}
    	System.out.print("Enter the name of place which you want to add >> ");
    	pname=sc3.nextLine();
    	System.out.print("Enter the kind of place the new place is (Eg. Restaurant,Hospital) >> ");
    	kind=sc3.nextLine();
    	Place p=new Place(pname,kind,0);
    	c.connection.add(p);
    	System.out.print("Enter the number of places you want to connect to this place >> ");
    	n=sc3.nextInt();
    	displayPlaces();
    	for(int i=0;i<n;i++)
    	{
    		Scanner sc4 =new Scanner(System.in);
    		System.out.print("Enter name of the already existing place you want to connect >> ");
        	String connected=sc4.nextLine();
        	System.out.print("Enter the kind of place this already existing place is (Eg. Restaurant,Hospital) >> ");
        	String type=sc4.nextLine();
        	System.out.print("Enter distance between the 2 cities in KM >> ");
        	int d=sc4.nextInt();
        	
        	Place p1=new Place(connected,type,d);
        	Place ptr1=p;
        	
        	while(ptr1.pLink!=null)
        	{
        		ptr1=ptr1.pLink;
        	}
        	
        	ptr1.pLink=p1;
        	
        	Iterator<Place> it= c.connection.iterator();
        	Place p2=it.next();
        	while(it.hasNext())
        	{
        	    p2=it.next();
        	    if(p2.pName.equals(connected))
        	    {
        	        break;
        	    }
        	}
        	while(p2.pLink!=null)
        	{
        		p2=p2.pLink;
        	}
        	Place p3=new Place(pname,kind,d);
        	p2.pLink=p3;
    	}
    }
    
    void searchPlace()
    {
    	displayCities();
    	Scanner sc2=new Scanner(System.in);
    	String name,kind;
    	System.out.print("Enter name of city you want to search place in >> ");
    	name=sc2.nextLine();
    	Iterator<City> itr= chead.iterator();
    	City c=itr.next();
    	while(itr.hasNext())
    	{
    	    c=itr.next();
    	    if(c.cName.equals(name))
    	    {
    	        break;
    	    }
    	}
    	displayPlaces();
    	System.out.print("Enter type of place you want to search in "+c.cName+" >> ");
    	kind=sc2.nextLine();
    	System.out.println("List of all the places of type "+kind+" in "+c.cName+" :");
    	for(int i=0;i<c.connection.size();i++)
    	{
    		if(c.connection.get(i).pType.equals(kind))
    		{
    			System.out.println(c.connection.get(i).pName);
    		}
    	}
    }
    
    void shortestdist(String src,String des)
    {
        int i=0,j=0;
        String ptr;
        int cnt=0;
        int src_pos=0;
        int des_pos=0;
        City temp;
        for(i=0;i<chead.size();i++)
        {
            ptr=chead.get(i).cName;
            if(ptr.equalsIgnoreCase(src))
            {
                src_pos=i;
                cnt++;
            }
            if(ptr.equalsIgnoreCase(des))
            {
                des_pos=i;
                cnt++;
            }
        }
        
        if(cnt!=2)
        {
            System.out.println("Enter correct city names (only from the list)\n");
            return;
        }
        else
            cnt=0;
           
        int flag[]=new int[chead.size()];
        int vertexval[]=new int[chead.size()];
        
        for( i=0;i<chead.size();i++)
        {
            flag[i]=0;
            vertexval[i]=Integer.MAX_VALUE;
        }
           
        vertexval[src_pos]=0;
        flag[src_pos]=1;
        
        temp=chead.get(src_pos).cLink;
          
        while(temp!=null)
        {
            ptr=temp.cName;
            for(i=0;i<chead.size();i++)
            {
                if(ptr.equalsIgnoreCase(chead.get(i).cName))
                {
                    cnt++;
                    break;
                } 
            }
            if(cnt==0)
                return;
            else 
                cnt=0;
               
            if(vertexval[src_pos]+temp.dist<vertexval[i])
                vertexval[i]=vertexval[src_pos]+temp.dist;
               
            temp=temp.cLink;
        }
        
        int hold=0;
        cnt=0;
        System.out.println("path from location "+chead.get(src_pos).cName+" to location "+chead.get(des_pos).cName+" is:");
        System.out.print(chead.get(src_pos).cName);
           
        for(i=0;i<chead.size();i++)
        {         
            int min=Integer.MAX_VALUE;
            for(j=0;j<chead.size()-1;j++)
            {
                if(vertexval[j]<min&&flag[j]==0)
                {
                    hold=j;
                    min=vertexval[j];
                }
            }
            if(hold==des_pos)
            {
                System.out.print("->"+chead.get(hold).cName);
                System.out.println();
                System.out.println("total distance="+vertexval[des_pos]);
                return;
            }
            else
                System.out.print("->"+chead.get(hold).cName);
              
            temp=chead.get(hold).cLink;
            flag[hold]=1;
              
            while(temp!=null)
            {
                ptr=temp.cName;
                for(j=0;j<chead.size();j++)
                {
                    if(ptr.equalsIgnoreCase(chead.get(j).cName))
                    {
                        cnt++;
                        break;
                    }
                }
                if(cnt==0)
                    return;
                else
                    cnt=0;
                  
                if(vertexval[hold]+temp.dist<vertexval[j])
                    vertexval[j]=vertexval[hold]+temp.dist;
                  
                temp=temp.cLink;
            }
        }
     }
}
    




















