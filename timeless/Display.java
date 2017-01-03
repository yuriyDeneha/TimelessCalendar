package timeless;

public class Display {
	private int start;  // номер дн€ в тижн≥, ≥з €кого почнетьс€ м≥с€ць
	private int amount;	// к≥льк≥сть дн≥в у м≥с€ц≥
	private int currentDay;	// номер поточного дн€, €кщо такий ≥снуЇ, або -1

	Display(int firstDay_NumberInWeek,int amountOfDaysOfMonth,int currentDayInMonth){
		this.start = firstDay_NumberInWeek;
		this.amount = amountOfDaysOfMonth;
		this.currentDay = currentDayInMonth;
	}
	private void daysNameOfWeek(String...args){ // вив≥д назв дн≥в у табличн≥й форм≥
		for (String arg : args)
			System.out.print(arg+"\t");
	}
	private void daysofMonth(){
		int i=0;
		for (int m =0; i!=-1; m++ )		// цикл проходу по тижн€х м≥с€ц€, допоки не буде м≥тки к≥нц€ м≥с€ц€
		{
			System.out.println();		// в≥зуальний перех≥д на новий тиждень
			for (int n =0; n<7; n++ )	// цикл проходу по конкретному тижн≥
			{
				if (m==0 && n==start) 	// початок в≥дл≥ку дн≥в м≥с€ц€. ѕриклад: в суботу 1 с≥чн€
					i=1;   			
				if (i>0){				// €кщо це - день м≥с€ц€ то вивести його ≥ ≥нкрементувати.
					colorOutput(i,n);
					i++;
				}
				if (i>amount)				// м≥тка к≥нц€ м≥с€ц€
					i=-1;  			 
				System.out.print("\t");	//табул€ц≥€ забезпечуЇ вив≥д у вигл€д≥ таблиц≥
			}	
		}			
	}
	private void colorOutput(int day,int column){
		if (day!=currentDay)
			if (column%2!=0) 	// €кщо колонка непарна вивести ≥ншим кольором, н≥ж парн≥
				System.out.print("\u001b[1;31m" + day+ "\u001b[0m");
			else
				System.out.print("\u001b[1;32m" + day+ "\u001b[0m");
		else					// €кщо поточний день, то вивести жовтим кольором
				System.out.print("\u001b[1;33m" + day+ "\u001b[0m");	
	}
	public void displayCalendar(){		// public-функц≥€ виводу календар€
		daysNameOfWeek("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
		this.daysofMonth();
	}
}
