const addUserURL = 'http://localhost:8080/admin/add'


let body = {
    firstName: $("#newUserName").val(),
    lastName: 'Ivanov',
    department: 'IT',
    email: 'admin@mail.ru',
    username: 'test2',
    password: 'test2',
    roles: [
        {
            id: 1,
            role: 'ADMIN'
        }
    ]
}

function addNewUser(){
    console.log("addNewUser activated")
    // console.log($('#newUserName').val())
    fetch(addUserURL,{
        method: 'POST',
        body: JSON.stringify(body),
        headers: {'Content-type': 'application/json; charset=UTF-8'}
    })
}