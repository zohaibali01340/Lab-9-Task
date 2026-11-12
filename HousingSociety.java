public class HousingSociety{
	private String name;
	private String address;
	private Block block[];
	private int count=0;
	public HousingSociety(String name,String address){
		this.name=name;
		this.address=address;
		block=new Block[5];
	}
	
	public void addBlock(Block b){
		if(count<block.length){
		block[count]=b;
		count++;
	}
	}
	
	public void displayblock(){
		for(int i=0;i<block.length;i++){
			block[i].displayplots();
	
	}
	}
	public Block[] getBlocks(){
		return block;
	}	
//	public void findOwner(int plotNo){
//		for(int i=0;i<block.length;i++){
//			Plot plots[]=block.getPlot();
//				for(int j=0;j<plots.length;j++){
//					if(plots[i].getplotNo()==plotNo){
//						plots[i].displayowner();	
//	
//	}			
//	}
//	}
//	}
	}