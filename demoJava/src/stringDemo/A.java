package stringDemo;

public class A {
int x;
A(int x)
{
	this.x=x;
}

@Override
	public String toString() {
		return String.valueOf(x);
	}

@Override
	public boolean equals(Object obj) {
//		A ref=(A)obj;
//	if(x==ref.x)
//		return true;
//	else
//		return false;
	return ((A)obj).x==x;
	
	}

}
