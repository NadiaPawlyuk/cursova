<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Organization Of Trade</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of Organization</th>
            <th>Phone Number</th>
            <th>Address</th>
            <th>Number Of Managers</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list organizationOfTrade as organizationOfTrade>
            <tr>
                <td>${organizationOfTrade.id}</td>
                <td>${organizationOfTrade.nameOfOrganization}</td>
                <td>${organizationOfTrade.phoneNumber}</td>
                <td>${organizationOfTrade.address}</td>
                <td>${organizationOfTrade.numberOfManagers}</td>
                <td>${organizationOfTrade.dateOfCreation}</td>
                <td>${organizationOfTrade.dateOfModified}</td>
                <td>${organizationOfTrade.description}</td>
                <td><a href="/web/organization/OrganizationOfTrade/delete/${organizationOfTrade.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>