
public class SecondH {

	public static void main(String[] args) {
		String bjk="BESIKTASK";
		if(!bjk.isEmpty()) {
			if(bjk.length()%2==1 && bjk.length()>=3) {
				System.out.println(bjk.charAt(bjk.length()/2));
			}else {
				System.out.println("even number");
			}
		}else {
			System.out.println("string can not be empty");
		}

	}

}
