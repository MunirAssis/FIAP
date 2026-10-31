'''Exercicio 2'''
def calcular_maiores_aumentos():
    # Solicita a quantidade de produtos
    n = int(input("Digite a quantidade de produtos: "))
    
    # Inicializa as variáveis para guardar os maiores aumentos
    maior_aumento_reais = 0.0
    maior_aumento_percentual = 0.0
    
    # Loop para ler os dados de cada produto
    for i in range(1, n + 1):
        print(f"\n--- Produto {i} ---")
        preco_atual = float(input("Digite o preço atual (R$): "))
        preco_reajustado = float(input("Digite o preço reajustado (R$): "))
        
        # Calcula os aumentos
        aumento_reais = preco_reajustado - preco_atual
        
        # Evita divisão por zero caso o preço atual seja 0
        if preco_atual > 0:
            aumento_percentual = (aumento_reais / preco_atual) * 100
        else:
            aumento_percentual = 0.0
            
        # Verifica se é o maior aumento em reais
        if aumento_reais > maior_aumento_reais:
            maior_aumento_reais = aumento_reais
            
        # Verifica se é o maior aumento percentual
        if aumento_percentual > maior_aumento_percentual:
            maior_aumento_percentual = aumento_percentual

    # Exibe os resultados finais com duas casas decimais
    print("\n================ RESULTADO ================")
    print(f"Maior aumento em reais: R$ {maior_aumento_reais:.2f}")
    print(f"Maior aumento percentual: {maior_aumento_percentual:.2f}%")

# Executa o programa
if __name__ == "__main__":
    calcular_maiores_aumentos()