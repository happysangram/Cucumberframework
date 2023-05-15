Feature: DatatableConcept
  Scenario: Single Row with No header
    Given the user credential
    |sad|123|

  Scenario: Multiple Row with No header
    Given the user credential with multiple Row
      |sad|123|
      |das|456|


  Scenario: Single Row with header
    Given the user credential with single row single header
      |uname    |password      |
      |Sangram  |7829570002    |


  Scenario: Multiple Row with header
    Given the user credential with Multiple row single header
      |uname    |password      |
      |Sangram  |7829570002    |
      |Soumya   |0000011111    |


  Scenario: Single Column with No header
    Given the user credential with single coulmn with no header
      |sadddddddd|
      |123|

  Scenario: Single Column with header
    Given the user credential with single coulmn with header
      |name|Sangram Das|
      |pass|1234567    |