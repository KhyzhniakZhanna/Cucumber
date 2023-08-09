@Run
Feature: certificate
  @RRR
  Scenario Outline:
    When I open certificate page
    And input certificate number "<CERTIFICATE>"
    Then Check certificate status "<EXPECTED>"
    Examples:
      | CERTIFICATE | EXPECTED |
      | 45126       | false    |
      | 45924126    | true     |
      | 78008248    | true     |
      | 4565        | false    |