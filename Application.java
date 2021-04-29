
public class Application {
	
	public float Num1;
	public float Num2;
	public float Sum;
	public float diff;
	public float mul; 
	
	public float ComputeSum() {
		float Sum=Num1+Num2;
		return Sum;
	}
	
	public float ComputeDiff() {
		float diff=Num1-Num2;
		return diff ;
	}
	
	public float ComputeMul() {
		float mul=Num1*Num2;
		return mul;
	}
	
	
	public float getNum1() {
		return Num1;
	}

	public void setNum1(float num1) {
		Num1 = num1;
	}

	public float getNum2() {
		return Num2;
	}

	public void setNum2(float num2) {
		Num2 = num2;
	}

	public float getSum() {
		return Sum;
	}

	public void setSum(float sum) {
		Sum = sum;
	}

	public float getDiff() {
		return diff;
	}

	public void setDiff(float diff) {
		this.diff = diff;
	}

	public float getMul() {
		return mul;
	}

	public void setMul(float mul) {
		this.mul = mul;
	}

	


}
