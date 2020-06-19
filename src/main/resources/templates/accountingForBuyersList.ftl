<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accounting For Buyers</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3  class="text-center mb-4 pt-3">Accounting For Buyers</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Buyers By Initials</legend>
        <form name="search" action="" method="POST">
            <@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input class="btn btn-dark mt-1" type="submit"  value="Search">
        </form>
    </fieldset>
</div>
<div class="btn btn-dark">
    <a  href="http://localhost:8080/" style="color: #f8f7cc">Main page</a>
</div>
<a href="/web/AccountingForBuyers/create"><button class="btn btn-dark">Create</button></a>

<div>
    <table class="table mt-4" border="3">
        <thead class="thead-dark">
            <th>ID</th>
            <th>Initials <a href="/web/AccountingForBuyers/sort"><button  style="background: #f0f8ff">Sort</button></a></th>
            <th>Number Of Phone</th>
            <th>Date Of Birthday</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </thead>
        <#list accountingForBuyers as accountingForBuyer>
            <tr style="background: #f8f7cc">
                <td style="background: #f8f7cc">${accountingForBuyer.id}</td>
                <td style="background: #f8f7cc">${accountingForBuyer.initials}</td>
                <td style="background: #f8f7cc">${accountingForBuyer.numberOfPhone}</td>
                <td style="background: #f8f7cc">${accountingForBuyer.dateOfBirthday}</td>
                <td style="background: #f8f7cc">${accountingForBuyer.description}</td>
                <td style="background: #f8f7cc"><a href="/web/AccountingForBuyers/delete/${accountingForBuyer.id}"><button class="btn btn-dark" >Delete</button></a></td>
                <td style="background: #f8f7cc"><a href="/web/AccountingForBuyers/edit/${accountingForBuyer.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>

</div>

</body>
</html>