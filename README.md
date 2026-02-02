# StockTracker - Kişisel Borsa Portföy Takip Uygulaması

Bu proje, Spring Boot ve Thymeleaf kullanılarak geliştirilmiş, canlı borsa verilerini takip eden ve portföy kâr/zarar analizi yapan modern bir web uygulamasıdır.

## Özellikler

* **Canlı Veri:** Finnhub API entegrasyonu ile anlık hisse fiyatı takibi.
* **Akıllı Portföy Yönetimi:** Aynı hisse eklendiğinde "Ağırlıklı Ortalama Maliyet" (Weighted Average Cost) hesaplaması.
* **Modern Arayüz:** Glassmorphism tasarımı, Dark Mode ve jQuery Autocomplete ile kullanıcı dostu deneyim.
* **Dinamik Dil Desteği:** Türkçe ve İngilizce (i18n) desteği.
* **Veritabanı:** PostgreSQL ile güvenli veri saklama.

## Teknolojiler

* **Backend:** Java 17, Spring Boot 3, Spring Data JPA
* **Frontend:** Thymeleaf, Bootstrap 5, JavaScript (jQuery), Chart.js
* **Database:** PostgreSQL
* **Tools:** Maven, Lombok

##  Ekran Görüntüleri
<img width="1334" height="1000" alt="img_1" src="https://github.com/user-attachments/assets/a926eec0-72e3-4810-b13b-763b726fbd56" />

<img width="1812" height="827" alt="img_2" src="https://github.com/user-attachments/assets/ce406f0a-504f-45ef-abd4-85a7d097bba4" />

<img width="1752" height="904" alt="img_3" src="https://github.com/user-attachments/assets/91ca2a44-9887-4d56-a6ca-1265357f6ba1" />

<img width="2091" height="1239" alt="img" src="https://github.com/user-attachments/assets/f74e5635-d0d0-46f4-8517-bb6443885751" />

## Kurulum

1.  Repoyu klonlayın.
2.  PostgreSQL'de `stocktracker_db` adında bir veritabanı oluşturun.
3.  `application.properties` dosyasında veritabanı bilgilerinizi girin.
4.  Finnhub'dan aldığınız API Key'i `StockService` içine ekleyin.
5.  `mvn spring-boot:run` ile çalıştırın.
