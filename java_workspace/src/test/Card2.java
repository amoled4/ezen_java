package test;

public class Card2 {

	public static void main(String[] args) {
		Card2 c = new Card2(); 
		CardPack2 cp = new CardPack2();
				
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				cp.pick().print();
			}
			System.out.println();
		}
	}
	
	
	private char shape;
	private int num;
	
	public Card2() {
		shape = '♥';
		num = 1;
	}
	
	
	public void print() {		
		System.out.print(shape); 
		switch(num) {
		case 1:
			System.out.print("A");
			break;
		case 11: 
			System.out.print("J ");
			break;
		case 12: 
			System.out.print("Q ");
			break;
		case 13: 
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
		}
	}
	
	

	//getter/setter
		
	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		switch(shape) {
		case '♥':
		case '♠':
		case '♣':
		case '◆':
			this.shape = shape;
			break;
		default :
			this.shape = '♥';
		}
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		if(1 > num || num > 13) {
			this.num = 1;
		} else {
			this.num = num;
		}
	}

}
