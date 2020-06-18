<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Section</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="sections" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
     Name Of The Section:<@spring.formInput "sectionForm.nameOfTheSection" "" "text"/>
    <br>
      The Head Of The Section:<@spring.formSingleSelect "sectionForm.externalCommunicationWithTheHeadOfTheSection", mavs1, ""/>
    <br>
     The Floor:<@spring.formInput  "sectionForm.theFloor" "" "text"/>
    <br>
     Outlet:<@spring.formSingleSelect  "sectionForm.externalCommunicationWithDepartmentStore" mavs2, ""/>
    <br>
     Description:<@spring.formInput  "sectionForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"//>
</form>
</body>
</html>