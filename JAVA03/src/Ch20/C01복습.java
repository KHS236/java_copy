package Ch20;

/*고객이 사과장수에게 구매한다
클래스안에 어떤 속성을 저장해야 하는가,어떤 기능을 가져야 하는가

C : 고객
-A : 보유금액
-A : 사과개수
-F : 구매하기(사과장수,금액)

C:사과장수
-A : 보유금액
-A : 사과개수
-A : 개당가격
-F : 돈 받기(금액)
----------
payment(Buyer 사과장수,int money)

*/

//사과를 구매하는자
class Buyer{
	private int myMoney;
	private int appleCnt;
	
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	public void payment(Seller 사과장수,int money) {
		myMoney -=money;
		int cnt = 사과장수.receive(money);
		this.appleCnt=+cnt;
	}
	
	
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
}
//사과를 파는 자
class Seller{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	public int receive (int money) {
		this.myMoney +=money;
		int cnt = money / this.price;
		appleCnt-=cnt;
		return cnt;
		
	}

	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	

	
}


public class C01복습 {

	public static void main(String[] args) {
		//고객
		Buyer 기몽섭 = new Buyer(10000,0);
		Buyer 버섯 = new Buyer(20000,0);
		//사과판매자
		Seller 사과장수A = new Seller(50000,100,1000);
		
		//
		기몽섭.payment(사과장수A, 3000);
		버섯.payment(사과장수A, 8000);
		
		//
		System.out.println(기몽섭);
		System.out.println(버섯);
		System.out.println(사과장수A);

	}

}
