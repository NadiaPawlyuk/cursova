<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="manager" action="" method="POST">
    Manager Initials:<@spring.formInput "managerForm.initials" "" "text"/>
    <br>
    Manager Date Of Birthday:<@spring.formInput  "managerForm.dateOfBirthday" "" "text"/>
    <br>
    Manager Date Of Hiring:<@spring.formInput "managerForm.dateOfHiring" "" "text"/>
    <br>
    Manager Number Of Phone:<@spring.formInput "managerForm.numberOfPhone" "" "text"/>
    <br>
    Manager Address:<@spring.formInput "managerForm.address" "" "text"/>
    <br>
    Manager Salary:<@spring.formInput "managerForm.salary" "" "text"/>
    <br>
    Manager External Communication With The Place Of Work:<@spring.formSingleSelect "managerForm.externalCommunicationWithThePlaceOfWork", mavs, ""/>
    <br>
    Manager Description:<@spring.formInput "managerForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
