<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="seller" action="" method="POST">
    AccountigForBuyers Initials:<@spring.formInput "sellerForm.initials" "" "text"/>
    <br>
    AccountigForBuyers Date Of Birthday:<@spring.formInput  "sellerForm.dateOfBirthday" "" "text"/>
    <br>
    Seller Date Of Hiring:<@spring.formInput  "sellerForm.dateOfHiring" "" "text"/>
    <br>
    Seller Number Of Phone:<@spring.formInput  "sellerForm.numberOfPhone" "" "text"/>
    <br>
    Seller Address:<@spring.formInput  "sellerForm.address" "" "text"/>
    <br>
    Seller Salary:<@spring.formInput  "sellerForm.salary" "" "text"/>
    <br>
    Seller External Communication With The Place Of Work:<@spring.formSingleSelect  "sellerForm.externalCommunicationWithThePlaceOfWork", mavs, ""/>
    <br>
    Seller Description:<@spring.formInput  "sellerForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
