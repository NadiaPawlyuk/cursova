<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="distribution" action="" method="POST">
    External Communication With The Nomenclature:<@spring.formSingleSelect "distributionForm.externalCommunicationWithTheNomenclature", mavs1, ""/>
    <br>
    Distribution Number Of Goods:<@spring.formInput "distributionForm.numberOfGoods" "" "text"/>
    <br>
    Distribution Price:<@spring.formInput  "distributionForm.price" "" "text"/>
    <br>
    Distribution External Communication With The Outlet:<@spring.formSingleSelect  "distributionForm.externalCommunicationWithTheOutlet", mavs2, ""/>
    <br>
    Distribution Description:<@spring.formInput  "distributionForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>