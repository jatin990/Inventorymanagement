Feature: the account details can be retrieved
  Scenario: client makes call to GET /account/{id}
    When the client calls /account/<id>
    Then the client receives status code of 200
    And the client receives userinfo
    Examples:
		|id|
		|1|
		|2|
	Scenario: user wants to get the item list
    When the client calls /items
    Then the client receives status code of 200
    And the client receives itemlist
    
	Scenario: user wants to get wallet details
    When the client calls /<id>/get-wallet
    Then the client receives status code of 200
    And the client receives walletInfo
    Examples:
		|id|
		|1|
		|2|
	Scenario: user wants to buy an item
		When the user clicks on buy button
		Then the client calls /buy