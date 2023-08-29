function mostrarDetallesDelAlbaran(numeroDeAlbaran) {
    const titulo = document.querySelector("#tituloDeLasLineasDeAlbaran");
    titulo.innerHTML = "Albarán " + numeroDeAlbaran;
    const tablas = document.querySelectorAll(".tablaAOcultar");
    tablas.forEach((tabla) => {
        tabla.style.display = "none";
    });
    const tablaAMostrar = document.querySelector("#" + numeroDeAlbaran);
    tablaAMostrar.style.display = "block";
}
