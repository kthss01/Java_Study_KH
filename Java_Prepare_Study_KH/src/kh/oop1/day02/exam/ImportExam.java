package kh.oop1.day02.exam;

import java.util.Arrays;
import java.util.Random;

public class ImportExam {
	// java.lang
	public double piExam() {
		double b = Math.PI;
		return b;
	}

	// java.util Random class
	public int randomExam(int ran) {
		Random r = new Random();
		int i = r.nextInt(ran);
		return i;
	}

	// java.util Arrays class sort 메소드
	public String sortExam() {
		int[] arr = { 1, 8, 3, 2, 6, 7, 0 };
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
}
