<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kiosk</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="kiosk" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
     Name of the Kiosk:<@spring.formSingleSelect "kioskForm.nameOfTheKiosk", mavs, ""/>
    <br>
    Number Of Sellers:<@spring.formInput "kioskForm.numberOfSellers" "" "text"/>
    <br>
    Number Of Counters:<@spring.formInput  "kioskForm.numberOfCounters" "" "text"/>
    <br>
    Address:<@spring.formInput  "kioskForm.address" "" "text"/>
    <br>
      The Size Of The Outlet:<@spring.formInput  "kioskForm.theSizeOfTheOutlet" "" "text"/>
    <br>
      Rent:<@spring.formInput  "kioskForm.rent" "" "text"/>
    <br>
      Utilities:<@spring.formInput  "kioskForm.utilities" "" "text"/>
    <br>
      Description:<@spring.formInput  "kioskForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>