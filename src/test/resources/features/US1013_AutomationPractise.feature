Feature: US1013 Invalid email testi

  Scenario: TC18 Invalid email ile giris yapilamaz

  Given  user sign in linkine tiklar
  Then email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
  Then error mesajinin “Invalid email address”  oldugunu dogrulayin