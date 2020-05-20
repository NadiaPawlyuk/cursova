<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="kiosk" action="" method="POST">
    Kiosk Name of the kiosk:<@spring.formSingleSelect "kioskForm.nameOfTheKiosk", mavs, ""/>
    <br>
    Kiosk Number Of Sellers:<@spring.formInput "kioskForm.numberOfSellers" "" "text"/>
    <br>
    Kiosk Number Of Counters:<@spring.formInput  "kioskForm.numberOfCounters" "" "text"/>
    <br>
    Kiosk Address:<@spring.formInput  "kioskForm.address" "" "text"/>
    <br>
    Kiosk The Size Of The Outlet:<@spring.formInput  "kioskForm.theSizeOfTheOutlet" "" "text"/>
    <br>
    Kiosk Rent:<@spring.formInput  "kioskForm.rent" "" "text"/>
    <br>
    Kiosk Utilities:<@spring.formInput  "kioskForm.utilities" "" "text"/>
    <br>
    Kiosk Description:<@spring.formInput  "kioskForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>