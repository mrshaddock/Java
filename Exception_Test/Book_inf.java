package ch1;

import java.util.*;

public class Book_inf {
	String Book_name,Book_aut,Book_num,Book_zl;
	public static Book_inf inf(String name,String aut,String num,String zl) throws Exception{
		Book_inf a = new Book_inf();
		if(num.length() == 5){
			a.Book_name = name;
			a.Book_aut = aut;
			a.Book_num = num;
			a.Book_zl = zl;
			return a;
		}
		else throw new Exception("��������ȷ��ͼ����ţ�");
	}
	public void Print() {
		System.out.println("|"
				+"������" + Book_name+" | "
				+"���ߣ�" + Book_aut +" | "
				+"��ţ�" + Book_num +" | "
				+"���ࣺ" + Book_zl +" | "
			);
	}
	public String getName() {
		return Book_name;
	}
	public String getAut() {
		return Book_aut;
	}
	public String getNum() {
		return Book_num;
	}
	public String getZl() {
		return Book_zl;
	}
}
