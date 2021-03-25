package kh.oop2.filter.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filter {

	public void consoleInOut() {

	}

	public void buf() {

	}

	public void data() {
//		FileOutputStream fout = null;
//		FileInputStream fin = null;
//		DataOutputStream dout = null;
//		DataInputStream din = null;

//		try {
//			fout = new FileOutputStream("member.txt"); // 기반 스트림
//			fin = new FileInputStream("member.txt");
//
//			dout = new DataOutputStream(fout); // 보조 스트림
//			din = new DataInputStream(fin);
//		} catch (IOException e) {
//
//		} finally {
//			try {
//				fout.close();
//				fin.close();
//				dout.close();
//				din.close();
//			} catch (IOException e2) {
//
//			}
//		}

		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"));
				DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {

			// 파일에 자료형별로 기록
			// 이렇게 써야(자료형의 크기를 지정해서) 불러올 때 편함 (바이트 계산할 필요 없음)
			dout.writeUTF("홍길동"); // 문자열을 쓸 땐 UTF
			dout.writeChar('남');
			dout.writeInt(32);

			dout.writeUTF("유관순");
			dout.writeChar('여');
			dout.writeInt(21);

			dout.writeUTF("장보고");
			dout.writeChar('남');
			dout.writeInt(27);

			while (true) {
				System.out.println(din.readUTF() + ", " + din.readChar() + ", " + din.readInt());

				// data로 읽어오면 EOFException이 뜸 EOF때 이거 처리해줘야함
			}

		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void bufData() {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		DataInputStream din = null;

		try {
			fin = new FileInputStream("member.txt");
			bin = new BufferedInputStream(fin);
			din = new DataInputStream(bin);

			System.out.println(din.readUTF());

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reWri() {
		// FileReader 자체가 기반 스트림 따라서 파일명 적어주면됨
		// FileReader 내에서 FileInputStream 호출함
//		BufferedReader br = new BufferedReader(new FileReader("exam.txt"));

		// FileReader를 기반 스트림처럼 쓰자
//		File file = new File("exam.txt");
//		// FileReader 문자 단위로 읽어옴 char 단위로
//		try (FileReader fr = new FileReader(file)) {
//			int check = 0;
//			while ((check = fr.read()) != -1) {
//				System.out.print((char) check);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없습니다.");
//		} catch (IOException e) {
//			System.out.println(e);
//		}

		// 보조스트림 (BufferedWriter, BufferedReader)을 달고 쓰기
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("fileReWri.txt"));
				BufferedReader br = new BufferedReader(new FileReader("fileReWri.txt"))) {

//			bw.write("첫째줄\n둘째줄\n셋째줄");

			bw.write("첫째줄");
			bw.newLine();
			bw.write("둘째줄");
			bw.newLine();
			bw.write("셋째줄");
			bw.newLine();

			bw.flush(); // close 전이므로 flush를 안해주면 버퍼에 쌓여있는 상태

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
