<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kiosk</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Kiosk</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Kiosks By Name</legend>
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

<a href="/web/Kiosk/create"><button class="btn btn-dark">Create</button></a>
<div>
    <table border="3", class="table mt-4">
        <tr class="thead-dark">
            <th>ID</th>
            <th>Name of the kiosk<a href="/web/Kiosk/sort"><button>Sort</button></a></th>
            <th>Number Of Sellers</th>
            <th>Number Of Counters</th>
            <th>Address</th>
            <th>The Size Of The Outlet</th>
            <th>Rent</th>
            <th>Utilities</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list kiosks as kiosk>
            <tr style="background: #f8f7cc">
                <td>${kiosk.id}</td>
                <td>${kiosk.nameOfTheKiosk.name}</td>
                <td>${kiosk.numberOfSellers}</td>
                <td>${kiosk.numberOfCounters}</td>
                <td>${kiosk.address}</td>
                <td>${kiosk.theSizeOfTheOutlet}</td>
                <td>${kiosk.rent}</td>
                <td>${kiosk.utilities}</td>
                <td>${kiosk.description}</td>
                <td><a href="/web/Kiosk/delete/${kiosk.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/Kiosk/edit/${kiosk.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>