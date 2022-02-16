package pages;

public class not {
   /*
    Paralel testing cucumber ve testNG'de yapilabilir. ikisinin de artilari ve eksileri
    var ama bu konuda karar verecek calisacagimiz isyeridir. Biz her iki framework
    icin de paralel calistirma yontemini bilmeliyiz.

            - Cucumber ile paralel testing:
            - Cucumberde coklu calistirma runner class'i ile mumkun oldugundan,
    birden fazla driver'in ayni anda calismasini istiyorsak birden iki seyi
    unutmamaliyi\.
            - Birden fazla runner oldugunda iki seyi unutmamaliyiz
    - Her bir runner'in raporu kaydedecegi dosya isimlerini degistirmek
            - Paralel calisacak runner'lar icin isimlerinde ortak bir metin olmali
    ve bu metin plugin'e islenmeli
            - Pom xml'e 2 +1 olugin ekliyoruz ve pluginlerde opsiyonel olan kisimlari
    kendimize uyarliyoruz
    - Failsafe : testlerimiz fail oldugunda runner'in calismaya devam etmesini
    saglar
    - Surfire : testlerin paralel olarak calismasini saglar
    - Daha fazla bir raporlama icin de bir plugin ekledik
 - Birden fazla runner'i manuel olarak beraber calistiramayiz, terminal'den
 "mvn clean verify" yazarak calistirabiliriz
- TestNg ile paralel calistirma cok daha kolay, bunun icin xml dosyasinda suite
    tag'inin icine paralel=driverlarin is bolusme seviyesi, thread-count=beraber
    calismasini istedigimiz driver sayisi yazmamiz yeterli. Ancak TestNG'de raporlama
    olmadigi icin cok tercih etmeyiz
*/
}
