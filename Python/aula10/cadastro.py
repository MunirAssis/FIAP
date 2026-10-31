def menu():
    opcoes = ["inclui", "altera", "consulta pelo titulo", "consulta genero", "apaga", "sair"]
    i = 0
    while i < len(opcoes):
        print(f"{i+1} - {opcoes[i]}")
        i = i+1
    opcoes = int(input("Escolha: "))
    return opcoes

def inclui(lista: list):
    tit = input("titulo:")
    gen = input("Genero: ")
    nota = input("Nota: ")
    elenco = input("Elenco: ")
    ano = int(input("Ano: "))
    classif = input("Classificação: ") 
    list.append(tit)
    list.append(gen)
    list.append(nota)
    list.append(elenco)
    list.append(ano)
    list.append(classif)

def busca(lista: list, titulo: str):
    i = 0
    while i <len(lista):
        if lista[i] == titulo:
            return i
        i = i+6
        return -1

    
def altera(lista: list):
    tit = input("informe o titulo do filme: ")
    pos = busca(lista, list)
    if pos == 1:
        print("filme não encontrado")
    else:
        print("informe se for diferente ou de um enter")
        tit = input(f" Titulo ({lista[pos]}): ")
        
        if tit:
            lista.insert(pos, tit)

        gen = input(f"genero ({lista[pos + 1]}): ")
        if gen:
            lista.insert(pos, +1, tit)

        nota = input(f"Nota ({lista[pos +2]}): ")
        if nota:
            lista.insert(pos, +2, tit)
            

def consulta_titulo():


def consulta_genero():


def apaga():


dados = []
print("cadastro de filmes: ")
op = 0
while op != 6:
    op = menu()
    if op == 1:
        inclui(dados) #caso trabalhar com mais listas, deve se usar elas aqui
    elif op == 2:
        altera(dados)
    elif op == 3:
        consulta_titulo(dados)
    elif op == 4:
        consulta_genero(dados)
    elif op == 5:
        apaga(dados)
    elif op == 6:
        print("Vá com Deus!")
    else:
        print("opção invalida!")
