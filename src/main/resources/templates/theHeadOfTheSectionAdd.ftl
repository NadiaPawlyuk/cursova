<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="theHeadOfTheSection" action="" method="POST">
    TheHeadOfTheSection Initials:<@spring.formInput "theHeadOfTheSectionForm.initials" "" "text"/>
    <br>
    TheHeadOfTheSection Date Of Birth:<@spring.formInput  "theHeadOfTheSectionForm.dateOfBirth" "" "text"/>
    <br>
    TheHeadOfTheSection Date Of Hiring:<@spring.formInput  "theHeadOfTheSectionForm.dateOfHiring" "" "text"/>
    <br>
    TheHeadOfTheSection Number Of Phone:<@spring.formInput "theHeadOfTheSectionForm.numberOfPhone" "" "text"/>
    <br>
    TheHeadOfTheSection Address:<@spring.formInput  "theHeadOfTheSectionForm.address" "" "text"/>
    <br>
    TheHeadOfTheSection Salary:<@spring.formInput  "theHeadOfTheSectionForm.salary" "" "text"/>
    <br>
    TheHeadOfTheSection External Communication With The Place Of Work:<@spring.formSingleSelect  "theHeadOfTheSectionForm.externalCommunicationWithThePlaceOfWork", mavs, ""/>
    <br>
    TheHeadOfTheSection Description:<@spring.formInput  "theHeadOfTheSectionForm.description" "" "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
