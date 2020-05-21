<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Kiosk</h3>

<div>
    <fieldset>
        <legend>Find Kiosks</legend>
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
            <th>ID</th>
            <th>Name of the kiosk<a href="/web/AccountingForBuyers/sort"><button>Sort</button></a></th>
            <th>Number Of Sellers</th>
            <th>Number Of Counters</th>
            <th>Address</th>
            <th>The Size Of The Outlet</th>
            <th>Rent</th>
            <th>Utilities</th>
            <th>dateOfCreation</th>
            <th>dateOfModified</th>
            <th>description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list kiosks as kiosk>
            <tr>
                <td>${kiosk.id}</td>
                <td>${kiosk.nameOfTheKiosk}</td>
                <td>${kiosk.numberOfSellers}</td>
                <td>${kiosk.numberOfCounters}</td>
                <td>${kiosk.address}</td>
                <td>${kiosk.theSizeOfTheOutlet}</td>
                <td>${kiosk.rent}</td>
                <td>${kiosk.utilities}</td>
                <td>${kiosk.dateOfCreation}</td>
                <td>${kiosk.dateOfModified}</td>
                <td>${kiosk.description}</td>
                <td><a href="/web/Kiosk/delete/${kiosk.id}"><button>Delete</button></a></td>
                <td><a href="/web/Kiosk/edit/${kiosk.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Kiosk/create"><button>Create</button></a>
</div>

</body>
</html>