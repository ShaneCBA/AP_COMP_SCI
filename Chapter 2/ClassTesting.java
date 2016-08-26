class Shape {
	private int x,y;

	public Shape(int iniX, int iniY) {
		x = iniX;
		y = iniY;
	}
	public int getX(){
		return x;
	}
	public void setX(int setx){
		setx = x;
	}
}

public class ClassTesting {
	public static void main(String[] args){
		Shape test = new Shape(1,5);
		System.out.println(test.getX());
		int asdf = 123;

		String reftest = "ayy";

		System.out.println(asdf);
		test.setX(asdf);
		System.out.println(asdf);

		System.out.println(reftest.intern());//onjects such as strings are references to addresses
	}
}