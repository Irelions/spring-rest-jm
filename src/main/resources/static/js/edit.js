
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


            // $('#mainTableBodyUser').append(temp)
        })

}
function editUser(){
    const editUserURL = 'http://localhost:8080/admin/add'
    console.log("editUser activated")
    fetch(editUserURL,{
        method: 'PUT',
        body: JSON.stringify(body),
        headers: {'Content-type': 'application/json; charset=UTF-8'}
    })
}