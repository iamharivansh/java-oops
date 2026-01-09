package java_oops;

public class RideBooking {
	String rideId;
	private static int randomnum = 701;
	private String customerName;
	private double fare;

	public RideBooking(String customerName, double fare) {

		this.rideId = "UBER2025" + randomnum++;
		this.customerName = customerName;
		this.fare = fare;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public double getFare() {
		return fare;
	}

	void displayRideDetails() {

		System.out.println("Customer id : " + rideId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Fare Rs. : " + fare +"\n");

	}

	public static void main(String[] args) {

		RideBooking Ritik = new RideBooking("Ritik Sing", 2500);
		Ritik.displayRideDetails();

		RideBooking r = new RideBooking("Shivam Sing", 2500);
		r.displayRideDetails();

	}

}
