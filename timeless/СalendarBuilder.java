package timeless;
import java.time.*;

public class СalendarBuilder {
	private int _firstDay_NumberInWeek; 
	private int _amountOfDaysOfMonth;
	private int _currentDayInMonth; 
	
	СalendarBuilder (CurrentMonth currentMonth){
		// знаходження дня тижня із якого починається місяць
		this._firstDay_NumberInWeek = currentMonth.getMonth().atDay(1).getDayOfWeek().ordinal();
		
		// загальна кількість днів у цьому місяці 
		this._amountOfDaysOfMonth = currentMonth.getMonth().lengthOfMonth();		
		
		// // номер поточного дня місяця або -1
		this._currentDayInMonth = currentDate(currentMonth); 
	}
	public int currentDate(CurrentMonth month){
		YearMonth currentMonth= YearMonth.now();
		if (currentMonth.equals(month.getMonth())){  			// перевірка чи це поточний місяць
			LocalDate currentDay = LocalDate.now();	
			return currentDay.getDayOfMonth();		// повернення номер поточного дня у місяці 
		}		
		else
			return -1;									//якщо не поточний, то повертаємо -1
	}
	public Display outputCalendar(){
		//інтерфейс доступу до обєкта, що виконує виведення інформації щодо календаря
		return new Display(this._firstDay_NumberInWeek,this._amountOfDaysOfMonth, this._currentDayInMonth);
	}
}
