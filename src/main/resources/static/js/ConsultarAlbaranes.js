function mostrarDetallesDelAlbaran(albaran) {
    mostrarPuntoDeEntregaYProductosAEntregar(albaran);
    mostrarDestinoEnElMapa({ lat: albaran.destino.latitud, lng: albaran.destino.longitud });
}

function mostrarPuntoDeEntregaYProductosAEntregar(albaran) {
    let detalles = `
        <p><strong>${albaran.numeroDeAlbaran}</strong></p>
        <div style="margin-left: 3em">
        <p>${albaran.cliente.nombre}</p>
        <p>${albaran.destino.zonaOpoligono}</p>
        <p>${albaran.destino.calle} ${albaran.destino.portal} ; ${albaran.destino.pisoYmano}</p>
        <p>${albaran.destino.poblacion}</p>
        <p>Telefono de contacto: ${albaran.destino.telefonoDeContacto}</p>
        </div>
        `;
    detalles += `
        <table>
            <thead>
                <th>codigo de artículo</th>
                <th>artículo</th>
                <th>cantidad</th>
            </thead>
            <tbody>
        `;
    for(let linea of albaran.lineas) {
        detalles += `
            <tr>
                <td>${linea.articulo.codigoDeArticulo}</td>
                <td>${linea.articulo.nombreCorto}</td>
                <td>${linea.cantidad}</td>
            </tr>
            `;
    }
    detalles += `
            </tbody>
        </table>
        `;
    document.querySelector("#paraMostrarDetallesTexto").innerHTML = detalles;
}

let map;

async function mostrarDestinoEnElMapa(destino) {
  const { Map } = await google.maps.importLibrary("maps");
  const { AdvancedMarkerElement } = await google.maps.importLibrary("marker");

  map = new Map(document.getElementById("paraMostrarDetallesMapa"), {
    zoom: 18,
    center: destino,
    mapId: "DESTINO_DE_ENTREGA_DEL_ALBARAN",
  });

  const marker = new AdvancedMarkerElement({
    map: map,
    position: destino,
    title: "Destino de entrega del albarán",
  });
}



