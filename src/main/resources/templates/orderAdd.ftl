<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="order" action="" method="POST">
    Order External Communication With Nomenclature:<@spring.formSingleSelect "orderForm.externalCommunicationWithNomenclature", mavs1, ""/>
    <br>
    Order Number Of Goods:<@spring.formInput "orderForm.numberOfGoods" "" "text"/>
    <br>
    Order External Communication With Supplier:<@spring.formSingleSelect "orderForm.externalCommunicationWithSupplier", mavs2, ""/>
    <br>
    Order External Communication With Managers:<@spring.formSingleSelect "orderForm.externalCommunicationWithManagers", mavs3, ""/>
    <br>
    Order Price:<@spring.formInput  "orderForm.price" "" "text"/>
    <br>
    Order Description:<@spring.formInput  "orderForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>