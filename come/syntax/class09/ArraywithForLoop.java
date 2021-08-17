package come.syntax.class09;

public class ArraywithForLoop {

	public static void main(String[] args) {
		String[]sentense={"Java", "Saturday", "day", "coding", "is"};
		System.out.println(sentense[1]+" "+sentense[4]+" "+sentense[0]+" "+sentense[3]+" "+sentense[2]);
		int size=sentense.length;
		for(int i=0; i<size; i++) {
			System.out.println(sentense[i]);
		}

	}

}
