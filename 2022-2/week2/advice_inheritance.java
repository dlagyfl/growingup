import java.io.IOException;

// ������ ���� ��

class Parent {

	int count_subject;
	String pencil;
	String[] book;

	public Parent() {
		count_subject = 2;
		pencil = "monami";
		book = new String[count_subject];
		book[0] = "����";
		book[1] = "����";
	}

	public void printSubject() {
		for (int i = 0; i < count_subject; i++) {
			System.out.print(book[i] + " ");
		}
		System.out.println();
	}

	public void �����ϴ¹��() {
		System.out.println("���� " + pencil + " ��(����) �����մϴ�.");
	}

}

class FirstChild extends Parent {

	public FirstChild() {
		super();
		count_subject = 3;
		pencil = "Sharp";
		book = new String[count_subject];
		book[0] = "����";
		book[1] = "����";
		book[2] = "����";
	}

}

class Me extends Parent {

	public Me() {
		super();
		count_subject = 4;
		pencil = "ZetStream";
		book = new String[count_subject];
		book[0] = "����";
		book[1] = "����";
		book[2] = "����";
		book[3] = "�ڹ�";
	}

	String laptop = "gram";
	String Tablet = "IPad";

	@Override
	public void �����ϴ¹��() {
		System.out.println("����, ����� " + Tablet + " ���� �����մϴ�.");
		System.out.println("������ " + pencil + " ���� �����մϴ�.");
		System.out.println("�ڹٴ� " + laptop + " ���� �����մϴ�.");
	}

	// Overloading
	public void �����ϴ¹��(boolean sleep) {
		if(sleep) {
			System.out.println("���� ����� �������� �ʾƿ�");
		}
	}

}

public class advice_inheritance {

	public static void main(String[] args) throws IOException {

		Parent myMother = new Parent();
		myMother.printSubject();
		myMother.�����ϴ¹��();
		System.out.println();

		FirstChild myBrother = new FirstChild();
		myBrother.printSubject();
		myBrother.�����ϴ¹��();
		System.out.println();

		Me hoyoung = new Me();
		hoyoung.printSubject();
		hoyoung.�����ϴ¹��();
		boolean ���̿Ϳ� = true;
		hoyoung.�����ϴ¹��(���̿Ϳ�);
		System.out.println();
		

	}
}
