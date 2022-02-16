Feature: US1006 Negative Login Testi

  Scenario: TC09 yanlis username , dogru sifre ile giris yapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then Login butonuna basar
    And giris yapilamadigini test eder

    Scenario: TC10 dogru username, yanlis sifre ile giriş yapilamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      And kullanici adi olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      And Login butonuna basar
      And giris yapilamadigini test eder