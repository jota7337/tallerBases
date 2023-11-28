$(document).ready(function() {

});

async function registrarFactura() {
    let datos = {};
    datos.ID_TIPOCFAC =document.getElementById("txtTipoFactura").value;
    datos.CLIENTE_FACTURA =document.getElementById("txtClienteID").value;
    datos.TOTAL_FACTURA =document.getElementById("txtotal").value;
    datos.DESCUENTO_FACTURA =document.getElementById("txtdescuento").value;
    datos.ESTADO_FACTURA =document.getElementById("txtEstado").value;



   /* if (repetir!=datos.password){
        alert("no son iguales las contraseñas");
        return;
    }
*/
    const request = await fetch('api/v1/factura', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(datos)
    });
    console.log(datos)
    alert("se logroe registrar");
    window.location.href="Factura.html";
}