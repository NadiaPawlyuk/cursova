<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Order To The Supplier</h3>
<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>The Name Of The Product</th>
            <th>Number Of Goods</th>
            <th>External Communication With Nomenclature</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list orderToTheSupplier as orderToTheSupplier>
            <tr>
                <td>${orderToTheSupplier.id}</td>
                <td>${orderToTheSupplier.theNameOfTheProduct}</td>
                <td>${orderToTheSupplier.numberOfGoods}</td>
                <td>${orderToTheSupplier.externalCommunicationWithNomenclature}</td>
                <td>${orderToTheSupplier.dateOfCreation}</td>
                <td>${orderToTheSupplier.dateOfModified}</td>
                <td>${orderToTheSupplier.description}</td>
                <td><a href="/web/OrderToTheSupplier/delete/${orderToTheSupplier.id}"><button>Delete</button></a></td>
                <td><a href="/web/OrderToTheSupplier/edit/${orderToTheSupplier.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/OrderToTheSupplier/create"><button>Create</button></a>
</div>

</body>
</html>