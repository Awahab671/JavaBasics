package come.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
	//Di
		int []arr=new int[5];
		arr[0]=10;
		arr[1]=12;
		arr[2]=34;
		arr[3]=43;
		arr[4]=132;
		System.out.println(arr[2]+arr[0]);
		
		String[]days=new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		System.out.println(days[6]);
		days[6]="Funday";
		System.out.println(days[6]);
		
		
		boolean[]boo=new boolean[3];
		boo[0]=true;
		boo[1]=true;
		boo[2]=false;
		System.out.println(boo[1]);
				
		char[]grades=new char[5];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		System.out.println(grades[0]);
		
		String[] names=new String[5];
		names[0]="Wahab";
		names[1]="Masoud";
		names[2]="Molly";
		names[3]="Waheedullah";
		names[4]="Safi";
		System.out.println(names[0]);
		
		
		//This is another type of declaring array values.
		String[] students= {"Wahab", "Masoud", "Molly","Wahidullah",};
		
		System.out.println(students[2]);
		
		
		
		
		
		
	}

}
