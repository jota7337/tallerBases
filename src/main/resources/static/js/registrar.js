// Call the dataTables jQuery plugin
$(document).ready(function() {

});

async function registrarUsuarios() {
let datos = {};
datos.nombre =document.getElementById("txtNombre").value;
datos.apellido =document.getElementById("txtApellido").value;
datos.email =document.getElementById("txtEmail").value;
datos.password =document.getElementById("txtPassword").value;

let repetir  =document.getElementById("txtRepePassword").value;

if (repetir!=datos.password){
    alert("no son iguales las contraseñas");
    return;
}

    const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(datos)
    });
alert("¡Se ha registrado exitosamente!");
    window.location.href="index.html";
}

