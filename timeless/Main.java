package timeless;

public class Main {

	public static void main(String[] args) {
		
		CurrentMonth curretMonth = new CurrentMonth(2017,1); 			//задання поточного місяця [рік,місяць]
		СalendarBuilder calendar = new СalendarBuilder(curretMonth);	//побудова календаря
		Display display = calendar.outputCalendar();					//виведення календаря
		display.displayCalendar();
	}
}
