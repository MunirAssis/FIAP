time1 = input("escreva o nome do time: ")
time2 = input("escreva o nome do time: ") 

numG1 = int(input(f"informe o numero de gols do {time1}: "))
numG2 = int(input(f"informe o numero de gols do {time2}: "))

if numG1 > numG2:
    print(f"Vencedor: {time1}")
if numG2 > numG1:
    print(f"Vencedor: {time2}")
else:
    print(f"Empate")