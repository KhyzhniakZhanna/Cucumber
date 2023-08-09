Feature: Empty first run
  Scenario: Sout
    When name
    And surname
    Then age
Scenario: data
  When name "anna"
  And surname "Khyzhniak" and country "Ukraine"
