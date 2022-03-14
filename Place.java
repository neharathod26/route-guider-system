public class Place {
	String pName;
    String pType;
    int length;
    Place pLink;
    Place (String name, String type,int l)
    {
        pName = name;
        pType = type;
        length=l;
        pLink = null;
    }
}
