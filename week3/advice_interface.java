public class advice_interface {

	public static void main(String[] args) {
	
		Department_of_information information = new Department_of_information();
		
		Department_of_Computer computer = new Department_of_Computer();
	}

}



class Department_of_information implements interface_example{

	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 50;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "���� �л��� �������ϴ�.");			
		}
		else {
			System.out.println("��� �հ��Ͽ����ϴ�.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 140;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"�ڷᱸ��", "��ȣ�׽ý���", "���������", "��ǻ�ͳ�Ʈ��ũ"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" �ʼ� ���� �� ������ " + subject + "�Դϴ�.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"�ؿ�����", "��MT" } ;
		for (String event : department_event ) {
			System.out.println(" �츮 �� ��ȸ�� " + event + "�Դϴ�.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"ȫ�浿", "��ö��", "�ڿ���" } ;
		for (String professor : department_professor ) {
			System.out.println(" �츮 �� ��ȸ�� " + professor + "�Դϴ�.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" �츮 �� ��ȸ�� " + session + "�Դϴ�.");
		}
	}

}

class Department_of_Computer implements interface_example{


	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 100;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "���� �л��� �������ϴ�.");			
		}
		else {
			System.out.println("��� �հ��Ͽ����ϴ�.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 150;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"�ڷᱸ��", "�����Ϸ�������", "������", "�ڿ���ó��"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" �ʼ� ���� �� ������ " + subject + "�Դϴ�.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"�ؿ�����", "��MT" } ;
		for (String event : department_event ) {
			System.out.println(" �츮 �� �������� " + event + "�Դϴ�.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"����ö", "��ö��", "�ܱ��α�����" } ;
		for (String professor : department_professor ) {
			System.out.println(" �츮 �� �������� " + professor + "�Դϴ�.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" �츮 �� ��ȸ�� " + session + "�Դϴ�.");
		}
	}

}
