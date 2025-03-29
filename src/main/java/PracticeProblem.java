public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(validIndex(new int[]{1, 3, 5}, 4));
		System.out.println(safeConvertStringtoInt( "bruv"));
	}


		public static boolean validIndex(int[] arr, int index) {
			try {
				int value = arr[index]; 
				return true; 
			} catch (Exception e) {
				return false; 
			}
		}

		public static int divide(int a, int b){
			try{
				return a/b;
				
			}
			catch(Exception e){
				return 0;
			}
		}
	public static int safeConvertStringtoInt(String num){
			try{
				return Integer.parseInt(num);
			}
			catch(Exception e){
				return 0;

			}
		}

}
