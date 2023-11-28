$(document).ready(function() {
    cargarUsuarios();
    $('#factura').DataTable();
});

async function cargarFactura() {

    const request = await fetch('api/v1/factura', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    const facturas = await request.json();
    let lista= "";

    for(let factura of facturas){

       /* let btelminar = "<a href=\"#\" onclick='eliminarUsuario("+usuario.id+")' class=\"btn btn-danger btn-circle\">\n" +
            "                                        <i class=\"fas fa-trash\"></i>\n" +
            "                                    </a>";*/

       /* let telefonoP= usuario.telefono == null ? "--" : usuario.telefono;*/

        let facturahtml = "<tr><td>"+factura.ID_TIPOCFAC+"</td><td>"+factura.CLIENTE_FACTURA+" "+factura.TOTAL_FACTURA+"</td>" +
            " <td>"+factura.DESCUENTO_FACTURA+"</td> <td>"+factura.SALDO_FACTURA+"</td>" +
            " <td>"+factura.ESTADO_FACTURA+"</td> </tr>";
        lista+= facturahtml;
    }

    console.log(facturas);

    document.querySelector('#facturas tbody').outerHTML =lista;
}

/*
async function eliminarUsuario(id){


    if (!confirm ("quiere eliminar el usuario")){
        return;
    }

    const request = await fetch('api/usuarios/' + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    location.reload()

}*/
