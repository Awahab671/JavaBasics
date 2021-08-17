package come.syntax.class09;

public class NestedRecap2 {

	public static void main(String[] args) {
		String hour = "", min = "", sec = "";
	for (int h=0; h<=23; h++) {
		for(int m=0; m<=59; m++) {
			for(int s=0; s<=59; s++) {
			if(h<10) {
				hour= "0"+h;
			}else {
				hour= ""+h;
			}if(m<10) {
				min= "0"+m;
			}else {
				min=""+m;
			}if(s<10) {
				sec= "0"+s;
			}else {
				sec=""+s;
			}
			
			System.out.println(hour+":"+min+":"+sec);
			
			}
			
		}
	}

	}
}

//Weldone!