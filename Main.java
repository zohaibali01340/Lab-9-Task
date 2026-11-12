public class Main{
	public static void main(String args[]){
	
	HousingSociety h1=new HousingSociety("LDA","Raiwned Road");
	
	Block b1=new Block("A");
	Block b2=new Block("B");
	
	h1.addBlock(b1);
	h1.addBlock(b2);

	Owner o1=new Owner("Zohaib","36602-9083567-2","0301-2345678");
	Owner o2=new Owner("Naeem","32202-8293892-3","0301-8765432");
	
	

} 
}