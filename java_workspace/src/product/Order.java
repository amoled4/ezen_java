package product;

public class Order extends Product {
	
	private int count;
	private int total;
	
	
	
	public void print() {
		System.out.println(super.getMenu()+" "+count+"개" + " => "+super.getPrice()*count+"원");
		
	}
	
	
	
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
