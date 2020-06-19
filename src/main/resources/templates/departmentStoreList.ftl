<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Department Store</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Department Store</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Department Store By Name</legend>
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

<a href="/web/DepartmentStore/create"><button class="btn btn-dark">Create</button></a>

<div>
    <table border="3"class="table mt-4">
        <tr class="thead-dark">
            <th>ID</th>
            <th>Name<a href="/web/DepartmentStore/sort"><button>Sort</button></a></th>
            <th>Number Of Sections</th>
            <th>Number Of Floors</th>
            <th>Number Of Halls</th>
            <th>Number Of Counters</th>
            <th>Address</th>
            <th>The Size Of TheOutlet</th>
            <th>Rent</th>
            <th>Utilities</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list departmentStore as departmentStore>
            <tr style="background: #f8f7cc">
                <td>${departmentStore.id}</td>
                <td>${departmentStore.name.name}</td>
                <td>${departmentStore.numberOfSections}</td>
                <td>${departmentStore.numberOfFloors}</td>
                <td>${departmentStore.numberOfHalls}</td>
                <td>${departmentStore.numberOfCounters}</td>
                <td>${departmentStore.address}</td>
                <td>${departmentStore.theSizeOfTheOutlet}</td>
                <td>${departmentStore.rent}</td>
                <td>${departmentStore.utilities}</td>
                <td>${departmentStore.description}</td>
                <td><a href="/web/DepartmentStore/delete/${departmentStore.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/DepartmentStore/edit/${departmentStore.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>