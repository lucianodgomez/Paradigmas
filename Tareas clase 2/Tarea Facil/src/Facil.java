
public class Facil {

	public static void main(String[] args) {
		int [] vector = new int [10];
		
		for (int i = 0; i < 10; i++){
			vector[i] = (int)(Math.random()*(10 - (-10) + 1) + (-10));
			System.out.print(vector[i] + " | ");
			/// (hasta - desde + 1) + desde
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++){
			for (int j = i + 1; j < 10; j++){
				for (int k = j + 1; k < 10; k++) {
					if (vector[i] + vector[j] + vector[k] == 0){
						System.out.println(vector[i] + " " + vector[j]
								+ " " + vector[k]);
						return;
					}
				}
			}
		}
	}

}
