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
            <th>Name</th>
            <th>Kind Of Outlet</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list outlets as outlet>
            <tr>
                <td>${outlet.id}</td>
                <td>${outlet.name}</td>
                <td>${outlet.kindOfOutlet}</td>
                <td>${outlet.dateOfCreation}</td>
                <td>${outlet.dateOfModified}</td>
                <td>${outlet.description}</td>
                <td><a href="/web/Outlet/delete/${outlet.id}"><button>Delete</button></a></td>
                <td><a href="/web/Outlet/edit/${outlet.id}"><button>Edit</button></a></td>

            </tr>
        </#list>
    </table>
    <a href="/web/Outlet/create"><button>Create</button></a>
</div>

</body>
</html>