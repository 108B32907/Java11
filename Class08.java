interface iAaa{
	public void show();
}
class Cbbb{
	public int num=10;
	public void set(int n) {
		num=n;
	}
}
class Cccc extends Cbbb implements iAaa{
	public void set(int n) {
		num=n;
	}
	public void show() {
		System.out.println("num="+num);
	}
}
public class Class08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cccc Cc=new Cccc();
		Cc.set(5);
		Cc.show();
	}

}
