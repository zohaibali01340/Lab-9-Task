public class Owner{
	private String name;
	private String cnic;
	private String phone;
	Plot plots[];
		
	public Owner(String name,String cnic,String phone){
		this.name=name;
		this.cnic=cnic;
		this.phone=phone;
		plots=new Plot[10];
	}
	public void displayowner(){
		System.out.println("Owner Name:" + name);
		System.out.println("Owner CNIC:" + cnic);
		System.out.println("Owner Phone Number:" + phone);
	}
	public void displayplots(){
		for(int i=0;i<plots.length;i++){
			plots[i].display();
		
	}
	}
	public Plot[] getPlots(){
		return plots;
	}

	
}
