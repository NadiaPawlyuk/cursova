<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Products In Outlets</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>externalCommunicationWithTheNomenclature</th>
            <th>price</th>
            <th>Number Of Goods</th>
            <th>externalCommunicationWithTheSupplier</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list productsInOutlets as productsInOutlets>
            <tr>
                <td>${productsInOutlets.id}</td>
                <td>${productsInOutlets.externalCommunicationWithTheNomenclature}</td>
                <td>${productsInOutlets.price}</td>
                <td>${productsInOutlets.numberOfGoods}</td>
                <td>${productsInOutlets.externalCommunicationWithTheSupplier}</td>
                <td>${productsInOutlets.dateOfCreation}</td>
                <td>${productsInOutlets.dateOfModified}</td>
                <td>${productsInOutlets.description}</td>
                <td><a href="/web/organization/ProductsInOutlets/delete/${productsInOutlets.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>