public class ComplexNumber
{
	public static void main(String [] arga){
		TestComplexNumber c1 = new TestComplexNumber(2, 4);
		TestComplexNumber c2 = new TestComplexNumber(-4, 8);
		c1.addTwoNumber(c2);

		System.out.println(c1.real+" "+ c1.imgPart+"i");
	}
}

class TestComplexNumber
{
	int real, img;
	
	String imgPart;
	
	TestComplexNumber(int real, int img){
		this.real = real;
		this.img = img;
	}
	public void addTwoNumber(TestComplexNumber t1){
		this.real+=t1.real;
		this.img+=t1.img;
		
		if(this.img>=0){
			imgPart ="+ "+this.img;
		}
		else{
			imgPart = "- "+this.img;
		}
	}
}
