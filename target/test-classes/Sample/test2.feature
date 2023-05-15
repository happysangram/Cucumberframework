Feature: Dry Run

  @Functional
  Scenario: Dry run scenario
    Given A dry run
    When I perform Dry run
    Then result should be updated