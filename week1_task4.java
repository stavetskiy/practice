public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;

		// PUT YOUR CODE HERE
        int minVal = 0;
        int maxVal = data.length - 1;

        while (minVal <= maxVal){
            int mid = minVal + (maxVal - minVal) / 2;

            if (data[mid] < numberToFind)
                minVal = mid + 1;
            else if (data[mid] > numberToFind)
                maxVal = mid - 1;
            else if (data[mid] == numberToFind){
                System.out.println(mid);
                return;
            }
        }
        System.out.println("-1");
		// PUT YOUR CODE HERE
	}
}
      
