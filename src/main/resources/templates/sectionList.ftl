<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Section</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of The Section</th>
            <th>External Communication With The Head Of The Section</th>
            <th>The Floor</th>
            <th>External Communication With Department Store</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list sections as section>
            <tr>
                <td>${section.id}</td>
                <td>${section.nameOfTheSection}</td>
                <td>${section.externalCommunicationWithTheHeadOfTheSection}</td>
                <td>${section.theFloor}</td>
                <td>${section.externalCommunicationWithDepartmentStore}</td>
                <td>${section.dateOfCreation}</td>
                <td>${section.dateOfModified}</td>
                <td>${section.description}</td>
                <td><a href="/web/organization/Section/delete/${section.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>