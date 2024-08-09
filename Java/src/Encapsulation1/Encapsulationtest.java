package Encapsulation1;
class Mobilephone{
	private String model;
	private String brand;
	private String[] messages = new String[10];
	private int messeageCount=0;
	private String[] gallery = new String[10];
	private int photocount=0;
	
	    public String getModel() {
	        return model;
	    }
	    public void setModel(String model) {
	        this.model = model;
	    }
	    public String getBrand() {
	        return brand;
	    }
	    public void setBrand(String brand) {
	        this.brand = brand;
	    }
	    public Mobilephone(String model, String brand) {
	        super();
	        this.model = model;
	        this.brand = brand;
	    }
	    
	    
	    
}
public class Encapsulationtest {

}
