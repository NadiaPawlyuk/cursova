<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Store</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="store" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
     Name Of The Store:<@spring.formSingleSelect "storeForm.nameOfTheStore", mavs, ""/>
    <br>
     Number Of Sellers:<@spring.formInput "storeForm.numberOfSellers" "" "text"/>
    <br>
     Number Of Halls:<@spring.formInput "storeForm.numberOfHalls" "" "text"/>
    <br>
     Number Of Counters:<@spring.formInput "storeForm.numberOfCounters" "" "text"/>
    <br>
     Address:<@spring.formInput "storeForm.address" "" "text"/>
    <br>
     The Size Of TheOutlet:<@spring.formInput "storeForm.theSizeOfTheOutlet" "" "text"/>
    <br>
     Rent:<@spring.formInput "storeForm.rent" "" "text"/>
    <br>
     Utilities:<@spring.formInput "storeForm.utilities" "" "text"/>
    <br>
     Description:<@spring.formInput "storeForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>
