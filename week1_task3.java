public class ArraySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		//PUT YOUR CODE HERE
		        int f;

        //PUT YOUR CODE HERE
        for (int i = 1; i <= length - 1; i++) {
            f = 0;
            for (int j = 0; j < length - 1; j++){
                if (array[j] > array [j + 1]) {
                    f = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = f;
                    f = 1;
                }
            }
            if (f == 0)
                break;
        }
		
		//PUT YOUR CODE HERE

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}        
		
      
