console.log("Ola mundo")

var Variavel //metodo ultrapassado 
const Name ="" //variavel fixa
let value //variavel pode retribuir valor 

const fullname = "Munir" //String
const TotalValue = 1000 // number
const Open= true //Boolean

const lista = ["Bira", "Arthur", "Anna"] //Array

console.log(TotalValue)
console.log(lista)
console.log(lista.length)
console.log(lista[0])

if(TotalValue < 1000){
    console.log("Menor que 1000")
} else {
    console.log("maior que mil")
}

const h1 = document.querySelector("h1")
const p = document.querySelector("p.paragraph")
const p2 = document.querySelector("#secundary")
const body = document.querySelector("body")


console.log(h1)
console.log(p2)

//podemos manipular css usando: body.style.backgroundColor = "red"

//body.classList.add("background")

const btnClick = document.querySelector("#btn-click")

btnClick.addEventListener("click", () => {
    //alert("Voce ganhou")

    if (body.classList.contains("backgroud")) {
        console.log(body.classList.contains("background"))
        body.classList.remove("background")
    } else {
        console.log(body.classList.contains("background"))
        body.classList.add("background")
    }
})

const asdf = 11 +"11"
console.log(asdf)