Feature: US1008 scenario outline kullanrak farkli değerlerle negative login testi
  Scenario Outline: TC13 farkli kullanici adi ve password
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then scenario outline'dan "<username>" yazar
    And scenario outline'dan "<password>"







    Examples: