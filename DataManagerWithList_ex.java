package example6;


import java.util.ArrayList;
import java.util.Scanner;

public class DataManagerWithList_ex {

		
		static Scanner sc = new Scanner(System.in);
		static ArrayList<String> datas = new ArrayList<>();
		
		public static void main(String[] args) {

			//String[] datas = new String[10]; // null 값이 없음을 의미		

			while (true) {

				System.out.print("명령어를 입력해주세요 : ");
				int menu = Integer.parseInt(sc.nextLine());

				if (menu == 1) {
					add();

				} else if (menu == 2) {
					printDatas();

				} else if (menu == 3) {
					update();

				} else if (menu == 4) {
					delete();

				} else if (menu == 5) {
					System.out.println("프로그램을 종료합니다.");
					break;
					
				} else if (menu == 0) {
					printHelp();
				}
			}
		}

		private static void add() {
			System.out.print("저장할 값을 입력해주세요 : ");
			String data = sc.nextLine();
			datas.add(data);
			System.out.println(data + "이/가 저장되었습니다.");
		}

		public static void printDatas() {
			System.out.println("현재 저장되어 있는 값 : ");
			System.out.println("=============");
			for (int i = 0; i < datas.size(); i++) {
				System.out.println((i + 1) + ". " + datas.get(i));
			}
			System.out.println("=============");

		}
		
		private static void update() {
			printDatas();

			System.out.println("몇번 데이터를 수정하시겠습니까 : ");
			int target = Integer.parseInt(sc.nextLine());
			System.out.println("어떤 값으로 수정하시겠습니까 : ");
			String newData = sc.nextLine();

			datas.set(target, newData);
			System.out.println(newData + "으로 수정되었습니다.");
		}

		private static void delete() {
			printDatas();
			System.out.println("몇번 데이터를 삭제하시겠습니까 : ");
			int target = Integer.parseInt(sc.nextLine());
			datas.remove(target);
		}

		private static void printHelp() {
			System.out.println("1. 데이터 저장");
			System.out.println("2. 데이터 조회");
			System.out.println("3. 데이터 수정");
			System.out.println("4. 데이터 삭제");
			System.out.println("5. 종료");
	}

}
