 # geolocation-conversion-system
Приложение преобразует географические координаты в адрес и адрес в географические координаты с помощью Google Geocoding API.

 ### ***Как это работает:*** 
Адресс (или координаты) прописываются в адресной строке. 
Например: `localhost:8080/geocode?address=Минск, Проспект Дзержинского, 5`
Программа вернет ответ в формате JSON: 
`{"results":[{"geometry":{"location":{"lat":"53.8907938","lng":"27.5258401"}},"formatted_address":"Prospekt Dzerzhinskogo 5, Minsk, Belarus"}]}`
