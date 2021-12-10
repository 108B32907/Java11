interface iVolume{
	public void showData();
	public double vol();
}
abstract class CSphere implements iVolume{
	final double pi=3.14;
	protected int x;
	protected int y;
}
class CCircle extends CSphere{
	int radius;
	public CCircle(int a,int b,int r) {
		x=a;
		y=b;
		radius=r;
	}
	public void showData() {
		System.out.println("²y¤ß:("+x+","+y+")");
		System.out.println("¥b®|:"+radius);
		System.out.println("Åé¿n:"+vol());
	}
	public double vol() {
		return radius*radius*radius*pi*4/3.0;
	}
public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir=new CCircle(8,6,2);
		cir.showData();
	}
}
