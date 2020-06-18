<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="order" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
    Goods:<@spring.formSingleSelect "orderForm.externalCommunicationWithNomenclature", mavs1, ""/>
    <br>
      Number Of Goods:<@spring.formInput "orderForm.numberOfGoods" "" "text"/>
    <br>
       Supplier:<@spring.formSingleSelect "orderForm.externalCommunicationWithSupplier", mavs2, ""/>
    <br>
     Manager:<@spring.formSingleSelect "orderForm.externalCommunicationWithManagers", mavs3, ""/>
    <br>
      Price:<@spring.formInput  "orderForm.price" "" "text"/>
    <br>
      Description:<@spring.formInput  "orderForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>