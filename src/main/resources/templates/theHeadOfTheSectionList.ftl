<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>The Head Of The Section</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">The Head Of The Section</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find The Head Of The Section By Initials</legend>
        <form name="search" action="" method="POST">
            <@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input class="btn btn-dark mt-1" type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div class="btn btn-dark">
    <a  href="https://organizationoftrade.herokuapp.com/" style="color: #f8f7cc">Main page</a>
</div>
<a href="/web/TheHeadOfTheSection/create"><button class="btn btn-dark">Create</button></a>

<div>
    <table border="3", class="table mt-4">
        <tr class="thead-dark">
            <th>Id</th>
            <th>Initials<a href="/web/TheHeadOfTheSection/sort"><button>Sort</button></a></th>
            <th>Date Of Birth</th>
            <th>Date Of Hiring</th>
            <th>Number Of Phone</th>
            <th>Address</th>
            <th>Salary</th>
            <th>The Place Of Work</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list theHeadOfTheSection as theHeadOfTheSection>
            <tr style="background: #f8f7cc">
                <td>${theHeadOfTheSection.id}</td>
                <td>${theHeadOfTheSection.initials}</td>
                <td>${theHeadOfTheSection.dateOfBirth}</td>
                <td>${theHeadOfTheSection.dateOfHiring}</td>
                <td>${theHeadOfTheSection.numberOfPhone}</td>
                <td>${theHeadOfTheSection.address}</td>
                <td>${theHeadOfTheSection.salary}</td>
                <td>${theHeadOfTheSection.externalCommunicationWithThePlaceOfWork.name}</td>
                <td>${theHeadOfTheSection.description}</td>
                <td><a href="/web/TheHeadOfTheSection/delete/${theHeadOfTheSection.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/TheHeadOfTheSection/edit/${theHeadOfTheSection.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>