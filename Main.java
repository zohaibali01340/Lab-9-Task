public class Main {
    public static void main(String[] args) { 

        Owner owner1 = new Owner("Ali", "12345", "03001234567");
        Owner owner2 = new Owner("Ahmed", "67890", "03111234567");
        Owner owner3 = new Owner("Usman", "11223", "03221234567");

        ResidentialPlot r1 = new ResidentialPlot(101, 5.0, owner1, 3, 2);
	CommercialPlot c1 = new CommercialPlot(102, 10.0, owner2, "Grocery Shop", 8.5);
	CommunityCenterPlot cc1 = new CommunityCenterPlot(103, 15.0, owner3, "Sports", 200);

        Plot[] p1 = {r1,c1,cc1};

	for(int i=0; i<p1.length;i++) {
		 p1[i].display();
            }

        Block b1=new Block("B");
	b1.addPlot(r1);
	b1.addPlot(c1);
	b1.addPlot(cc1);
	HousingSociety hs1=new HousingSociety("Aki","103");
	hs1.addBlock(b1);

System.out.println(" ------------------	Using findOwner Function --------------------------------");
	hs1.findOwner(103);
System.out.println();
System.out.println(" ------------------	Using findOwner Function --------------------------------");
	hs1.findOwner(104);
System.out.println();
System.out.println(" ------------------	Using findOwner Function --------------------------------");
	hs1.findOwner(101);
System.out.println();

	    }
}
