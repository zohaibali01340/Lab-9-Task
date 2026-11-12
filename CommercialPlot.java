class CommercialPlot extends Plot {
    private String shopType;
    private double floorArea;

    public CommercialPlot(int plotNo, double area,Owner owner, String shopType, double floorArea) {
        super(plotNo, area,owner);
        this.shopType = shopType;
        this.floorArea = floorArea;
    }

  
    public String getDetails() {
        return "Commercial Plot: Shop Type = " + shopType +
               ", Floor Area = " + floorArea;
    }
}