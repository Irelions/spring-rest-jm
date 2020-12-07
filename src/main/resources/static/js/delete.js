function deleteUser(userId){
    const userByIdURL = `http://localhost:8080/admin/delete/${userId}`

    fetch(userByIdURL,{
        method: 'DELETE'
    })

    showAllUsers()
}