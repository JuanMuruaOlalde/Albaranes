function mostrarDetallesDelAlbaran(albaran) {
    let detalles = `
        <p>${albaran.numeroDeAlbaran}</p>
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
    document.querySelector("#paraMostrarLineas").innerHTML = detalles;
    
    const FaroDePuntaGalea = { lat: 43.37183380126953, lng: -3.035311460494995 };
    mostrarDestinoEnElMapa(FaroDePuntaGalea);
}

let map;

async function mostrarDestinoEnElMapa(destino) {
  const { Map } = await google.maps.importLibrary("maps");
  const { AdvancedMarkerElement } = await google.maps.importLibrary("marker");

  map = new Map(document.getElementById("paraMostrarDestino"), {
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



