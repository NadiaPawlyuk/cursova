<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="hall" action="" method="POST">
    Hall Name Of The Hall:<@spring.formInput "hallForm.nameOfTheHall" "" "text"/>
    <br>
    Hall Number Of Sellers:<@spring.formInput "hallForm.numberOfSellers" "" "text"/>
    <br>
    Hall External Communication With Department Store:<@spring.formSingleSelect  "hallForm.externalCommunicationWithDepartmentStore", mavs, ""/>
    <br>
    Hall Description:<@spring.formInput  "hallForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>