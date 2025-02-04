class Box{

	double width,height,depth;
	Box(){
		width = height = depth = 0;
	}

	Box(double length){
		width = height = depth = length;
	}

	Box(double width,double height,double depth){
		this.width  = width;
		this.height = height;
		this.depth  = depth;
	}
	
	Box(Box b){
		width = b.width;
		height=b.height;
		depth =b.depth;
	}

	double volume(){
		return width*height*depth;
	}
	
}

public class Inheritance{
	public static void main(String args[]){
		Box b1 = new Box();
		System.out.println(b1.volume());
		Box b2 = new Box(15);
		System.out.println(b2.volume());
		Box b3 = new Box(5,8,6);
		System.out.println(b3.volume());
		Box b4 = new Box(b2);
		System.out.println(b4.volume());
		Box b5 = new Box(b3);
		System.out.println(b5.volume());
	}
}