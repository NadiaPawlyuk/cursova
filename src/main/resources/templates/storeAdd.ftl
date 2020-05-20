<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="store" action="" method="POST">
    Store Name Of The Store:<@spring.formSingleSelect "storeForm.nameOfTheStore", mavs, ""/>
    <br>
    Store Number Of Sellers:<@spring.formInput "storeForm.numberOfSellers" "" "text"/>
    <br>
    Store Number Of Halls:<@spring.formInput "storeForm.numberOfHalls" "" "text"/>
    <br>
    Store Number Of Counters:<@spring.formInput "storeForm.numberOfCounters" "" "text"/>
    <br>
    Store Address:<@spring.formInput "storeForm.address" "" "text"/>
    <br>
    Store The Size Of TheOutlet:<@spring.formInput "storeForm.theSizeOfTheOutlet" "" "text"/>
    <br>
    Store Rent:<@spring.formInput "storeForm.rent" "" "text"/>
    <br>
    Store Utilities:<@spring.formInput "storeForm.utilities" "" "text"/>
    <br>
    Store Description:<@spring.formInput "storeForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
