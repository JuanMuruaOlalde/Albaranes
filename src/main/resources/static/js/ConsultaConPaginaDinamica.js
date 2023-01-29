window.addEventListener("load", () => {
    const frmObtenerAlbaranes = document.querySelector("#frmObtenerAlbaranes");
    frmObtenerAlbaranes.addEventListener("submit", (event) => {
        event.preventDefault();
        obtenerAlbaranes();
    });

    function obtenerAlbaranes() {
        const datos = new FormData(frmObtenerAlbaranes);
        const cuantos = Number(datos.get("cuantosAlbaranes"));
        alert(
            "Todavia no se ha implementado la consulta de albaranes..." +
                "\nLo siento, estoy trabajando en ello." +
                "\n\n Cuando este implementada, se podran mostrar los últimos " +
                cuantos +
                " albaranes."
        );
    }
});
