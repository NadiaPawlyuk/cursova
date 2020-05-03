<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Accounting For Buyers</h3>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>Initials</th>
            <th>Number Of Phone</th>
            <th>Date Of Birthday</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list accountingForBuyers as accountingForBuyer>
            <tr>
                <td>${accountingForBuyer.id}</td>
                <td>${accountingForBuyer.initials}</td>
                <td>${accountingForBuyer.numberOfPhone}</td>
                <td>${accountingForBuyer.dateOfBirthday}</td>
                <td>${accountingForBuyer.dateOfCreation}</td>
                <td>${accountingForBuyer.dateOfModified}</td>
                <td>${accountingForBuyer.description}</td>
                <td><a href="/web/organization/AccountingForBuyersController/delete/${accountingForBuyer.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>