<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="sections" action="" method="POST">
    Section Name Of The Section:<@spring.formInput "sectionForm.nameOfTheSection" "" "text"/>
    <br>
    Section External Communication With The Head Of The Section:<@spring.formSingleSelect "sectionForm.externalCommunicationWithTheHeadOfTheSection", mavs1, ""/>
    <br>
    Section The Floor:<@spring.formInput  "sectionForm.theFloor" "" "text"/>
    <br>
    Section External Communication With Department Store:<@spring.formSingleSelect  "sectionForm.externalCommunicationWithDepartmentStore" mavs2, ""/>
    <br>
    Section Description:<@spring.formInput  "sectionForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>