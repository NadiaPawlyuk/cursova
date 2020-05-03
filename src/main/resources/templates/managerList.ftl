<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Manager</h3>
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
        <#list managers as manager>
            <tr>
                <td>${manager.id}</td>
                <td>${manager.initials}</td>
                <td>${manager.dateOfBirthday}</td>
                <td>${manager.dateOfHiring}</td>
                <td>${manager.numberOfPhone}</td>
                <td>${manager.address}</td>
                <td>${manager.salary}</td>
                <td>${manager.externalCommunicationWithThePlaceOfWork}</td>
                <td>${manager.dateOfCreation}</td>
                <td>${manager.dateOfModified}</td>
                <td>${manager.description}</td>
                <td><a href="/web/organization/Manager/delete/${manager.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>