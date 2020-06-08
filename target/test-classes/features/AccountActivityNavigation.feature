
Feature:    Navigating	to	specific	accounts	in	Accounts	Activity

  Scenario Outline:    Savings	account	redirect <dropdown>
    Given    the	user	is	logged	in
    When the	user	clicks	on	"<dropDown>" link	on	the	Account	Summary	page
    Then the	"Zero - Account Activity" page	should	be	displayed
    And Account	drop	down	should	have	"<dropDown>"	selected
    Examples:
      | dropDown    |
      | Savings     |
      | Brokerage   |
      | CheckingA   |
      | Credit Card |
      | Loan        |