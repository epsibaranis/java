package Array;

public class main1 {

	public static void main(String[] args) {
		Array a1;
		a1=new Array();
		a1.print();
		System.out.println("sum of array:"+a1.sum());
		System.out.println("biggest number of array:"+a1.big());
		System.out.println("smallest number of array:"+a1.small());
		System.out.println("number occur in the array:"+a1.occurence(3));
		System.out.println("index of the the occurence number in the array:"+a1.index(2));
	}

}
