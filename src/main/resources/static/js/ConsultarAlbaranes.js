function mostrarDetallesDelAlbaran(albaran) {
    let detalles = `
        <p>Albarán ${albaran.numeroDeAlbaran}</p>
        <table>
            <thead>
                <th>codigo de artículo</th>
                <th>artículo</th>
                <th>cantidad</th>
            </thead>
            <tbody>
        `;
    for(linea of albaran.lineas) {
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
    document.querySelector("#paraMostrarDetallesDelAlbaran").innerHTML = detalles;
}
