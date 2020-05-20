<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Suppliers</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Initials</th>
            <th>Date Of Birthday</th>
            <th>Number Of Phone</th>
            <th>Address</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list suppliers as supplier>
            <tr>
                <td>${supplier.id}</td>
                <td>${supplier.initials}</td>
                <td>${supplier.dateOfBirthday}</td>
                <td>${supplier.numberOfPhone}</td>
                <td>${supplier.address}</td>
                <td>${supplier.dateOfCreation}</td>
                <td>${supplier.dateOfModified}</td>
                <td>${supplier.description}</td>
                <td><a href="/web/Supplier/delete/${supplier.id}"><button>Delete</button></a></td>
                <td><a href="/web/Supplier/edit/${supplier.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Supplier/create"><button>Create</button></a>
</div>

</body>
</html>