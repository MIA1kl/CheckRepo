# Pharmacy_Catalogue


<img src="https://upload.wikimedia.org/wikipedia/en/0/07/Ala-Too_International_University_Seal.png" width="20%" />

## Author: Natalia Klimareva and Fatima Bekmamatova COM19-A

Pharmacy catalogs are used so that the customer can find out the availability of the desired product and its price without leaving the house. Also, you can register and your medicines, so that other users could see them.

This is the .gif of the website, but also you can visit the site by yourself: [Click here](https://ph-catalogue-cs204.herokuapp.com) to see the project on Heroku

![Alt Text](https://github.com/Fattijenishbek/extra_files/blob/master/ezgif.com-gif-maker.gif)

User page:
![Screenshot from 2021-05-09 20-39-56](https://user-images.githubusercontent.com/57977808/117576245-ff88af00-b106-11eb-8859-49cb86f4075c.png)

If you try to access not existing address, following "Not Found" page appears

![Screenshot from 2021-05-09 20-46-32](https://user-images.githubusercontent.com/57977808/117576413-b5ec9400-b107-11eb-940e-fc65bf709a03.png)
 

## API Description:

* To register a user: **/register**
* To login: **/login**
* To view profile page **/profile**
* To view all products from database: **/**
* To view one separated product from database: **/home-details/{id}**
* To see the page for developer, where you can manipulate with data: **/dev-section**
* To add new product by using POST request: **/dev-section/add**
* To view one separated product from database for developer with opportunity edit and delete: **/dev-section/{id}**
* To edit one separated product by using POST request: **/dev-section/{id}/edit**
* To delete one separated product by using POST request: **/dev-section/{id}/delete**
