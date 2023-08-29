
public class Media {

	public static void main(String[] args) {
		int [] vector = new int [5];
		
		for (int i = 0; i < 5; i++) {
			vector[i] = (int)(Math.random()*50+1);
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++){
			for (int j = i + 1; j < 5; j++) {
				for (int m = j + 1; m < 5; m++) {
					if (mcd(vector[i], vector[j]) == mcd (vector[j],vector[m])) {
						System.out.println(vector[i] + " " + vector[j] + " " + vector[m]);
						return;
					}
				}
			}
		}
		
		System.out.println("No hay");
	}
	
	public static int mcd (int num1, int num2){
		int temporal;//Para no perder b
	    while (num2 != 0) {
	        temporal = num2;
	        num2 = num1 % num2;
	        num1 = temporal;
	    }
	    return num1;
	}

}
