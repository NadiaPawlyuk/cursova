<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="productsInOutlets" action="" method="POST">
    ProductsInOutlets ExternalCommunicationWithTheNomenclature:<@spring.formSingleSelect "productsInOutletsForm.externalCommunicationWithTheNomenclature", mavs1, ""/>
    <br>
    ProductsInOutlets Price:<@spring.formInput "productsInOutletsForm.price" "" "text"/>
    <br>
    ProductsInOutlets Number Of Goods:<@spring.formInput  "productsInOutletsForm.numberOfGoods" "" "text"/>
    <br>
    ProductsInOutlets Outlet:<@spring.formSingleSelect  "productsInOutletsForm.outlet", mavs2, ""/>
    <br>
    ProductsInOutlets Description:<@spring.formInput  "productsInOutletsForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
