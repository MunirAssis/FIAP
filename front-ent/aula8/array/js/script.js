console.log("Hello World")      //famoso print
//local storage -> Guarda localmente no browser (storage = Seção = Aba do browser)
//Session Storage -> Seção do Broser
//key | value
//                       key           value
//-sessionStorage.setItem("userEmail" , "Ubirajaraapelli@fiap.com.br")//guarda um valor storage
//-localStorage.setItem("userEmail" , "Ubirajaraapelli@fiap.com.br") // guarda um valor no Storage

//-const session = sessionStorage.getItem() // Pegar um valor do Storage
//-const local = sessionStorage.getItem() // Pegar um valor do Storage

//-console.log(session)
//-console.log(local)

//-sessionStorage.removeItem("userEmail")
//-localStorage.removeItem("userEmail") //remove o valor do storafe


//-sessionStorage.clear()
//-localStorage.clear() //apaga todos os valores da storages


//Array = lista
//-const numeros = (0, 1, 2, 3, 4, 5, 6)
//-const nomes = ("Bira","Arthur","Gabi","Gustavo")

//console.log(numeros) //printando para aparecer no inspecionar
//console.log(numeros.map((n) => n < 5))//map == função, e retorna um novo Array
//como nesse caso: o map mosta true p todos os n< 5 or false n>=5

//console.log(numeros.filter( (n) => n < 5)) //Filtra! aparece so os n <5 /ainda em Array

//console.log(numeros.find((n) => n < 5)) //Busca! 
//console.log(nomes.filter((n) => n !== "Bira")) //(!==) = diferente
//nesse caso de cima iria aparecer todos os nomes menos o "Bira"


//Objeto (no *JavaScript*)
const prd = {
    id : 1,
    nome: "Hambúrguer",
    descricao: "Hambúrguer artesanal com queijo e salada.",
    preco: 28.9,
    imagem: "images/hamburguer.png"}

//-console.log(prd.id)         //tem como buscas uma "categoria" no obj
//-console.log(prd.descricao)
//-console.log(prd.preco)

//-console.log(produtos)
//-console.log(produtos.length) //o length indica quantos itens tem no Array
//-console.log(produtos[0])     //busca um item especifico no Array
//-console.log(produtos[2].nome)

//Array -> plural | parametro da função -> Singular

console.log(produtos.map((produtos) => produtos.nome))
console.log(produtos.filter((produtos) => produtos.preco < 30)) // aq ele filtra por produtos que tem o preco <30
console.log(produtos.find((produtos)=> produtos.id == 2)) //aq ele busca por um id de produto que seja igual a 2

const btnAdd1 = document.querySelector("#btn-add-1")

btnAdd1.addEventListener("click", () =>{
    const product = produtos.find((produtos) => produtos.id === 1)
    sessionStorage.setItem("cart", JSON.stringify(product))
})