<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Stores</h3>

<div>
    <fieldset>
        <legend>Find Store</legend>
        <form name="search" action="" method="POST">
            Name Of The Store:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of The Store<a href="/web/Store/sort"><button>Sort</button></a></th>
            <th>Number Of Sellers</th>
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
        <#list stores as store>
            <tr>
                <td>${store.id}</td>
                <td>${store.nameOfTheStore.name}</td>
                <td>${store.numberOfSellers}</td>
                <td>${store.numberOfHalls}</td>
                <td>${store.numberOfCounters}</td>
                <td>${store.address}</td>
                <td>${store.theSizeOfTheOutlet}</td>
                <td>${store.rent}</td>
                <td>${store.utilities}</td>
                <td>${store.dateOfCreation}</td>
                <td>${store.dateOfModified}</td>
                <td>${store.description}</td>
                <td><a href="/web/Store/delete/${store.id}"><button>Delete</button></a></td>
                <td><a href="/web/Store/edit/${store.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Store/create"><button>Create</button></a>
</div>

</body>
</html>