package ch1;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Book_inf> Books = new ArrayList<Book_inf>();
	public static void  main(String[]args) {
		
		int cas;
		while(true){
			System.out.println("1-加入图书;\n2-查找图书;\n");
			System.out.println("请选择：");
			cas = InputCommon();
			try{
				switch(cas) {
				case 1:
					System.out.println("请输入以下信息:");
					System.out.println();
					setBooks();
					break;
				case 2:
					FindBooks();
					break;
				default :
					throw new Exception("1111111");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			System.out.println("-------------------------------");
		}
	}
	//查找图书
	private static void FindBooks() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("请选择查找的方式:\n");
		System.out.print(
				"1-查找某一本书\n"
				+"2-查找某一序列号的书\n"
				+"3-查找某一作者的书\n"
				+"4-查找某一种类的书\n"
				+"5-打印库存列表\n"
				+"0-退出\n"
		);
		int cas = InputCommon();
		try{
			switch(cas){
				case 1:
					FindName();
					break;
				case 2:
					FindNum();
					break;
				case 3:
					FindAut();
					break;
				case 4:
					FindZl();
					break;
				case 5:
					ShowBooks();
					break;
				case 0:
					break;
				case -1:
					throw new Exception("请输入正确的序号:");
			}
		}catch(Exception e) {
			Exception ee = new Exception();
			throw ee;
		}
	}
	//按种类查找
	private static void FindZl() {
		// TODO Auto-generated method stub
		System.out.println("请输入一个种类:");
		String zl = in.next();
		int flag = 0;
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getZl().equals(zl)){
				Books.get(i).Print();
				flag = 1;
			}
		}
		if( flag == 0) System.out.println("没有该种类");
		else System.out.println("这是该种类全部的图书");
	}
	//按作者查找
	private static void FindAut() {
		// TODO Auto-generated method stub
		System.out.println("请输入一个作者:");
		String aut = in.next();
		int flag = 0;
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getAut().equals(aut)){
				Books.get(i).Print();
				flag = 1;
			}
		}
		if( flag == 0) System.out.println("没有该作者的图书");
		else System.out.println("这是该作者全部的图书");
	}
	//按序号查找
	private static void FindNum() {
		// TODO Auto-generated method stub
		System.out.println("请输入一个序号:");
		String num = in.next();
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getNum().equals(num)){
				Books.get(i).Print();
				System.out.println("您要查找的图书");
				return; 
			}
		}
		System.out.println("没有该图书");
	}
	//按名字查找
	private static void FindName() {
		// TODO Auto-generated method stub
		System.out.println("请输入一本书的名字:");
		String name = in.next();
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getName().equals(name)){
				Books.get(i).Print();
				System.out.println("这是您要查找的图书");	
				return;
			}
		}
		System.out.println("没有您要查找的图书");
	}
	//所有的图书列表
	private static void ShowBooks() {
		System.out.println("图书列表");
		for(int i = 0; i < Books.size(); ++i) {
			Books.get(i).Print();
		}
		System.out.println("---------------------------");
	}
	//保存图书
	private static void setBooks() throws Exception {
		System.out.println("请以此输入书名,序号(5位),作者,种类:");
		String name = in.next();
		String num = in.next();
		String aut = in.next();
		String zl = in.next();
		try{
			Book_inf a = new Book_inf().inf(name, aut, num, zl);
			Books.add(a);
			
		}catch(Exception e) {
			Exception ee = new Exception("请输入正确的序号。");
			//ee.initCause(e);
			throw ee;
		}
	}
	//保证整数的输入
	private static int InputCommon() {
		int input;
		try{
			input = in.nextInt();
			return input;
		}catch(Exception e) {
			return -1;
		}
	}
}
