package prob02;

public class Goods {
	
	private String name;
	private int price;
	private int number;
	
	public Goods(String name, int price, int number) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void show() {
		System.out.println(name+"(가격:"+price+"원)이 "+number+"개 입고 되었습니다.");
	}
}
