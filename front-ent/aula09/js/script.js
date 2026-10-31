const html = document.querySelector("html")
const btnToogleTheme = document.querySelector("#toogle-theme")

btnToogleTheme.addEventListener("click", ()=> {
    html.removeAttribute("data-theme")
    if (Attr === "light"){
        html.setAttribute("data-theme", "dark")
        return
    }

    html.setAttribute("data-theme", "light")
})
/* Geralmente não usamos o else em JS, pois ele ja usa o return*/