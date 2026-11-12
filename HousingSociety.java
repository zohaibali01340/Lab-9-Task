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
	public void findOwner(int plotNo){
		for(int i=0;i<block.length;i++){
			if(block[i]!=null){
			Plot p[]=block[i].getPlots();
				for(int k=0;k<p.length;k++){
					if(p[k]!=null && p[k].getplotNo()==plotNo){
						 p[k].display();
	
	
	}
	}
	}
	}
	}
	}
//	}			
//	}
//	}
//	}
	}
