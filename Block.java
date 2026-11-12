public class Block{
	private String blockName;
	Plot plots[];
	private int count=0;
	Block[] block;
	
	public Block(String blockName){
		this.blockName=blockName;
		plots=new Plot[10];
	}
	
	public void addPlot(Plot p){
		if(count<plots.length){
			plots[count]=p;
			count++;
	}
	}
	
	public void displayplots(){
			System.out.println("Block Name:"+ blockName);
			for(int i=0;i<plots.length;i++){
			plots[i].display();
		
	}
	}
	public Plot[] getPlots(){
		return plots;
	}
	}