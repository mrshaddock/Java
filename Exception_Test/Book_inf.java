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
		else throw new Exception("请输入正确的图书序号！");
	}
	public void Print() {
		System.out.println("|"
				+"书名：" + Book_name+" | "
				+"作者：" + Book_aut +" | "
				+"序号：" + Book_num +" | "
				+"种类：" + Book_zl +" | "
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
