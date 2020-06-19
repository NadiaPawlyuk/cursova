<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Section</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Section</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Section By Name</legend>
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

<a href="/web/Section/create"><button class="btn btn-dark">Create</button></a>
<div>
    <table border="3", class="table mt-4">
        <tr class="thead-dark">
            <th>Id</th>
            <th>Name Of The Section<a href="/web/Section/sort"><button>Sort</button></a></th>
            <th>The Head Of The Section</th>
            <th>The Floor</th>
            <th>Outlet</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list sections as section>
            <tr style="background: #f8f7cc">
                <td>${section.id}</td>
                <td>${section.nameOfTheSection}</td>
                <td>${section.externalCommunicationWithTheHeadOfTheSection.initials}</td>
                <td>${section.theFloor}</td>
                <td>${section.externalCommunicationWithDepartmentStore.name}</td>
                <td>${section.description}</td>
                <td><a href="/web/Section/delete/${section.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/Section/edit/${section.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>