<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>The Head Of The Section</title>
</head>
<body style="margin: 0; padding: 0; height: 100%; width: 100%; background: #bab5bf; color: #262621">
<form name="theHeadOfTheSection" action="" method="POST" style="width: 700px; height: 500px; line-height: 2; margin-left: 15px; margin-top: 8px">
     Initials:<@spring.formInput "theHeadOfTheSectionForm.initials" "" "text"/>
    <br>
     Date Of Birth:<@spring.formInput  "theHeadOfTheSectionForm.dateOfBirth" "" "text"/>
    <br>
     Date Of Hiring:<@spring.formInput  "theHeadOfTheSectionForm.dateOfHiring" "" "text"/>
    <br>
     Number Of Phone:<@spring.formInput "theHeadOfTheSectionForm.numberOfPhone" "" "text"/>
    <br>
     Address:<@spring.formInput  "theHeadOfTheSectionForm.address" "" "text"/>
    <br>
     Salary:<@spring.formInput  "theHeadOfTheSectionForm.salary" "" "text"/>
    <br>
     The Place Of Work:<@spring.formSingleSelect  "theHeadOfTheSectionForm.externalCommunicationWithThePlaceOfWork", mavs, ""/>
    <br>
     Description:<@spring.formInput  "theHeadOfTheSectionForm.description" "" "text"/>
    <br>
    <input type="submit" value="Continue" style="width: 70px; height: 28px; background: #262621; color: #f8f7cc; border-top-left-radius: 20px; border-bottom-left-radius: 20px; border-top-right-radius: 20px; border-bottom-right-radius: 20px"/>
</form>
</body>
</html>
