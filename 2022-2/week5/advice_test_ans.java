import java.util.*;

public class advice_test_ans {

	public static void main(String[] args) {
		
		/*
		 * �߰����� Ŭ������ �⸻���� Ŭ���� �� �ΰ��� Ŭ������ ����� �ʿ信 ���� �� ���� �˴ϴ�.
		 * �� �ΰ��� Ŭ������ OneSemesterGrade Ŭ������ ��ӹ޽��ϴ�.
		 * 
		 * ���� : �� �л��� �̹��б⿡ 3���� ������ 4��, 2���� ������ 2�� ��´ٰ� �մϴ�. 
		 * 		����, �������̸� = { "�ڷᱸ��" : "ȫ�浿", "��ǻ�����α׷���" : "��ö��", "�˰���" : "ȫ�浿", "��ȸ��" : "������" }
		 * 		����, �������̸� = { "���п���" : "James", "���ʹ�������" : "Ź����" }
		 *		// Getter, Setter �޼ҵ带 ����� �Է��ϼ���.
		 * 		// ������ �޾Ҵ����� �� �޼ҵ��� �Ű������� �޾ƿ� �� �Դϴ�. => �޼ҵ带 ����.
		 * 	 
		 * 
		 * 1. �����б⿡ ���� �� �ִ� ������ ����մϴ�. 
		 *   => ���� �̹��б⿡ 17������ ����ٰ� �Ѵٸ� 40-17�� 23������ ���� �� �ִٰ� �����մϴ�.
		 * 2. ������ �ű�� ����� �����򰡷ν� 95���� ������ A+, 90���� ������ A, 85���� ������ B+ 80���� ������ B, �� ���ϴ� F�� �ݴϴ�. ���⼭ �Ѵ´ٴ� �̻�(>=)�� ���մϴ�
		 * 	 => score_print() �Լ��� ����Ͽ� �����Ѵٰ� ���� ��, A�� ������ ���� 30���Դϴ�. B�� ������ ���� 60���Դϴ�. F�� ������ ����� �Ͻðڽ��ϱ�? �� ����մϴ�. 
		 * 3. ���� A��� ����� �����̾ ���� ����� ���� ������ �ش� �������� ȫ�浿 �л��� ���������� �ȴٰ� �� �� ���������� ����ϴ� �޼ҵ带 ������ּ���.
		 * 4. 17���� �̻� �������, ���� ����� 4.3 �� �Ѵ´ٸ� '���б��� �����մϴ�' ��� ������ ����մϴ�. 
		 *	 => A+ 4.5, A 4.0, B+ 3.5, B 3.0, F 0 �����̶�� �����մϴ�. 
		 */
		
		Scanner sc = new Scanner(System.in);
		// 1��
		OneSemesterGrade original = new OneSemesterGrade();
		original.setCredit(16); // 3 * 4 + 2 * 2
		original.scoreGrade = new double [6];
		
		
		System.out.println(original.max_credit - original.getCredit() + "������ �����б⿡ ���� �� �ֽ��ϴ�.");
		
		// 2��
		ArrayList<String []> study = new ArrayList<>();
		study.add(new String [] {"�ڷᱸ��", "ȫ�浿"});
		study.add(new String [] {"��ǻ�����α׷���", "��ö��"});
		study.add(new String [] {"�˰���", "ȫ�浿"});
		study.add(new String [] {"��ȸ��", "������"});
		study.add(new String [] {"���п���", "James"});
		study.add(new String [] {"���ʹ�������", "Ź����"});
		original.setSubject_professor(study);
		
		Mid mid = new Mid();
		Final final_ = new Final();
		
		double [] mid_score = new double [6];
		for(int i = 0; i < mid_score.length; i++) {			
			System.out.println(original.getSubject_professor().get(i)[0] + "�� �߰���� ������ �Է��ϼ���");
			mid_score[i] = sc.nextInt();
		}
		
		mid.setScore(mid_score);
		
		double [] final_score = new double [6];
		for(int i = 0; i < final_score.length; i++) {			
			System.out.println(original.getSubject_professor().get(i)[0] + "�� �⸻��� ������ �Է��ϼ���");
			final_score[i] = sc.nextInt();
		}
		
		final_.setScore(final_score);
		
		original.sumScore(mid_score, final_score);	
		// 3��
		original.printGrade();
		
		// 4��
		original.���бݿ���();
	}

}



class OneSemesterGrade {
	
	final int max_credit = 40; // �ϳ⿡ ���� �� �ִ� ������ �� 40���Դϴ�.
	
	private int credit; // �̹��б⿡ ��� ����	
	
	// case 1 
	private ArrayList<String []> subject_professor; // ������, ������ 
	
	// case 2
	// String [] professor_name ; // ������ ������ �̸�
	// String [] subject; // ������ �̸�
	
	private double [] score ; // ������ ���� ���� // �ε����� ���� ���� ��
	
	double [] scoreGrade;
	
	public OneSemesterGrade () {
		credit = 0;
		subject_professor = null;
		score = new double [6];
		scoreGrade= null;
	}

	// Getter, Setter
	
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public ArrayList<String[]> getSubject_professor() {
		return subject_professor;
	}

	public void setSubject_professor(ArrayList<String[]> subject_professor) {
		this.subject_professor = subject_professor;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}	
	
	public void sumScore(double [] mid, double [] final_) {
		for(int i = 0; i < 6; i ++) {
			this.score[i] = mid[i] + final_[i] / 2;
		}
	}
	
	public void printGrade() {
		
		for(int i = 0; i < 6 ; i ++) {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getSubject_professor().get(i)[0] + "�� ����� ");
			if (this.score[i] >= 95) {
				sb.append("A+ �Դϴ�.");
				scoreGrade[i] = 4.5;
			}
			else if (this.score[i] >= 90) {
				sb.append("A �Դϴ�.");
				scoreGrade[i] = 4.0;
			}
			else if (this.score[i] >= 85) {
				sb.append("B+ �Դϴ�.");
				scoreGrade[i] = 3.5;
			}
			else if (this.score[i] >= 80) {
				sb.append("B �Դϴ�.");
				scoreGrade[i] = 3.0;
			}
			else {
				sb.append("F �Դϴ�");
				scoreGrade[i] = 0;
			}
			
			System.out.println(sb.toString());
		}
	}
	
	public void ���бݿ��� () {
		if(this.credit >= 17) {
			double sum = 0;
			for(int i = 0; i < 6; i++) {
				sum += this.scoreGrade[i];
			}
			if(sum / 6 >= 4.3 ) {
				System.out.println("���б� ���� ����Դϴ�.");
			}
			else {
				System.out.println("���б� ���� ����� �ƴմϴ�.");
			}
		}
		else {
			System.out.println("���б� ���� ����� �ƴմϴ�.");
		}
	}
}

class Mid extends OneSemesterGrade {	
		
	
}

class Final extends OneSemesterGrade {
	
	
}
