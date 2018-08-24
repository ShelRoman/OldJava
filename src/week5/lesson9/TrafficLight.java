//Task 5. Написать класс Светофор TrafficLight с перечислением EnumTrafColor.
// TrafficLight и EnumTrafColor реализуют отношения делегирования.
// В классе MainTrafficLight создаем объект класса Светофор и с помощью цикла for (например 10 раз) вызываем метод 
// переключения цвета в светофоре.
// Между каждым перечислением(в main) вставляем код замирания на секунду(пол секунды)
//  try {
//   Thread.sleep(500);
//	svetofor.switch1
//  } catch (Exception e) {
//   e.printStackTrace();
//  }
// Подумать о том, чтобы в перечислении был метод например getNextColor, который переключает светофор на следующий цвет.
// Последовательность цветов у светофора:ж,з,ж,к,ж,з,ж,к,ж,з,ж,к
//package week5.lesson9;
////
//public class TrafficLight {
//	EnumTrafColor prevColor;
//	EnumTrafColor currentColor;
//	
//	
//	enum EnumTrafColor {
//		Red, Yellow, Green;
//		
//		public EnumTrafColor getNextColor() {
//			TrafficLight.prevColor;
//			if (this == EnumTrafColor.valueOf());
//			return prevColor;
//		}
//	}
//
//	public void switch1() {
//		if (this.currentColor == null) {
//			this.currentColor = EnumTrafColor.Yellow;
//		} else {
//			this.currentColor = EnumTrafColor.getNextColor();
//		}
//	}
//	
//	
//
//}
//
//
//
//import java.util.ArrayList;
//
//public enum EnumTrafColor {
// Yellow, Red, Green;
//
// static ArrayList<EnumTrafColor> trafficLight = new ArrayList<EnumTrafColor>();
//
// static int active = 0;
// static int preActive = 1;
// 
// public static void getNextColor1() {
//  if (active == 0 && preActive == 1) {
//   active = 1;
//   preActive = 0;
//  } else if (active == 1 && preActive == 0) {
//   active = 2;
//   preActive = 1;
//  } else if (active == 2 && preActive == 1) {
//   active = 1;
//   preActive = 2;
//  } else if (active == 1 && preActive == 2) {
//   active = 0;
//   preActive = 1;
//  }
// }
//
//}
//
//public class TrafficLight {
// 
// public TrafficLight() {
//
//  EnumTrafColor.trafficLight.add(EnumTrafColor.Red);
//  EnumTrafColor.trafficLight.add(EnumTrafColor.Yellow);
//  EnumTrafColor.trafficLight.add(EnumTrafColor.Green);
// }
//
// public void activeLight() {
//  System.out.println(EnumTrafColor.trafficLight.get(EnumTrafColor.active).toString());
// }
//
///*
// * Task 5. Написать класс Светофор TrafficLight с перечислением EnumTrafColor.
// TrafficLight и EnumTrafColor реализуют отношения делегирования.
// В классе MainTrafficLight создаем объект класса Светофор и с помощью цикла for (например 10 раз) вызываем метод 
// переключения цвета в светофоре.
// Между каждым перечислением(в main) вставляем код замирания на секунду(пол секунды)
// try {
// Thread.sleep(500);
// светофор.переключись
// } catch (Exception e) {
// e.printStackTrace();
// }
// Подумать о том, чтобы в перечислении был метод например getNextColor, который переключает светофор на следующий цвет.
// Последовательность цветов у светофора:ж,з,ж,к,ж,з,ж,к,ж,з,ж,к
// */
//
//public class MainTrafficLight {
//
// public static void main(String[] args) {
//  TrafficLight myTrafficLight = new TrafficLight();
//  for (int i = 0; i < 10; i++) {
//   try {
//    Thread.sleep(1000);
//    EnumTrafColor.getNextColor1();
//    myTrafficLight.activeLight();
//    
//
//   } catch (Exception e) {
//    e.printStackTrace();
//   }
//  }
//
// }
//
//}
