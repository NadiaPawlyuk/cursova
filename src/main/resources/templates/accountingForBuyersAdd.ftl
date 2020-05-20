<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="accountigForBuyers" action="" method="POST">
    AccountigForBuyers Initials:<@spring.formInput "accountingForBuyersForm.initials" "" "text"/>
    <br>
    AccountigForBuyers Number Of Phone:<@spring.formInput "accountingForBuyersForm.numberOfPhone" "" "text"/>
    <br>
    AccountigForBuyers Date Of Birthday:<@spring.formInput  "accountingForBuyersForm.dateOfBirthday" "" "text"/>
    <br>
    AccountigForBuyers Description:<@spring.formInput  "accountingForBuyersForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>