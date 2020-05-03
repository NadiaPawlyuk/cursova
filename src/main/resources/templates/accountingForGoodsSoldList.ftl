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
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
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
                <td>${accountingForGoodsSold.offtake}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheDirectoryOfNomenclatureGoods}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithTheSeller}</td>
                <td>${accountingForGoodsSold.externalCommunicationWithCustomerAccounting}</td>
                <td>${accountingForGoodsSold.dateOfCreation}</td>
                <td>${accountingForGoodsSold.dateOfModified}</td>
                <td>${accountingForGoodsSold.description}</td>
                <td><a href="/web/organization/AccountingForGoodsSoldController/delete/${accountingForGoodsSold.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>