package Array;

public class Array {
	private int a[];
	public Array() {
		a=new int[] {1,2,3,4,5,6,7,8,9,10};
	}
	public void print() {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public int sum() {
		int s,i;
		s=0;
		for(i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}
	public int big() {
		int b,i;
		b=0;
		for(i=0;i<a.length;i++) {
			b=a[i]>b?a[i]:b;
		}
		return b;
	}
	public int small() {
		int s,i;
		s=99;
		for(i=0;i<a.length;i++) {
			s=a[i]<s?a[i]:s;
		}
		return s;
	}
	public int occurence(int b) {
		int c,i;
		c=0;
		for(i=0;i<a.length;i++) {
			if (b==a[i])
				c+=1;
		}
		return c;
		
	}
	public int index(int b) {
		int c,i;
		c=0;
		for(i=0;i<a.length;i++) {
			if (b==a[i])
				c=i;
		}
		return c;
		
	}
}
