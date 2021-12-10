interface Math{
	public void show();
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
interface AdvanceMath{
	public abstract void mod(int a,int b);
	public abstract void fac(int a);
	public abstract void pow(int a,int b);
}
class Compute implements Math,AdvanceMath{
	int ans;
	public void add(int a,int b) {
		ans=a+b;
	}
	public void sub(int a,int b) {
		ans=a-b;
	}
	public void mul(int a,int b) {
		ans=a*b;
	}
	public void div(int a,int b) {
		ans=a/b;
	}
	public void mod(int a,int b) {
		ans=a%b;
	}
	public void fac(int a) {
		ans=1;
		for(int i=1;i<=a;i++) {
			ans=ans*i;
		}
	}
	public void pow(int a,int b) {
		ans=1;
		for(int i=1;i<=b;i++) {
			ans=ans*a;
		}
	}
	public void show() {
		System.out.println("ans="+ans);
	}
}
public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute cmp=new Compute();
		cmp.mul(3,5);
		cmp.show();
		cmp.mod(14,5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}