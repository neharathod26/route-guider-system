import java.util.*;
public class City {
	String cName;
    ArrayList<Place> connection;
    City cLink;
    int dist;
    City (String name,int d)
    {
        cName = name;
        cLink = null;
        connection=new ArrayList<Place>();
        dist=d;
    }
}
