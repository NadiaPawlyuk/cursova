<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Outlet</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>External Communication With The Department Store</th>
            <th>External Communication With The Store</th>
            <th>External Communication With The Kiosk</th>
            <th>Number Of Managers</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list outlets as outlet>
            <tr>
                <td>${outlet.id}</td>
                <td>${outlet.externalCommunicationWithTheDepartmentStore}</td>
                <td>${outlet.externalCommunicationWithTheStore}</td>
                <td>${outlet.externalCommunicationWithTheKiosk}</td>
                <td>${outlet.numberOfManagers}</td>
                <td>${outlet.dateOfCreation}</td>
                <td>${outlet.dateOfModified}</td>
                <td>${outlet.description}</td>
                <td><a href="/web/organization/Outlet/delete/${outlet.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>