<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Stores</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of The Store</th>
            <th>Number Of Sellers</th>
            <th>Number Of Halls</th>
            <th>Number Of Counters</th>
            <th>Address</th>
            <th>The Size Of TheOutlet</th>
            <th>Rent</th>
            <th>Utilities</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list stores as store>
            <tr>
                <td>${store.id}</td>
                <td>${store.nameOfTheStore}</td>
                <td>${store.numberOfSellers}</td>
                <td>${store.numberOfHalls}</td>
                <td>${store.numberOfCounters}</td>
                <td>${store.address}</td>
                <td>${store.theSizeOfTheOutlet}</td>
                <td>${store.rent}</td>
                <td>${store.utilities}</td>
                <td>${store.dateOfCreation}</td>
                <td>${store.dateOfModified}</td>
                <td>${store.description}</td>
                <td><a href="/web/organization/Store/delete/${store.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>