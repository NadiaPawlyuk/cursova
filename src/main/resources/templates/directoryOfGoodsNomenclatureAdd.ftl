<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="directoryOfGoodsNomenclature" action="" method="POST">
    DirectoryOfGoodsNomenclature The Name Of The Product:<@spring.formInput "directoryOfGoodsNomenclatureForm.theNameOfTheProduct" "" "text"/>
    <br>
    DirectoryOfGoodsNomenclature Description:<@spring.formInput  "directoryOfGoodsNomenclatureForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>