<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="orderToTheSupplier" action="" method="POST">
    OrderToTheSupplier The Name Of The Product:<@spring.formInput "orderToTheSupplierForm.theNameOfTheProduct" "" "text"/>
    <br>
    OrderToTheSupplier Number Of Goods:<@spring.formInput "orderToTheSupplierForm.numberOfGoods" "" "text"/>
    <br>
    OrderToTheSupplier External Communication With Nomenclature:<@spring.formSingleSelect  "orderToTheSupplierForm.externalCommunicationWithNomenclature", mavs, ""/>
    <br>
    OrderToTheSupplier Description:<@spring.formInput  "orderToTheSupplierForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
