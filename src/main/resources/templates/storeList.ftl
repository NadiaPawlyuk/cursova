<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Store</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Store</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Store By Name</legend>
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
<a href="/web/Store/create"><button class="btn btn-dark">Create</button></a>

<div>
    <table border="3", class="table mt-4">
        <tr class="thead-dark">
            <th>Id</th>
            <th>Name Of The Store<a href="/web/Store/sort"><button>Sort</button></a></th>
            <th>Number Of Sellers</th>
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
        <#list stores as store>
            <tr style="background: #f8f7cc">
                <td>${store.id}</td>
                <td>${store.nameOfTheStore.name}</td>
                <td>${store.numberOfSellers}</td>
                <td>${store.numberOfHalls}</td>
                <td>${store.numberOfCounters}</td>
                <td>${store.address}</td>
                <td>${store.theSizeOfTheOutlet}</td>
                <td>${store.rent}</td>
                <td>${store.utilities}</td>
                <td>${store.description}</td>
                <td><a href="/web/Store/delete/${store.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/Store/edit/${store.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>