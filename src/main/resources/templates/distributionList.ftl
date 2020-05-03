<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Distribution</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>External Communication With The Nomenclature</th>
            <th>Number Of Goods</th>
            <th>Price</th>
            <th>External Communication With The Outlet</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list distributions as distribution>
            <tr>
                <td>${distribution.id}</td>
                <td>${distribution.externalCommunicationWithTheNomenclature}</td>
                <td>${distribution.numberOfGoods}</td>
                <td>${distribution.price}</td>
                <td>${distribution.externalCommunicationWithTheOutlet}</td>
                <td>${distribution.dateOfCreation}</td>
                <td>${distribution.dateOfModified}</td>
                <td>${distribution.description}</td>
                <td><a href="/web/organization/DistributionController/delete/${distribution.id}"><button>Delete</button></a></td>
                <td><button>Edit</button></td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>