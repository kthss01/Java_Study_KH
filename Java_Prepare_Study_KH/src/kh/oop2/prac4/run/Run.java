package kh.oop2.prac4.run;

import kh.oop2.prac4.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member[] m = {
				new Member("김선후", 17, '남', 'B'), 
//				new Member("홍미라", 23, '여', 'O'), 
//				new Member("홍미라", 23, '여', 'O'), 
//				new Member("홍미라", 23, '여', 'O'),
				new Member("장수인", 20, '여', 'A'), 
//				new Member("장수인", 20, '여', 'A'), 
//				new Member("장수인", 20, '여', 'A'), 
//				new Member("장수인", 20, '여', 'A'), 
				new Member("김가람", 27, '남', 'B'), 
//				new Member("김가람", 27, '남', 'B'), 
				new Member("박수연", 25, '여', 'O') };

		// 기존 알고리즘에서는 똑같은 성별과 혈액형이 2가지 인 경우
		/*
		 * ex) 여,O 여,O 여,O 여,O
		 * 
		 * 인 경우 1가지로 인식하는 문제 발생 -> 정답은 2가지임
		 */

		/*
		 * Member[] tempM = new Member[10]; for (int i = 0; i < tempM.length; i++) { //
		 * 객체 배열을 기본 생성자로 초기화된 객체로 채움 (NullPointException을 피하기 위해) tempM[i] = new
		 * Member(); }
		 * 
		 * int tempIndex = 0; for (int i = 0; i < m.length; i++) { // 기준이 되는 인원을 바꿀 for문
		 * for (int j = i + 1; j < m.length; j++) { // 나머지 인원과 비교하기 위한 for문
		 * 
		 * if (m[i].equals(m[j])) { int k; for (k = 0; k < tempM.length; k++) { // tempM
		 * 객체 배열을 for문으로 확인 if (m[j].equals(tempM[k])) break; }
		 * 
		 * if (k == tempM.length) { tempM[tempIndex++] = m[j]; } } } }
		 * 
		 * System.out.println("성별과 혈액형이 일치하는 인원이 있는 경우는 총 " + tempIndex + "가지");
		 */

		int result = 0;
		boolean[] check = new boolean[m.length];

		for (int i = 0; i < m.length; i++) {
			// 이미 비교하여 같은 거면 무시
			if (check[i]) 
				continue;
			
			for (int j = i + 1; j < check.length; j++) {
				// 이미 비교해서 같은 걸로 판명 난 경우 무시
				if (check[j])
					continue;

				if (m[i].equals(m[j])) {
					check[i] = check[j] = true;
					result++;
					break;
				}
			}
		}
		
		System.out.println("성별과 혈액형 일치하는 경우 : " + result + "가지");
	}

}
