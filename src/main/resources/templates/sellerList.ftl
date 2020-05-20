<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Sellers</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Initials</th>
            <th>Date Of Birthday</th>
            <th>Date Of Hiring</th>
            <th>Number Of Phone</th>
            <th>Address</th>
            <th>Salary</th>
            <th>External Communication With The Place Of Work</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list sellers as seller>
            <tr>
                <td>${seller.id}</td>
                <td>${seller.initials}</td>
                <td>${seller.dateOfBirthday}</td>
                <td>${seller.dateOfHiring}</td>
                <td>${seller.numberOfPhone}</td>
                <td>${seller.address}</td>
                <td>${seller.salary}</td>
                <td>${seller.externalCommunicationWithThePlaceOfWork}</td>
                <td>${seller.dateOfCreation}</td>
                <td>${seller.dateOfModified}</td>
                <td>${seller.description}</td>
                <td><a href="/web/Seller/delete/${seller.id}"><button>Delete</button></a></td>
                <td><a href="/web/Seller/edit/${seller.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Seller/create"><button>Create</button></a>
</div>

</body>
</html>