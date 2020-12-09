function func(userId){
    console.log(userId)
const userByIdURL = `http://localhost:8080/user/${userId}`

    fetch(userByIdURL)
        .then(response => response.json())
        .then(user => {
            $('#userIdEdit').attr('value', `${user.id}`)
            $('#userNameEdit').attr('value', `${user.firstName}`)
            $('#userLastnameEdit').attr('value', `${user.lastName}`)
            $('#userDepartmentEdit').attr('value', `${user.department}`)
            $('#userEmailEdit').attr('value', `${user.email}`)
            $('#userLoginEdit').attr('value', `${user.username}`)
            $('#userPasswordEdit').attr('value', `${user.password}`)
            $('#editUserRole').attr('value', `${user.rolesToString}`)
            $('#btnEdit').attr('onclick', `editUser()`)
        })
}
function editUser(){
    const editUserURL = 'http://localhost:8080/admin/add'
    $('#editUserRole').attr('value', [])
    console.log("editUser activated")
    fetch(editUserURL,{
        method: 'PUT',
        body: JSON.stringify({
            id: $('#userIdEdit').val(),
            firstName: $('#userNameEdit').val(),
            lastName: $('#userLastnameEdit').val(),
            department: $('#userDepartmentEdit').val(),
            email: $('#userEmailEdit').val(),
            username: $('#userLoginEdit').val(),
            password: $('#userPasswordEdit').val(),
            roles: [
                {
                    id: parseInt($('#editUserRole').val()[0])
                }
            ]
        }),
        headers: {'Content-type': 'application/json; charset=UTF-8'},

    })
}