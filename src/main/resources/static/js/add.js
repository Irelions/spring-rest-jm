const addUserURL = 'http://localhost:8080/admin/add'

let body = {
    'firstName': 'Andrey',
    'lastName': 'Ivanov',
    'department': 'IT',
    'email': 'admin@mail.ru',
    'username': 'test2',
    'password': 'test2',
    'roles': [
        {
            'id': 1,
            'role': 'ADMIN'
        }
    ]
}

function addNewUser(){
    console.log("~")
    fetch(addUserURL,{
        method: 'POST',
        headers: {"Content-type": "application/json; charset=UTF-8"},
        body: JSON.stringify(body)
    })
}