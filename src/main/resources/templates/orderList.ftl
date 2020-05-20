<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Order</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>External Communication With Nomenclature</th>
            <th>Number Of Goods</th>
            <th>External Communication With Supplier</th>
            <th>External Communication With Managers</th>
            <th>Price</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list orders as order>
            <tr>
                <td>${order.id}</td>
                <td>${order.externalCommunicationWithNomenclature}</td>
                <td>${order.numberOfGoods}</td>
                <td>${order.externalCommunicationWithSupplier}</td>
                <td>${order.externalCommunicationWithManagers}</td>
                <td>${order.price}</td>
                <td>${order.dateOfCreation}</td>
                <td>${order.dateOfModified}</td>
                <td>${order.description}</td>
                <td><a href="/web/Order/delete/${order.id}"><button>Delete</button></a></td>
                <td><a href="/web/Order/edit/${order.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Order/create"><button>Create</button></a>
</div>

</body>
</html>