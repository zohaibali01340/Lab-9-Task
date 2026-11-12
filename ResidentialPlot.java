class ResidentialPlot extends Plot {
    private int bedrooms;
    private int bathrooms;

public ResidentialPlot(int plotNo, double area,Owner owner,int bedrooms, int bathrooms) {
        super(plotNo, area,owner);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

  
    public String getDetails() {
        return "Residential Plot: Bedrooms = " + bedrooms +
               ", Bathrooms = " + bathrooms;
    }
}