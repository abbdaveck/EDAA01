package mountain;

public class Side {
    
    String sideNr;
    Point p1;
    Point p2;

    public Side(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    // @Override
    public boolean equals(Side other){      //Jämför 
        return (p1.equals(other.p1) && p2.equals(other.p2)) || (p1.equals(other.p2) && p2.equals(other.p1));
    }
    
    public int hashCode() {     //Adderar och returnerar hashkoden av de båda punkterna i sidan
        return p1.hashCode() + p2.hashCode();
    }
}
