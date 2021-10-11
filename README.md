 # geolocation-conversion-system
The application converts geographic coordinates to address and address to geographic coordinates using Google Geocoding API.

 ### *** Как это работает: *** 
Адресс (или координаты) прописываются в адресной строке. Например: `localhost:8080/geocode?address=Минск, Проспект Дзержинского, 5`
Программа преобразует введенные данные в url адресс и вернет ответ в виде JSON-файла: 
`{"results":[{"geometry":{"location":{"lat":"53.8907938","lng":"27.5258401"}},"formatted_address":"Prospekt Dzerzhinskogo 5, Minsk, Belarus"}]}`
