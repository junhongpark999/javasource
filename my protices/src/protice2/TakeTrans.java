package protice2;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentPark = new Student("Park", 0);

		Bus bus100 = new Bus(100);		//노번 번호가 100번인 버스생성
		studentJames.takeBus(bus100);	//james가 100번 버스를 탐
		studentJames.showInfo(); //james정보출력
		bus100.showInfo();  //버스정보출력
		
		Subway subwayGreren = new Subway("2호선");
		studentTomas.takeSubway(subwayGreren);
		studentTomas.showInfo();
		subwayGreren.showInfo();
		

		studentPark.takeSubway(subwayGreren);
		studentPark.showInfo();
		subwayGreren.showInfo();
	}

}
