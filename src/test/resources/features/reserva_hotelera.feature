#Author: your.email@your.domain.com

Feature: reservation portal of DX Hotel
  A person must be able to enter the reservation site to find and select the cheapest destination that he finds

  Scenario Outline: Select the cheapest hotel of a selected location
  
    Given that valentina wants reserve a hotel in <location>, she selects to the dates  <check-in> and <check-out>
    When valentina search the hotel more economical
    Then she selects the most economical option <totalPay>  
    
    Examples:
    	|location	 |check-in	 |check-out	 |totalPay|
    	|"Hamburg"|"5/10/2019"|"5/15/2019"|1194	|
    	|"London"|"5/10/2019"|"5/15/2019"|660	|
  #  	|"Paris"|"5/10/2019"|"5/15/2019"|"660"	|
	#		|"New York"|"5/10/2019"|"5/15/2019"|"666"	|
	#		|"Los Angeles"|"5/10/2019"|"5/15/2019"|"654" 		|
	#  	|"San Francisco"|"5/10/2019"|"5/15/2019"|"666"	|
	#		|"Las Vegas"|"5/10/2019"|"5/15/2019"|"174"|
	#		|"Honolulu"|"5/10/2019"|"5/15/2019"|"594"	|
	#		|"Nassau"|"5/10/2019"|"5/15/2019"|"59"	|
	#		|"Rome"|"5/10/2019"|"5/15/2019"|"774"	|