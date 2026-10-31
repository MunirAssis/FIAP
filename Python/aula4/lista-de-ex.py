nomeA = input("qual o nome do time A?: ") 
nomeB = input("qual o nome do time B?: ")

golsA=int(input(f"quantos gols o {nomeA} marcou?"))
golsB=int(input(f"quantos gols o {nomeB} marcou?"))

if golsA > golsB:
    print(f"o {nomeA} é campeao")
elif golsB > golsA:    
    print(f"o {nomeB} é campeao")
else:
    print("o jogo vai para os penaltys")