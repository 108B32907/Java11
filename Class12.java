interface Data{
	public abstract void best();
	public abstract void failed();
}
interface Test extends Data{
	public abstract void showData();
	public abstract double average();
}
class CStu implements Test{
	protected String name;
	protected int Math;
	protected int English;
	public  CStu(String n,int m,int e) {
		name=n;
		Math=m;
		English=e;
	}
	public void best() {
		if(Math==English) {
			System.out.println(name+"數學和英文一樣好");
		}
		else if(Math>English) {
			System.out.println(name+"的數學比英文好");
		}
		else {
			System.out.println(name+"的英文比數學好");
		}
	}
	public void failed() {
		if(Math<60) {
			System.out.println(name+"的數學當掉了");
		}
		else if(English<60) {
			System.out.println(name+"的英文當掉了");
		}
		else {
			System.out.println(name+"兩科都及格");
		}
	}
	public double average() {
		return (Math+English)/2.0;
	}
	public void showData() {
		System.out.println("姓名="+name);
		System.out.println("數學成績="+Math);
		System.out.println("英文成績="+English);
		System.out.println("平均成績="+average());
	}
	public void show() {
		showData();
	}
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("Judy",58,91);
		stu.show();
	}

}
