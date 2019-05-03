#Author: your.email@your.domain.com

Feature: reservation portal of DX Hotel
  A person must be able to enter the reservation site to find and select the cheapest destination that he finds

  Scenario Outline: Select the cheapest hotel of a selected location
  
    Given that valentina wants reserve a hotel in <location>, she selects to the dates  <check-in> and <check-out>
    When valentina search the hotel more economical
    Then she selects the most economical option <totalPay>  
    
    Examples:
    	|location		|check-in	|check-out|totalPay|
			|"New York"|"5/05/2019"|"5/10/2019"|"29" |