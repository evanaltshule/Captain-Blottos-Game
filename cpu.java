import java.util.Random;

public class cpu{

	private int fieldA;
	private int fieldB;
	private int fieldC;
	private int fieldD;

	public cpu(){
		int fieldA = 0;
		int fieldB = 0;
		int fieldC = 0;
		int fieldD = 0;
	}

	//Randomly generates three numbers that add up to 100
	public void generateFields(){
		Random generator = new Random();
		int a,b,c,temp;
		a = generator.nextInt(103) + 1; 
		b = generator.nextInt(103) + 1; 
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		c = generator.nextInt(103) + 1;
		if(c < a){
			temp = a;
			a = c;
			c = temp;
		}
		if(b < a){
			temp = a;
			a = b;
			b = temp;
		}
		if(c < b){
			temp = b;
			b = c;
			c = temp;
		}
		fieldA = a - 1;
		fieldB = b - a - 1;
		fieldC = c - b - 1;
		fieldD = 103 - c;
	}

	public int getFieldA(){
		return fieldA;
	}

	public int getFieldB(){
		return fieldB;
	}

	public int getFieldC(){
		return fieldC;
	}

	public int getFieldD(){
		return fieldD;
	}
}