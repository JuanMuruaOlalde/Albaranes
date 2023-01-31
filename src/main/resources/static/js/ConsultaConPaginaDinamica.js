window.addEventListener("load", () => {
    const frmObtenerAlbaranes = document.querySelector("#frmObtenerAlbaranes");
    frmObtenerAlbaranes.addEventListener("submit", (event) => {
        event.preventDefault();
        obtenerAlbaranes();
    });
});

function obtenerAlbaranes() {
    const datos = new FormData(frmObtenerAlbaranes);
    const cuantos = Number(datos.get("cuantosAlbaranes"));
    fetch("/albaranes/ultimos/" + cuantos)
        .then((response) => {
            if (!response.ok) {
                alert("No ha sido posible obtener datos de albaranes:\n" + response.status + " " + response.statusText);
            }
            return response.json();
        })
        .then((jsonData) => {
            const tablaDeAlbaranes = document.getElementById("tablaDeLosAlbaranes");
            tablaDeAlbaranes.innerHTML = 
                '<thead><th>numero</th><th>cliente</th><th>para entregar en</th></thead>';
            jsonData.map( albaran => {
                const numeroDeAlbaranSeleccionado = albaran["numeroDeAlbaran"];
                const lineas = albaran["lineas"];
                tablaDeAlbaranes.innerHTML += 
                    '<tr><td>' + numeroDeAlbaranSeleccionado 
                    + '</td><td>' + albaran["cliente"]["nombre"]
                    + '</td><td>' + albaran["destino"]["poblacion"]
                    + '<td>'
                    + '<button type="button"'
                    + 'onclick="mostrarDetallesDelAlbaran(\'' + numeroDeAlbaranSeleccionado + '\'' 
                    + ', \'' + JSON.stringify(lineas).replace(/\"/g, "&quot;") + '\')"'
                    + '>Mostrar detalles</button>'
                    + '</td></tr>';
            });
        })
        .catch((error) => alert("Se ha producido un error en la API de albaranes:\n" + error.message)); 
};


function mostrarDetallesDelAlbaran(numeroDeAlbaran, lineasJSON) {
    const tituloDelDetalleDeLineas = document.getElementById("tituloDelDetalleDeLineas");
    tituloDelDetalleDeLineas.innerHTML = 
        'Albarán ' + numeroDeAlbaran
    const tablaDelDetalleDeLineas = document.getElementById("tablaDelDetalleDeLineas");
    tablaDelDetalleDeLineas.innerHTML = 
        '<thead><th>codigo de artículo</th><th>artículo</th><th>cantidad</th></thead>';
    const lineas = JSON.parse(lineasJSON);
    lineas.map( linea => {
        tablaDelDetalleDeLineas.innerHTML += 
            '<tr><td>' + linea["articulo"]["codigoDeArticulo"] 
            + '</td><td>' + linea["articulo"]["nombreCorto"]
            + '</td><td>' + linea["cantidad"]
            + '</td></tr>';
    });
};
