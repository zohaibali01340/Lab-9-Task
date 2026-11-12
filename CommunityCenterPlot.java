class CommunityCenterPlot extends Plot {
    private String purpose;
    private int capacity;

public CommunityCenterPlot(int plotNo, double area,Owner owner, String purpose, int capacity) {
        super(plotNo, area,owner);
        this.purpose = purpose;
        this.capacity = capacity;
    }

 
    public String getDetails() {
        return "Community Center: Purpose = " + purpose +
               ", Capacity = " + capacity;
    }
}