<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="outlet" action="" method="POST">
    Name:<@spring.formInput "outletForm.name" "" "text"/>
    <br>
    Kind Of Outlet:<@spring.formInput "outletForm.kindOfOutlet" "" "text"/>
    <br>
    Outlet Description:<@spring.formInput  "outletForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>