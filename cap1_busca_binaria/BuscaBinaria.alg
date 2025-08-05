// para rodar o programa em portugol, acessar o site: https://portugol.dev/

programa
{
	funcao inicio()
	{
		inteiro vetor[10] = {2, 4, 7, 10, 13, 18, 21, 25, 30, 35}
		inteiro valorProcurado, inicio, fim, meio
		logico en
        contrado

		escreva("Digite o número que deseja buscar: ")
		leia(valorProcurado)

		inicio = 0
		fim = 9
		encontrado = falso

		enquanto (inicio <= fim e encontrado == falso)
		{
			meio = (inicio + fim) / 2

			se (vetor[meio] == valorProcurado)
			{
				encontrado = verdadeiro
			}
			senao
			{
				se (valorProcurado < vetor[meio])
				{
					fim = meio - 1
				}
				senao
				{
					inicio = meio + 1
				}
			}
		}

		se (encontrado)
		{
			escreva("Número encontrado na posição: ", meio, "\n")
		}
		senao
		{
			escreva("Número não encontrado no vetor.\n")
		}
	}
}
