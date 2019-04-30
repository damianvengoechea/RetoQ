package co.com.retoq.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReservationModel {
	
	private String location;
	private String checkIn;
	private String checkOut;
	private String totalToPay;
	private String nameHotel;
	private String nigthPrice;
	private List<ReservationModel> lstReservation = new ArrayList<>();
	
	public ReservationModel() {}
	
	public ReservationModel(Map<String, String> dataReservation) {
		
		this.location = dataReservation.get("Location");
		this.checkIn = dataReservation.get("checkin");
		this.checkOut = dataReservation.get("check out");
		this.totalToPay = dataReservation.get("total pay");
		this.nameHotel = dataReservation.get("name");
		this.nigthPrice = dataReservation.get("price");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getTotalToPay() {
		return totalToPay;
	}

	public void setTotalToPay(String totalToPay) {
		this.totalToPay = totalToPay;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public String getNigthPrice() {
		return nigthPrice;
	}

	public void setNigthPrice(String nigthPrice) {
		this.nigthPrice = nigthPrice;
	}

	public List<ReservationModel> getLstReservation() {
		return lstReservation;
	}

	public void setLstReservation(List<ReservationModel> lstReservation) {
		this.lstReservation = lstReservation;
	}

}