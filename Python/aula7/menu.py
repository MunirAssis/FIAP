escolha = 0
while escolha != 6:
    print("1- blackjack")
    print("2- jogo da velha")
    print("3- jogo da forca")
    print("4- jogo dos numeros")
    print("5- jokenpo")
    print("6- sair")

    escolha=input("escolha um jogo: ")
    print(escolha)
    if escolha == 1:
        print("vc vai jogar o jogo o blackjack")
    elif escolha==2:
        print("vc vai jogar o jogo da velha")
    elif escolha == 3:    
        print("vc vai jogar o jogo da forca")
    elif escolha == 4:
        print("vc vai jogar o jogo dos numeros")
    elif escolha==5:
        print("vc vai jogar o jogo jokenpo")
    else:
        print("saindo...")