<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Department Store</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="departmentStore" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
    Name Of The Department Store:<@spring.formSingleSelect "departmentStoreForm.name", mavs, ""/>
    <br>
    Number Of Sections:<@spring.formInput "departmentStoreForm.numberOfSections" "" "text"/>
    <br>
    Number Of Floors:<@spring.formInput  "departmentStoreForm.numberOfFloors" "" "text"/>
    <br>
    Number Of Halls:<@spring.formInput  "departmentStoreForm.numberOfHalls" "" "text"/>
    <br>
    Number Of Counters:<@spring.formInput "departmentStoreForm.numberOfCounters" "" "text"/>
    <br>
    Address:<@spring.formInput "departmentStoreForm.address" "" "text"/>
    <br>
    The Size Of The Outlet:<@spring.formInput "departmentStoreForm.theSizeOfTheOutlet" "" "text"/>
    <br>
    Rent:<@spring.formInput "departmentStoreForm.rent" "" "text"/>
    <br>
    Utilities:<@spring.formInput "departmentStoreForm.utilities" "" "text"/>
    <br>
    Description:<@spring.formInput "departmentStoreForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>