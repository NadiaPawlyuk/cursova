<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="accountigForGoodsSold" action="" method="POST">
    Name Of Goods:<@spring.formInput "accountingForGoodsSoldForm.nameOfGoods" "" "text"/>
    <br>
    AccountingForGoodsSold Offtake:<@spring.formInput "accountingForGoodsSoldForm.offtake" "" "text"/>
    <br>
    AccountingForGoodsSold ExternalCommunicationWithTheDirectoryOfNomenclatureGoods:<@spring.formSingleSelect "accountingForGoodsSoldForm.externalCommunicationWithTheDirectoryOfNomenclatureGoods", mavs1, ""/>
    <br>
    AccountingForGoodsSold ExternalCommunicationWithTheSeller:<@spring.formSingleSelect  "accountingForGoodsSoldForm.externalCommunicationWithTheSeller", mavs2, ""/>
    <br>
    AccountingForGoodsSold ExternalCommunicationWithCustomerAccounting:<@spring.formSingleSelect  "accountingForGoodsSoldForm.externalCommunicationWithCustomerAccounting", mavs3, ""/>
    <br>
    AccountingForGoodsSold Description:<@spring.formInput "accountingForGoodsSoldForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>