<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="supplier" action="" method="POST">
    Supplier Initials:<@spring.formInput "supplierForm.initials" "" "text"/>
    <br>
    Supplier Date Of Birthday:<@spring.formInput  "supplierForm.dateOfBirthday" "" "text"/>
    <br>
    Supplier Number Of Phone:<@spring.formInput "supplierForm.numberOfPhone" "" "text"/>
    <br>
    Supplier Address:<@spring.formInput "supplierForm.address" "" "text"/>
    <br>
    Supplier Description:<@spring.formInput  "supplierForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>