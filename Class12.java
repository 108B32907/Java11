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
			System.out.println(name+"�ƾǩM�^��@�˦n");
		}
		else if(Math>English) {
			System.out.println(name+"���ƾǤ�^��n");
		}
		else {
			System.out.println(name+"���^���ƾǦn");
		}
	}
	public void failed() {
		if(Math<60) {
			System.out.println(name+"���ƾǷ��F");
		}
		else if(English<60) {
			System.out.println(name+"���^����F");
		}
		else {
			System.out.println(name+"��쳣�ή�");
		}
	}
	public double average() {
		return (Math+English)/2.0;
	}
	public void showData() {
		System.out.println("�m�W="+name);
		System.out.println("�ƾǦ��Z="+Math);
		System.out.println("�^�妨�Z="+English);
		System.out.println("�������Z="+average());
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
