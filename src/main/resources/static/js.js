function iniciar() {
    $.get("/start").then(
        function (data) {
        }
    );
    console.log(this.responseText);
    document.getElementById("juego").style.display = "block";
    document.getElementById("iniciar").style.display = "none";
}
var intento = 0;
function comparacion() {
    intento++;
    var numerosUsuario = document.getElementById("numero").value
    var container = document.createElement("div");
    var rta = document.createElement("h1");
    var mandarmensaje = document.createElement("h1");
    rta.innerHTML = numerosUsuario;


    var data = { "numerosUsuario": numerosUsuario };
    $.post("/comparacion", data).then(
        function (mensaje) {
            if (mensaje === "Has ganado") {
                window.location.reload();
                alert("Has ganado, casi que no");
            } else {
                mandarmensaje.innerHTML = "Intento numero  " + intento + "<br/>" + mensaje;
                container.prepend(rta)
                container.prepend(mandarmensaje)
            }

        }
    )
    document.getElementById("rta").prepend(container);
}
