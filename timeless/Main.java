package timeless;

public class Main {

	public static void main(String[] args) {
		
		CurrentMonth curretMonth = new CurrentMonth(2017,1); 			//������� ��������� ����� [��,�����]
		�alendarBuilder calendar = new �alendarBuilder(curretMonth);	//�������� ���������
		Display display = calendar.outputCalendar();					//��������� ���������
		display.displayCalendar();
	}
}
