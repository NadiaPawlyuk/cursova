<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="departmentStore" action="" method="POST">
    DepartmentStore Name:<@spring.formSingleSelect "departmentStoreForm.name", mavs, ""/>
    <br>
    DepartmentStore Number Of Sections:<@spring.formInput "departmentStoreForm.numberOfSections" "" "text"/>
    <br>
    DepartmentStore Number Of Floors:<@spring.formInput  "departmentStoreForm.numberOfFloors" "" "text"/>
    <br>
    DepartmentStore Number Of Halls:<@spring.formInput  "departmentStoreForm.numberOfHalls" "" "text"/>
    <br>
    DepartmentStore Number Of Counters:<@spring.formInput "departmentStoreForm.numberOfCounters" "" "text"/>
    <br>
    DepartmentStore Address:<@spring.formInput "departmentStoreForm.address" "" "text"/>
    <br>
    DepartmentStore The Size Of The Outlet:<@spring.formInput "departmentStoreForm.theSizeOfTheOutlet" "" "text"/>
    <br>
    DepartmentStore Rent:<@spring.formInput "departmentStoreForm.rent" "" "text"/>
    <br>
    DepartmentStore Utilities:<@spring.formInput "departmentStoreForm.utilities" "" "text"/>
    <br>
    DepartmentStore Description:<@spring.formInput "departmentStoreForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>