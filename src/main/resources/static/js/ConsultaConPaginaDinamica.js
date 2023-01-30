window.addEventListener("load", () => {
    const frmObtenerAlbaranes = document.querySelector("#frmObtenerAlbaranes");
    frmObtenerAlbaranes.addEventListener("submit", (event) => {
        event.preventDefault();
        obtenerAlbaranes();
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
                    "<thead><th>numero</th><th>cliente</th><th>para entregar en</th></thead>"
                jsonData.map(albaran => {
                    tablaDeAlbaranes.innerHTML += 
                        "<tr><td>" + albaran["numeroDeAlbaran"] 
                        + "</td><td>" + albaran["cliente"]["nombre"]
                        + "</td><td>" + albaran["destino"]["poblacion"]
                        + "</td></tr>"
                })
            })
            .catch((error) => alert("Se ha producido un error en la API de albaranes:\n" + error.message)); 
        alert(
        "Todavia no se ha implementado la consulta de albaranes..." +
            "\nLo siento, estoy trabajando en ello." +
            "\nPor ahora solo se muestran resultados parciales..." +
            "\n\n Cuando este terminado el trabajo, se mostrarán todos los datos de los últimos " + cuantos + " albaranes."
        );
    };
});
