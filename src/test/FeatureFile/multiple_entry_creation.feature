Feature: Test to create multiple entry

  Scenario Outline: Create multiple  entry

    Given the user has logged into the hotel management platform
    And the "<Hotel name>" is entered
    And the "<Address>" is entered
    And the "<Owner>" is entered
    And the "<Phone number>" is entered
    And the "<Email>" is entered
    When the create button is clicked
    Then the page is update with the new entry

    Examples:
      | Hotel name | Address        | Owner      | Phone number | Email                |
      | Hilton     | 2 Penge Road   | me         | 07944363848  | me@you.co.uk         |
      | Novotel    | 1 Central Road | John James | 0208665432   | john.james@email.com |