# 📈 StockTracker - Kişisel Borsa Portföy Takip Uygulaması

Bu proje, Spring Boot ve Thymeleaf kullanılarak geliştirilmiş, canlı borsa verilerini takip eden ve portföy kâr/zarar analizi yapan modern bir web uygulamasıdır.

## 🚀 Özellikler

* **Canlı Veri:** Finnhub API entegrasyonu ile anlık hisse fiyatı takibi.
* **Akıllı Portföy Yönetimi:** Aynı hisse eklendiğinde "Ağırlıklı Ortalama Maliyet" (Weighted Average Cost) hesaplaması.
* **Modern Arayüz:** Glassmorphism tasarımı, Dark Mode ve jQuery Autocomplete ile kullanıcı dostu deneyim.
* **Dinamik Dil Desteği:** Türkçe ve İngilizce (i18n) desteği.
* **Veritabanı:** PostgreSQL ile güvenli veri saklama.

## 🛠️ Teknolojiler

* **Backend:** Java 17, Spring Boot 3, Spring Data JPA
* **Frontend:** Thymeleaf, Bootstrap 5, JavaScript (jQuery), Chart.js
* **Database:** PostgreSQL
* **Tools:** Maven, Lombok

## 📸 Ekran Görüntüleri
<img width="2091" height="1239" alt="img" src="https://github.com/user-attachments/assets/a991b40c-952e-4fb9-ab1c-7282cf402f3d" />

<img width="1334" height="1000" alt="img_1" src="https://github.com/user-attachments/assets/4ae99ea5-86d6-4932-8373-92bbb66e0aec" />
<img width="1812" height="827" alt="img_2" src="https://github.com/user-attachments/assets/9fb3f91d-c28a-4fa3-98b8-60b027a1d62e" />
<img width="1752" height="904" alt="img_3" src="https://github.com/user-attachments/assets/0449e9b9-dbe8-4907-8875-e466bac78417" />


## 📦 Kurulum

1.  Repoyu klonlayın.
2.  PostgreSQL'de `stocktracker_db` adında bir veritabanı oluşturun.
3.  `application.properties` dosyasında veritabanı bilgilerinizi girin.
4.  Finnhub'dan aldığınız API Key'i `StockService` içine ekleyin.
5.  `mvn spring-boot:run` ile çalıştırın.
