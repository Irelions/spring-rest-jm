const allUsersURL = 'http://localhost:8080/allUsers';

fetch(allUsersURL)
    .then(response => response.json())
    .then(result => {
        for (let user of result) {
            let temp = `<tr id="row-${user.id}">
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.department}</td>
                    <td>${user.email}</td>
                    <td>${user.rolesToString}</td>
                    <td>
                        <button class="btn btn-info" type="button" data-toggle="modal" data-target=#userEditID-${user.id}>Edit</button>
                    </td>
                    <td>
                        <button class="btn btn-danger" type="button" data-toggle="modal" data-target=#userDeleteID-${user.id}>Delete</button>
                    </td>
                </tr>`
            $('#mainTableBodyUsers').append(temp)
        }
    })
