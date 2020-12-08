const allUsersURL = 'http://localhost:8080/allUsers'

showAllUsers()

function showAllUsers() {
    console.log("showAllUsers activated")
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
                        <button class="btn btn-info" onclick=func(${user.id}) type="button" data-toggle="modal" data-target=#modalEditView>Edit</button>
                    </td>
                    <td>
                        <button class="btn btn-danger" onclick=showDeleteUser(${user.id}) type="button" data-toggle="modal" data-target=#modalDeleteView>Delete</button>
                    </td>
                </tr>`
                $('#mainTableBodyUsers').append(temp)
            }
        })
}
