package bit.com.Sort;

public class HeapSort {

	private static int[] data;
	private static int length = 4;

	public static void heap(int[] data, int argLength) {
		for (int i = 1; i < argLength ; i++) {
			int child = i;
			while (child > 0) {
				int parent = (child - 1) / 2;
				
				System.out.println("child d[" + child + "]=" + data[child] + ", parent d[" + parent + "]=" + data[parent]);
				
				if (data[child] > data[parent]) {
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
				}
				child = parent;
			}
		}
	}

	public static void main(String[] args) {
		data = new int[length];
		//for (int i = 0; i < number; i++) {
		//	data[i] = (int) (Math.random() * 100);
		//}
		
		data[0] = 3;
		data[1] = 2;
		data[2] = 1;
		data[3] = 4;
		
		System.out.print("Before sorting : ");
		for (int i = 0; i < length; i++) {
			System.out.print(data[i] + " ");
		}
		
		heap(data, length);
		
		System.out.print(data[0] + ":" + data[1]+ ":" + data[2] + ":" + data[3]);
		
		for (int k = length - 1; k > 0; k--) {
			int temp = data[0];
			data[0] = data[k];
			data[k] = temp;
			
			System.out.println("heap(data[" + data[0] + ":" + data[1]+ ":" + data[2] + ":" + data[3] + "], " + k + ")");
			heap(data, k);
		}
		
		System.out.print("\nAfter sorting : ");
		for (int i = 0; i < length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
