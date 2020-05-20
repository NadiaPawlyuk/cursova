<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="organizationOfTrade" action="" method="POST">
    OrganizationOfTrade Name Of Organization:<@spring.formInput "organizationOfTradeForm.nameOfOrganization" "" "text"/>
    <br>
    OrganizationOfTrade Number Of Phone:<@spring.formInput "organizationOfTradeForm.phoneNumber" "" "text"/>
    <br>
    OrganizationOfTrade Address:<@spring.formInput  "organizationOfTradeForm.address" "" "text"/>
    <br>
    OrganizationOfTrade Number Of Managers:<@spring.formInput  "organizationOfTradeForm.numberOfManagers" "" "text"/>
    <br>
    OrganizationOfTrade Description:<@spring.formInput  "organizationOfTradeForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
