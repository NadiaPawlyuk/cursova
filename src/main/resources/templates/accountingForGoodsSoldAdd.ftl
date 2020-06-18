<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accounting For Goods Sold</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="accountigForGoodsSold" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
    Offtake:<@spring.formInput "accountingForGoodsSoldForm.offtake" "" "text"/>
    <br>
    Name Of Goods:<@spring.formSingleSelect "accountingForGoodsSoldForm.externalCommunicationWithTheDirectoryOfNomenclatureGoods", mavs1, ""/>
    <br>
    Seller:<@spring.formSingleSelect  "accountingForGoodsSoldForm.externalCommunicationWithTheSeller", mavs2, ""/>
    <br>
    Accounting For Buyers:<@spring.formSingleSelect  "accountingForGoodsSoldForm.externalCommunicationWithCustomerAccounting", mavs3, ""/>
    <br>
    Description:<@spring.formInput "accountingForGoodsSoldForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>