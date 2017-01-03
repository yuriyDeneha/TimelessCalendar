package timeless;
import java.time.*;


public class CurrentMonth {
	private YearMonth _currentMonth=null;
	public CurrentMonth(int year, int month){
		
		if (month>0 && month<13 && year>0)
			_currentMonth= YearMonth.of(year,month); //беремо м≥с€ць по вх≥дних параметрах
		else
			_currentMonth= YearMonth.now();			 //беремо поточний м≥с€ць
	}
	public YearMonth getMonth(){
		return _currentMonth;		
	}
}
