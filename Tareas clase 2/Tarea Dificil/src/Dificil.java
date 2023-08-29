
public class Dificil {

	public static void main(String[] args) {
		int [] vector = new int [5];
		
		for (int i = 0; i < 5; i++) {
			vector[i] = (int)(Math.random()*50+1);
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
		
		int mcdMayor = mcd (vector[0], vector[1]), mcdActual;
		
		int num1 = vector[0], num2 = vector[1];
		
		for (int i = 0; i < 5; i++){
			for (int j = i + 1; j < 5; j++) {
				mcdActual = mcd(vector[i], vector[j]);
				if (mcdActual > mcdMayor) {
					mcdMayor = mcdActual;
					num1 = vector[i];
					num2 = vector[j];
				}
			}
		}
		
		System.out.println("Los valores " + num1 + " y " + num2);
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
