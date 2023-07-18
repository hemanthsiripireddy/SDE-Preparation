package designPattern;

public class BuilderDesignPatternImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car.CarBuilder("MRF", "round steering", "120cc", "4 seater").setSpeakers("bost").build();
		System.out.println(car);
		

	}

}
 class Car{
	 //mandatory fields
	 private String tyre;
	 private String steering;
	 private String engine;
	 private String seat;
	 
	 // optional fields
	 private String speakers;
	 private boolean hasAC;
	 private boolean hasSeatCover;
	 public Car(CarBuilder carBuilder) {
		 this.tyre=carBuilder.tyre;
		 this.engine=carBuilder.engine;
		 this.steering=carBuilder.steering;
		 this.seat=carBuilder.seat;
		 this.speakers=carBuilder.speakers;
		 this.hasAC=carBuilder.hasAC;
		 this.hasSeatCover=carBuilder.hasSeatCover;
				 
	 }
	 
	 
	 @Override
	public String toString() {
		return "Car [tyre=" + tyre + ", steering=" + steering + ", engine=" + engine + ", seat=" + seat + ", speakers="
				+ speakers + ", hasAC=" + hasAC + ", hasSeatCover=" + hasSeatCover + "]";
	}


	public static class CarBuilder{
		 
		//mandatory fields
		 private String tyre;
		 private String steering;
		 private String engine;
		 private String seat;
		 
		 // optional fields
		 private String speakers;
		 private boolean hasAC;
		 private boolean hasSeatCover;
		public CarBuilder(String tyre, String steering, String engine, String seat) {
			super();
			this.tyre = tyre;
			this.steering = steering;
			this.engine = engine;
			this.seat = seat;
		}
		 
		public CarBuilder setSpeakers(String speakers) {
			this.speakers=speakers;
			return this;
			
		}
		public CarBuilder setAC(boolean hasAC) {
			this.hasAC=hasAC;
			return this;
		}
		public CarBuilder setSeatCover(boolean hasSeatCover) {
			this.hasSeatCover=hasSeatCover;
			return this;
		}
		/*
		 * define and provide build method
		 */
		public Car build() {
			return new Car(this);
		}
		 
	 }
	
}
