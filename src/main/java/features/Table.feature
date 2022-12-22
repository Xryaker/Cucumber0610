@Table
@AllTest
Feature: work with table

  Scenario: colum1
    When print list
      | 55 |
      | 55 |
      | 55 |
      | 55 |

  Scenario: colum2
    When print listTT
      | 4555   | 455    |
      | 4565   | 555    |
      | 4551   | 4555   |
      | 782125 | 555    |
      | 65555  | 545456 |

Scenario: colum3
  When print listTTT
    | Ivan      | kuhbg67 | jghvy76 | Vasiliy | jhgv | yjhv | jhvyjh | kjbjy |
    | Ekaterina | iygu67  | ujygu   | tvjgv   | hjgv | jhgv | utyv   | jhyv  |

