package 위장;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = 
				{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}
				,{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(clothes));
	}

}