function diagnosticoSemVideo() {

    let liga = prompt("O computador liga? (sim/nao)");

    if (liga.toLowerCase() === "nao") {
        document.getElementById("resultado").innerHTML =
            "Verifique a tomada, cabo de energia e fonte.";
        return;
    }

    let monitor = prompt("O monitor está ligado? (sim/nao)");

    if (monitor.toLowerCase() === "nao") {
        document.getElementById("resultado").innerHTML =
            "Ligue o monitor.";
        return;
    }

    let sinal = prompt("Aparece 'Sem sinal'? (sim/nao)");

    if (sinal.toLowerCase() === "sim") {
        document.getElementById("resultado").innerHTML =
            "Verifique o cabo HDMI/VGA.";
    } else {
        document.getElementById("resultado").innerHTML =
            "Teste a memória RAM e a placa de vídeo.";
    }
}