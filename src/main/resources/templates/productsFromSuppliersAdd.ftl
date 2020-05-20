<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="productsFromSuppliers" action="" method="POST">
    ProductsFromSuppliers External Communication With The Nomenclature:<@spring.formSingleSelect "productsFromSuppliersForm.externalCommunicationWithTheNomenclature", mavs1, ""/>
    <br>
    ProductsFromSuppliers Price:<@spring.formInput "productsFromSuppliersForm.price" "" "text"/>
    <br>
    ProductsFromSuppliers Number Of Goods:<@spring.formInput  "productsFromSuppliersForm.numberOfGoods" "" "text"/>
    <br>
    ProductsFromSuppliers External Communication With The Supplier:<@spring.formSingleSelect  "productsFromSuppliersForm.externalCommunicationWithTheSupplier", mavs2, ""/>
    <br>
    ProductsFromSuppliers Description:<@spring.formInput  "productsFromSuppliersForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
