package timeless;
import java.time.*;

public class �alendarBuilder {
	private int _firstDay_NumberInWeek; 
	private int _amountOfDaysOfMonth;
	private int _currentDayInMonth; 
	
	�alendarBuilder (CurrentMonth currentMonth){
		// ����������� ��� ����� �� ����� ���������� �����
		this._firstDay_NumberInWeek = currentMonth.getMonth().atDay(1).getDayOfWeek().ordinal();
		
		// �������� ������� ��� � ����� ����� 
		this._amountOfDaysOfMonth = currentMonth.getMonth().lengthOfMonth();		
		
		// // ����� ��������� ��� ����� ��� -1
		this._currentDayInMonth = currentDate(currentMonth); 
	}
	public int currentDate(CurrentMonth month){
		YearMonth currentMonth= YearMonth.now();
		if (currentMonth.equals(month.getMonth())){  			// �������� �� �� �������� �����
			LocalDate currentDay = LocalDate.now();	
			return currentDay.getDayOfMonth();		// ���������� ����� ��������� ��� � ����� 
		}		
		else
			return -1;									//���� �� ��������, �� ��������� -1
	}
	public Display outputCalendar(){
		//��������� ������� �� �����, �� ������ ��������� ���������� ���� ���������
		return new Display(this._firstDay_NumberInWeek,this._amountOfDaysOfMonth, this._currentDayInMonth);
	}
}
