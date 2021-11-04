package example6;

import java.util.ArrayList;
public class ArrayListTest_ex {

	public static void main(String[] args) {
		
		// ArrayList -> 자료구조, 콜렉션, 동적배열
				// 자동으로 길이가 늘어나는 배열. 추가와 삭제가 가능한 배열.
				
				ArrayList<Integer> list1 = new ArrayList<>();
				ArrayList<String> list2 = new ArrayList<>();
				
				// 1. 사이즈(크기)
			
				System.out.println(list1.size()); 
				System.out.println(list2.size()); 
				
				// 2. 추가
				list1.add(100);
				list1.add(200);
				list1.add(300);
				
				list2.add("사과");
				list2.add("감");
				list2.add("배");
				
				System.out.println("=====================");
				System.out.println(list1.size()); 
				System.out.println(list2.size());
				System.out.println("=====================");
				
				// 3. 수정
				list1.set(0, 1000);
				list2.set(0, "오렌지");
				
				// 4. 조회
				System.out.println(list1.get(0));
				System.out.println(list2.get(0));
				System.out.println("=====================");
				
				// 5. 삭제
				list1.remove(1);
				list2.remove(1);
				
				System.out.println(list1.get(1));
				System.out.println(list2.get(1));
				
				System.out.println("=====================");
				System.out.println(list1.size()); 
				System.out.println(list2.size());
		

	}

}
