<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Section</h3>

<div>
    <fieldset>
        <legend>Find Section</legend>
        <form name="search" action="" method="POST">
            Name Of The Section:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of The Section<a href="/web/Section/sort"><button>Sort</button></a></th>
            <th>External Communication With The Head Of The Section</th>
            <th>The Floor</th>
            <th>External Communication With Department Store</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list sections as section>
            <tr>
                <td>${section.id}</td>
                <td>${section.nameOfTheSection}</td>
                <td>${section.externalCommunicationWithTheHeadOfTheSection.initials}</td>
                <td>${section.theFloor}</td>
                <td>${section.externalCommunicationWithDepartmentStore.name}</td>
                <td>${section.dateOfCreation}</td>
                <td>${section.dateOfModified}</td>
                <td>${section.description}</td>
                <td><a href="/web/Section/delete/${section.id}"><button>Delete</button></a></td>
                <td><a href="/web/Section/edit/${section.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/Section/create"><button>Create</button></a>
</div>

</body>
</html>