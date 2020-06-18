<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accounting For Goods Sold</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body style="width: 100%; height: 100%; background: #bab5bf">
<h3 class="text-center mb-4 pt-3">Accounting For Goods Sold</h3>

<div>
    <fieldset class="text-center" style="color: #262621">
        <legend>Find Goods By Name</legend>
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
<a href="/web/AccountingForGoodsSold/create"><button class="btn btn-dark">Create</button></a>

<div>
    <table class="table mt-4" border="3">
        <tr class="thead-dark">
            <th>Id</th>
            <th>Offtake</th>
            <th>Name Of Goods<a href="/web/AccountingForGoodsSold/sort"><button>Sort</button></a></th>
            <th>Seller</th>
            <th>Accounting For Buyers</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list accountingForGoodsSold as accountingForGoodsSold>
            <tr>
                <td>${accountingForGoodsSold.id}</td>
                <td>${accountingForGoodsSold.offtake}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheDirectoryOfNomenclatureGoods.theNameOfTheProduct}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheSeller.initials}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithCustomerAccounting.initials}</td>
                <td>${accountingForGoodsSold.description}</td>
                <td><a href="/web/AccountingForGoodsSold/delete/${accountingForGoodsSold.id}"><button class="btn btn-dark">Delete</button></a></td>
                <td><a href="/web/AccountingForGoodsSold/edit/${accountingForGoodsSold.id}"><button class="btn btn-dark">Edit</button></a></td>
            </tr>
        </#list>
    </table>

</div>

</body>
</html>