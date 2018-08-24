package week4.lesson8;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Notepad {
	ArrayList<Data> datas = new ArrayList<>();

	public class Data {
		GregorianCalendar date;
		ArrayList<String> list = new ArrayList<>();

		public Data(GregorianCalendar date, String string) {
			this.date = date;
			list.add(string);
			datas.add(this);
		}
	}

	public void add(GregorianCalendar date1, String string) {
		if (datas.size() > 0) {
			for (int i = 0; i < datas.size(); i++) {
				if (datas.get(i).date.equals(date1)) {
					datas.get(i).list.add(string);
				} else {
					new Data(date1, string);
					break;
				}
			}
		} else {
			new Data(date1, string);
		}
	}

	public void printByDate(GregorianCalendar date1) {
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).date.equals(date1)) {
				for (int j = 0; j < datas.get(i).list.size(); j++) {
					System.out.println(datas.get(i).list.get(j));
				}
			}
		}
	}

}
