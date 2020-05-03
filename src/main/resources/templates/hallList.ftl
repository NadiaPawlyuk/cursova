<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Hall</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>Name Of The Hall</th>
            <th>Number Of Sellers</th>
            <th>External Communication With Department Store</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list halls as hall>
            <tr>
                <td>${hall.id}</td>
                <td>${hall.nameOfTheHall}</td>
                <td>${hall.numberOfSellers}</td>
                <td>${hall.externalCommunicationWithDepartmentStore}</td>
                <td>${hall.dateOfCreation}</td>
                <td>${hall.dateOfModified}</td>
                <td>${hall.description}</td>
                <td><a href="/web/organization/HallController/delete/${hall.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>