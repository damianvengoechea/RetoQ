#Author: your.email@your.domain.com

Feature: reservation portal of DX Hotel
  A person must be able to enter the reservation site to find and select the cheapest destination that he finds

  Scenario Outline: Select the cheapest hotel of a selected location
    Given that valentina wants reserve a hotel in <location> but the more economic
    When she select to the dates  <check-in> and <check-out>
    Then she selects the most economical option <totalPay>  
    
    Examples:
    	|location		|check-in	|check-out|totalPay|
			|"Las Vegas"|5/21/2019|5/26/2019|		29	 		|