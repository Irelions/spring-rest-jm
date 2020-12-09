fetch("admin/roles")
    .then(response => response.json())
    .then(result =>{
        for(role of result) {
            let temp = `
            <option value=${role.id}>${role.role}</option>
            `
            $('#editUserRole').append(temp)
            $('#newUserRole').append(temp)
        }
    })