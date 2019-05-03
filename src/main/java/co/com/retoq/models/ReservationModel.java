package co.com.retoq.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReservationModel {
	
	private String numNights;
	private String numHotels;
	private String nameHotel;
	private String nigthPrice;
	public List<Integer> lstPrices = new ArrayList<>();
	public List<String> lstHotels = new ArrayList<>();
	
	public ReservationModel() {}
	
	public ReservationModel(Map<String, String> dataReservation) {
		
		this.numNights = dataReservation.get("numNights");
		this.numHotels = dataReservation.get("numHotels");
		this.nameHotel = dataReservation.get("nameHotel");
		this.nigthPrice = dataReservation.get("nigthPrice");
		
	}

	public String getNumNights() {
		return numNights;
	}

	public void setNumNights(String numNights) {
		this.numNights = numNights;
	}

	public String getNumHotels() {
		return numHotels;
	}

	public void setNumHotels(String numHotels) {
		this.numHotels = numHotels;
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

	public List<Integer> getLstPrices() {
		return lstPrices;
	}

	public void setLstPrices(List<Integer> lstPrices) {
		this.lstPrices = lstPrices;
	}

	public List<String> getLstHotels() {
		return lstHotels;
	}

	public void setLstHotels(List<String> lstHotels) {
		this.lstHotels = lstHotels;
	}

	
	
}