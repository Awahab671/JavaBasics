package come.syntax.class10;

public class Task {
//First program--------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		String [][]d=new String[3][4];
		//First row of our array.
		d[0][0]="Mr";
		d[0][1]="Mrs";
		d[0][2]="Ms";		
		d[0][3]="Miss";		
		System.out.println(d[0][1]+":Smith, "+d[0][0]+":Obama, "+d[0][2]+":Jackson, "+d[0][3]+":Jordan");

		
		
//Second Program------------------------------------------------------------------------------------------		
		
		String [][]names=new String[2][4];
		//First row of our array.
		names[0][0]="Masoud";
		names[0][1]="Wahab";
		names[0][2]="Safi";
		names[1][0]="A";
		names[1][1]="B";
		System.out.println(names[0][0]+": "+names[1][0]+" "+names[0][1]+" :"+names[1][1]);
		
		
		
	}

}
