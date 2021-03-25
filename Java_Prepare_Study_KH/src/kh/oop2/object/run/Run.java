package kh.oop2.object.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.oop2.object.model.vo.Phone;
import kh.oop2.object.model.vo.Student;
import kh.oop2.object.model.vo.Teacher;

public class Run {
	// 직렬화, 역직렬화
	public static void main(String[] args) {
		Phone[] ph = { new Phone("삼성", 70), new Phone("LG", 65), new Phone("화웨이", 40) };

		Student[] st = { new Student("학생1", 18, '남', ph[0]), new Student("학생2", 17, '여', ph[1]),
				new Student("학생3", 19, '남', ph[2]), };

		Teacher tc = new Teacher("S", "김용승");

		// Object 단위로 보낼 수 있고 읽어올 때도 Object로 받을 수 있음
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
			
			for (int i = 0; i < st.length; i++) {
				oos.writeObject(st[i]);
			}
			
			oos.writeObject(tc);
			
			for (int i = 0; i < st.length; i++) {
				System.out.println((Student)ois.readObject()); // 이렇게 다운 캐스팅 하는 습관을 들이라고함  코드 이해하기 좋음 (가독성)
			}
			System.out.println(ois.readObject());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
