<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Directory Of Goods Nomenclature</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>ID</th>
            <th>The Name Of The Product</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list directoryOfGoodsNomenclature as directoryOfGoodsNomenclature>
            <tr>
                <td>${directoryOfGoodsNomenclature.id}</td>
                <td>${directoryOfGoodsNomenclature.theNameOfTheProduct}</td>
                <td>${directoryOfGoodsNomenclature.dateOfCreation}</td>
                <td>${directoryOfGoodsNomenclature.dateOfModified}</td>
                <td>${directoryOfGoodsNomenclature.description}</td>
                <td><a href="/web/DirectoryOfGoodsNomenclature/delete/${directoryOfGoodsNomenclature.id}"><button>Delete</button></a></td>
                <td><a href="/web/DirectoryOfGoodsNomenclature/edit/${directoryOfGoodsNomenclature.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/DirectoryOfGoodsNomenclature/create"><button>Create</button></a>

</div>

</body>
</html>