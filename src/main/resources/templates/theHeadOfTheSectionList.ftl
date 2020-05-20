<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>The Head Of The Section</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Initials</th>
            <th>Date Of Birth</th>
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
        <#list theHeadOfTheSection as theHeadOfTheSection>
            <tr>
                <td>${theHeadOfTheSection.id}</td>
                <td>${theHeadOfTheSection.initials}</td>
                <td>${theHeadOfTheSection.dateOfBirth}</td>
                <td>${theHeadOfTheSection.dateOfHiring}</td>
                <td>${theHeadOfTheSection.numberOfPhone}</td>
                <td>${theHeadOfTheSection.address}</td>
                <td>${theHeadOfTheSection.salary}</td>
                <td>${theHeadOfTheSection.externalCommunicationWithThePlaceOfWork}</td>
                <td>${theHeadOfTheSection.dateOfCreation}</td>
                <td>${theHeadOfTheSection.dateOfModified}</td>
                <td>${theHeadOfTheSection.description}</td>
                <td><a href="/web/TheHeadOfTheSection/delete/${theHeadOfTheSection.id}"><button>Delete</button></a></td>
                <td><a href="/web/TheHeadOfTheSection/edit/${theHeadOfTheSection.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/TheHeadOfTheSection/create"><button>Create</button></a>
</div>

</body>
</html>