
interface Data{
	public abstract void showData();
}
interface Test{
	public abstract void showScore(); 
	public abstract double calcu();
}
class CStu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public CStu(String i,String n,int m,int f,int c) {
		id=i;
		name=n;
		common=c;
		mid=m;
		finl=f;
	}
	public void showData() {
		System.out.println("學號:"+id);
		System.out.println("姓名:"+name);
	}
	public void showScore() {
		System.out.println("期中成績="+mid);
		System.out.println("期末成績="+finl);
		System.out.println("平常成績="+common);
	}
	public double calcu() {
		return (mid*0.3)+(finl*0.3)+(common*0.4);
	}
	public void show() {
		showData();
		showScore();
		System.out.println("學期成績="+calcu());
	}
}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",90,92,85);
		stu.show();
	}

}
