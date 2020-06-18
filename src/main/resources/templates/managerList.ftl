<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Manager</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Manager</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Manager By Initials</legend>
        <form name="search" action="" method="POST">
            <@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input class="btn btn-dark mt-1" type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div class="btn btn-dark">
    <a  href="http://localhost:8080/" style="color: #f8f7cc">Main page</a>
</div>

<a href="/web/Manager/create"><button class="btn btn-dark">Create</button></a>
<div>
    <table border="3", class="table mt-4">
        <tr class="thead-dark">
            <th>Id</th>
            <th>Initials<a href="/web/Manager/sort"><button>Sort</button></a></th>
            <th>Date Of Birthday</th>
            <th>Date Of Hiring</th>
            <th>Number Of Phone</th>
            <th>Address</th>
            <th>Salary</th>
            <th>The Place Of Work</th>
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
                <td>${manager.externalCommunicationWithThePlaceOfWork.nameOfOrganization}</td>
                <td>${manager.description}</td>
                <td><a href="/web/Manager/delete/${manager.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/Manager/edit/${manager.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>