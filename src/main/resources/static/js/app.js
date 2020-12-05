const requestURL = 'http://localhost:8080/allUsers';

getAllUsers();

function  getAllUsers() {
    return fetch(requestURL)
        .then(response => response.json())
        .then(users => {
            for (let i = 0; i < users.length; i++) {
                $('#mainTableBody')
                console.log(users[i].firstName)
            }
            })

}

// $('#mainTableBody').append('<tr>' +
//     '<td>id</td>\n' +
//     '                                    <td>name</td>\n' +
//     '                                    <td>lastname</td>\n' +
//     '                                    <td>department</td>\n' +
//     '                                    <td>email</td>\n' +
//     '                                    <td>email</td>\n' +
//     '                                    <td>\n' +
//     '                                        <button class="btn btn-info" type="button" data-toggle="modal">\n' +
//     '                                            Edit\n' +
//     '                                        </button>\n' +
//     '                                    <td>\n' +
//     '                                        <button class="btn btn-danger" type="button" data-toggle="modal">\n' +
//     '                                            Delete\n' +
//     '                                        </button>\n' +
//     '                                    </td>\n' +
//     '                                </tr>')


