package timeless;

public class Display {
	private int start;  // ����� ��� � ����, �� ����� ��������� �����
	private int amount;	// ������� ��� � �����
	private int currentDay;	// ����� ��������� ���, ���� ����� ����, ��� -1

	Display(int firstDay_NumberInWeek,int amountOfDaysOfMonth,int currentDayInMonth){
		this.start = firstDay_NumberInWeek;
		this.amount = amountOfDaysOfMonth;
		this.currentDay = currentDayInMonth;
	}
	private void daysNameOfWeek(String...args){ // ���� ���� ��� � �������� ����
		for (String arg : args)
			System.out.print(arg+"\t");
	}
	private void daysofMonth(){
		int i=0;
		for (int m =0; i!=-1; m++ )		// ���� ������� �� ������ �����, ������ �� ���� ���� ���� �����
		{
			System.out.println();		// ��������� ������� �� ����� �������
			for (int n =0; n<7; n++ )	// ���� ������� �� ����������� ����
			{
				if (m==0 && n==start) 	// ������� ����� ��� �����. �������: � ������ 1 ����
					i=1;   			
				if (i>0){				// ���� �� - ���� ����� �� ������� ���� � ��������������.
					colorOutput(i,n);
					i++;
				}
				if (i>amount)				// ���� ���� �����
					i=-1;  			 
				System.out.print("\t");	//��������� ��������� ���� � ������ �������
			}	
		}			
	}
	private void colorOutput(int day,int column){
		if (day!=currentDay)
			if (column%2!=0) 	// ���� ������� ������� ������� ����� ��������, �� ����
				System.out.print("\u001b[1;31m" + day+ "\u001b[0m");
			else
				System.out.print("\u001b[1;32m" + day+ "\u001b[0m");
		else					// ���� �������� ����, �� ������� ������ ��������
				System.out.print("\u001b[1;33m" + day+ "\u001b[0m");	
	}
	public void displayCalendar(){		// public-������� ������ ���������
		daysNameOfWeek("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
		this.daysofMonth();
	}
}
