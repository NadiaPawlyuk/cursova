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
    <fieldset>
        <legend>Find Managers</legend>
        <form name="search" action="" method="POST">
            Initials:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Initials<a href="/web/Manager/sort"><button>Sort</button></a></th>
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
                <td><a href="/web/Manager/delete/${manager.id}"><button>Delete</button></a></td>
                <td><a href="/web/Manager/edit/${manager.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Manager/create"><button>Create</button></a>
</div>

</body>
</html>