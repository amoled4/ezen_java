package day16;

public class Customer implements Comparable<Customer> {
	private String name;
	private int age;
	private int cost;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = (age>=15)? 100 : 50;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
	
}