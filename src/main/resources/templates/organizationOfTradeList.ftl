<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h3>Organization Of Trade</h3>

<div>
    <fieldset>
        <legend>Find Organization Of Trade</legend>
        <form name="search" action="" method="POST">
            Initials:<@spring.formInput "searchForm.string" "" "text"/>
            <br>
            <input type="submit" value="Search">
        </form>
    </fieldset>
</div>

<div>
    <table border="3", bgcolor="f0f8ff">
        <tr>
            <th>Id</th>
            <th>Name Of Organization<a href="/web/OrganizationOfTrade/sort"><button>Sort</button></a></th>
            <th>Phone Number</th>
            <th>Address</th>
            <th>Number Of Managers</th>
            <th>Date Of Creation</th>
            <th>Date Of Modified</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <#list organizationOfTrade as organizationOfTrade>
            <tr>
                <td>${organizationOfTrade.id}</td>
                <td>${organizationOfTrade.nameOfOrganization}</td>
                <td>${organizationOfTrade.phoneNumber}</td>
                <td>${organizationOfTrade.address}</td>
                <td>${organizationOfTrade.numberOfManagers}</td>
                <td>${organizationOfTrade.dateOfCreation}</td>
                <td>${organizationOfTrade.dateOfModified}</td>
                <td>${organizationOfTrade.description}</td>
                <td><a href="/web/OrganizationOfTrade/delete/${organizationOfTrade.id}"><button>Delete</button></a></td>
                <td><a href="/web/OrganizationOfTrade/edit/${organizationOfTrade.id}"><button>Edit</button></a></td>
            </tr>
        </#list>
    </table>
    <a href="/web/OrganizationOfTrade/create"><button>Create</button></a>
</div>

</body>
</html>