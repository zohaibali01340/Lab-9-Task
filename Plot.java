abstract class Plot {
    private int plotNo;
    private double area;
    Owner owner;

public Plot(int plotNo, double area,Owner owner) {
        this.plotNo = plotNo;
        this.area = area;
	this.owner=owner;
    }

//public abstract String getDetails();

public double getArea() {
        return area;
    }

public int getplotNo() {
        return plotNo;
    }

 public Owner getOwner(){
	return owner;

}

public void display(){
	owner.displayowner();
	System.out.println(" Plot no = "+ plotNo);
	System.out.println(" Area  = "+ area);
	
}

}