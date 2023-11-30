// Call the dataTables jQuery plugin


$(document).ready(function () {

});

async function iniciarSesion() {

    let datos = {};
    datos.email = document.getElementById("txtEmail").value;
    datos.password = document.getElementById("txtPassword").value;

    const request = await fetch('api/login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(datos)
    });
    const respuesta = await request.json();


    if (respuesta.email) {
        /*console.log(respuesta.nombre);*/
        window.location.href = "inicio.html";
        localStorage.id = respuesta.id;
        localStorage.nombre = respuesta.nombre;

    } else {
        alert("El usuario no está registrado. Verifique los datos");
        console.log(respuesta.email);

    }
}
