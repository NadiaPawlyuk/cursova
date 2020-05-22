<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Products From Supplier</h3>

<div>
    <fieldset>
        <legend>Find Products From Supplier</legend>
        <form name="search" action="" method="POST">
            Price:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>External Communication With The Nomenclature</th>
            <th>Price</th>
            <th>Number Of Goods</th>
            <th>External Communication With The Supplier</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description<a href="/web/ProductsFromSuppliers/sort"><button>Sort</button></a></th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list productsFromSuppliers as productsFromSupplier>
            <tr>
                <td>${productsFromSupplier.id}</td>
                <td>${productsFromSupplier.externalCommunicationWithTheNomenclature}</td>
                <td>${productsFromSupplier.price}</td>
                <td>${productsFromSupplier.numberOfGoods}</td>
                <td>${productsFromSupplier.externalCommunicationWithTheSupplier}</td>
                <td>${productsFromSupplier.dateOfCreation}</td>
                <td>${productsFromSupplier.dateOfModified}</td>
                <td>${productsFromSupplier.description}</td>
                <td><a href="/web/ProductsFromSuppliers/delete/${productsFromSupplier.id}"><button>Delete</button></a></td>
                <td><a href="/web/ProductsFromSuppliers/edit/${productsFromSupplier.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/ProductsFromSuppliers/create"><button>Create</button></a>
</div>

</body>
</html>