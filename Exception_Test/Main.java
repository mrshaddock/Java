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
			System.out.println("1-����ͼ��;\n2-����ͼ��;\n");
			System.out.println("��ѡ��");
			cas = InputCommon();
			try{
				switch(cas) {
				case 1:
					System.out.println("������������Ϣ:");
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
	//����ͼ��
	private static void FindBooks() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("��ѡ����ҵķ�ʽ:\n");
		System.out.print(
				"1-����ĳһ����\n"
				+"2-����ĳһ���кŵ���\n"
				+"3-����ĳһ���ߵ���\n"
				+"4-����ĳһ�������\n"
				+"5-��ӡ����б�\n"
				+"0-�˳�\n"
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
					throw new Exception("��������ȷ�����:");
			}
		}catch(Exception e) {
			Exception ee = new Exception();
			throw ee;
		}
	}
	//���������
	private static void FindZl() {
		// TODO Auto-generated method stub
		System.out.println("������һ������:");
		String zl = in.next();
		int flag = 0;
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getZl().equals(zl)){
				Books.get(i).Print();
				flag = 1;
			}
		}
		if( flag == 0) System.out.println("û�и�����");
		else System.out.println("���Ǹ�����ȫ����ͼ��");
	}
	//�����߲���
	private static void FindAut() {
		// TODO Auto-generated method stub
		System.out.println("������һ������:");
		String aut = in.next();
		int flag = 0;
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getAut().equals(aut)){
				Books.get(i).Print();
				flag = 1;
			}
		}
		if( flag == 0) System.out.println("û�и����ߵ�ͼ��");
		else System.out.println("���Ǹ�����ȫ����ͼ��");
	}
	//����Ų���
	private static void FindNum() {
		// TODO Auto-generated method stub
		System.out.println("������һ�����:");
		String num = in.next();
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getNum().equals(num)){
				Books.get(i).Print();
				System.out.println("��Ҫ���ҵ�ͼ��");
				return; 
			}
		}
		System.out.println("û�и�ͼ��");
	}
	//�����ֲ���
	private static void FindName() {
		// TODO Auto-generated method stub
		System.out.println("������һ���������:");
		String name = in.next();
		for(int i = 0; i< Books.size(); ++i)
		{
			if(Books.get(i).getName().equals(name)){
				Books.get(i).Print();
				System.out.println("������Ҫ���ҵ�ͼ��");	
				return;
			}
		}
		System.out.println("û����Ҫ���ҵ�ͼ��");
	}
	//���е�ͼ���б�
	private static void ShowBooks() {
		System.out.println("ͼ���б�");
		for(int i = 0; i < Books.size(); ++i) {
			Books.get(i).Print();
		}
		System.out.println("---------------------------");
	}
	//����ͼ��
	private static void setBooks() throws Exception {
		System.out.println("���Դ���������,���(5λ),����,����:");
		String name = in.next();
		String num = in.next();
		String aut = in.next();
		String zl = in.next();
		try{
			Book_inf a = new Book_inf().inf(name, aut, num, zl);
			Books.add(a);
			
		}catch(Exception e) {
			Exception ee = new Exception("��������ȷ����š�");
			//ee.initCause(e);
			throw ee;
		}
	}
	//��֤����������
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
