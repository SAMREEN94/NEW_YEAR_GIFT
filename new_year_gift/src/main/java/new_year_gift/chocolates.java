package new_year_gift;

public abstract class chocolates extends Giftpack {
	abstract void display();
	private int price;
	private int weight;
	private String choc_name;
	
	public chocolates(String choc_name,int price,int weight) {
		super(price,weight);
		this.choc_name=choc_name;
		this.price=price;
		this.weight=weight;
	}
	
	public String get_choc_name() {
		return choc_name;
	}
	public int getPrice() {
		return price;
		
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		return "\n2Chocolate name:"+this.choc_name+"\nPrice :Rs."+this.price+"\nWeight:"+this.weight+"grams";
	}

}

