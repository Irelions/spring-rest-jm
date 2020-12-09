// const addUserURL = 'http://localhost:8080/admin/add'

let body = $('#modalEditView').on('click', () => {
    console.log("body")
    let body = {
        firstName: $("#newUserName").val(),
        lastName: 'Ivanov',
        department: 'IT',
        email: 'admin@mail.ru',
        username: 'test1',
        password: 'test1',
        roles: [
            {
                id: 1,
                role: 'ADMIN'
            }
        ]
    }
    return body
})



function addNewUser(){
    const addUserURL = 'http://localhost:8080/admin/add'
    console.log("addNewUser activated")
    // console.log($('#newUserName').val())
    fetch(addUserURL,{
        method: 'POST',
        body: JSON.stringify(body),
        headers: {'Content-type': 'application/json; charset=UTF-8'}
    })
}