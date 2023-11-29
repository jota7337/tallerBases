$(document).ready(function() {
    cargarUsuarios();
    $('#factura').DataTable();
});

function fecha(a){
    const fecha = new Date(a);
    const year = fecha.getFullYear();
    const month = String(fecha.getMonth() +1);
    const day = String(fecha.getDate());
    const hours = String(fecha.getHours());
    const minutes = String(fecha.getMinutes());
    const seconds = String(fecha.getSeconds());
    const fechaFormateada = `${year}:${month}:${day} - ${hours}:${minutes}:${seconds}`;

    return fechaFormateada;
}

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

        let facturahtml = "<tr><td>"+factura.id_FACTURA+"</td><td>"+factura.cliente_FACTURA+"</td><td>"+fecha(factura.fecha_FACTURA)+"</td>" +
            " <td>"+factura.total_FACTURA+"</td><td>"+factura.subtotal_FACTURA+"</td><td>"+(factura.descuento_FACTURA*100)+"%</td><td>"+(factura.iva_FACTURA*100)+"%</td><td>"+factura.saldo_FACTURA+"</td> </tr>";
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
