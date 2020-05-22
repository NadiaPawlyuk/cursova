<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Accounting For Goods Sold</h3>

<div>
    <fieldset>
        <legend>Find Goods</legend>
        <form name="search" action="" method="POST">
            Name Of Goods:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of Goods<a href="/web/AccountingForGoodsSold/sort"><button>Sort</button></a></th>
            <th>Offtake</th>
            <th>External Communication With The Directory Of Nomenclature Goods</th>
            <th>External Communication With The Seller</th>
            <th>External Communication With Customer Accounting</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list accountingForGoodsSold as accountingForGoodsSold>
            <tr>
                <td>${accountingForGoodsSold.id}</td>
                <td>${accountingForGoodsSold.nameOfGoods}</td>
                <td>${accountingForGoodsSold.offtake}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheDirectoryOfNomenclatureGoods}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheSeller}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithCustomerAccounting}</td>
                <td>${accountingForGoodsSold.dateOfCreation}</td>
                <td>${accountingForGoodsSold.dateOfModified}</td>
                <td>${accountingForGoodsSold.description}</td>
                <td><a href="/web/AccountingForGoodsSold/delete/${accountingForGoodsSold.id}"><button>Delete</button></a></td>
                <td><a href="/web/AccountingForGoodsSold/edit/${accountingForGoodsSold.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/AccountingForGoodsSold/create"><button>Create</button></a>

</div>

</body>
</html>