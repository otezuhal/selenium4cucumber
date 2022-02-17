Feature: US1009 Scenario Outline ile editor database sayfasina kayit
@Editor
  Scenario Outline:TC14 kullanici yeni kayit ekleyebilmeli

    When kullanici editor anasayfaya gider
  Then new butonuna basar
  And Firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And startdate olarak "<startDate>" yazar
    And Salary olarak "<salary>" yazar
  And Create tusuna basar
  When kullanici "<firstname>" ile arama yapar
  Then isim bolumunde "<firstname>" oldugunu dogrular
  And sayfayi kapatir


  Examples:
  |firstname|lastname|position|office|extension|startDate|salary|
  |mehmet   |bulutlu |amele   |amsterdam|amele |2021-01-01|200  |
  |Zehra    |Nazli   |tester  |istanbul |PO    |2021-02-12|100000|
