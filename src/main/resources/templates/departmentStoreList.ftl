<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Department Store</h3>

<div>
    <fieldset>
        <legend>Find Department Store</legend>
        <form name="search" action="" method="POST">
            Name Of The Department Store:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>Name Of The Department Store<a href="/web/DepartmentStore/sort"><button>Sort</button></a></th>
            <th>Name</th>
            <th>Number Of Sections</th>
            <th>Number Of Floors</th>
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
        <#list departmentStore as departmentStore>
            <tr>
                <td>${departmentStore.id}</td>
                <td>${departmentStore.nameOfTheStore}</td>
                <td>${departmentStore.name.name}</td>
                <td>${departmentStore.numberOfSections}</td>
                <td>${departmentStore.numberOfFloors}</td>
                <td>${departmentStore.numberOfHalls}</td>
                <td>${departmentStore.numberOfCounters}</td>
                <td>${departmentStore.address}</td>
                <td>${departmentStore.theSizeOfTheOutlet}</td>
                <td>${departmentStore.rent}</td>
                <td>${departmentStore.utilities}</td>
                <td>${departmentStore.dateOfCreation}</td>
                <td>${departmentStore.dateOfModified}</td>
                <td>${departmentStore.description}</td>
                <td><a href="/web/DepartmentStore/delete/${departmentStore.id}"><button>Delete</button></a></td>
                <td><a href="/web/DepartmentStore/edit/${departmentStore.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/DepartmentStore/create"><button>Create</button></a>

</div>

</body>
</html>