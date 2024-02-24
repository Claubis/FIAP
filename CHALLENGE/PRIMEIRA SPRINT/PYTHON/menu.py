#-----------( Baixar bibliotecas )----------#
import json
import os
print(os.getcwd())

#-----------( Função para chama o json menu )----------#
# Função para carregar os dados do arquivo JSON - Lá precisa conter a nossa base de busca, onde vou adicionar, excluir, alterar dados
def carregar_dados():
    with open('./menu_data.json', 'r') as arquivo:
        dados = json.load(arquivo)
        return dados

#-----------(Função para salvar dados )----------#
# Função para salvar os dados de volta no arquivo JSON
def salvar_dados(dados):
    with open('./menu_data.json', 'w') as arquivo:
        json.dump(dados, arquivo, indent=4)

#-----------( Função para Exibir o menu )----------#

# Função para exibir os menus
def exibir_menus():

    dados = carregar_dados()
    menus = dados.get('menus', [])

    print("### As opções disponiveis hoje! ###")
    for menu in menus:
        print(f"ID: {menu['id']} | Nome: {menu['nome']} | Link: {menu['link']}")

    opcao()

#-----------( Função para voltar ou encerrar o programa )----------#

def opcao():
    print("Para voltar ao menu anterior, digite 0 ou 1 para encerrar o programa")
    opcao = input("Escolha uma opção: ")
    opcao = int(opcao)

    if opcao == 0:
        print("Você definiu a opção de voltar ao menu principal")
    elif opcao == 1:
        print("Encerrando o progama...")
        exit()

    else:
        pass
        

#-----------( Função para realizar a consulta no banco, através de conexão ao banco )----------#

def conectar_sql():
    server = ''
    database = ''
    user = ''
    password = ''

    tentativas = 3

    for tentativa in range(1, tentativas + 1):
        try:
            conexao = pymssql.connect(server=server, database=database, user=user, password=password)
            print(f"Conexão bem-sucedida na tentativa {tentativa}")
            return conexao
        except Exception as e:
            print(f"Tentativa {tentativa} falhou. Erro: {e}")
            if tentativa == tentativas:
                raise

def gerar_query():

    # Query - Aqui pode modificar se precisar
    query = """ Inserir a consulta aqui quando criarmos o banco """

    # Fazer a conexão e olhar os dados
    conexao = conectar_sql()
    df = pd.read_sql_query(query, conexao)

    conexao.close()
    
    return df

#-----------( Função para consultar o banco de dados - Log de visitantes )----------#

# Função para exibir os menus
def consultar_banco_visitantes():

    print("### Acesso ao banco de dados dos visitantes ###")

    # query para consulta do banco de dados. Aqui será onde a consulta vai ocorrer sem a necessidade de montar outras querys
    
    df = gerar_query()
    print(df)

    
    print("Para voltar ao menu anterior, digite 0 ou 1 para encerrar o programa")
    opcao = input("Escolha uma opção: ")
    opcao = int(opcao)

    opcao()

#-----------( Função para consultar o banco de dados de logs de clientes)----------#

# Função para exibir os menus
def consultar_banco_clientes():

    print("### Acesso ao banco de dados - Logs de clientes ###")

    # query para consulta do banco de dados. Aqui será onde a consulta vai ocorrer sem a necessidade de montar outras querys
    
    df = gerar_query()
    print(df)

    opcao()
    

#-----------( Função para consultar o banco de dados - Formulários preenchidos )----------#

# Função para exibir os menus
def consultar_banco_formularios():

    print("### Acesso ao banco de dados - Formulários preenchidos ###")

    # query para consulta do banco de dados. Aqui será onde a consulta vai ocorrer sem a necessidade de montar outras querys
    
    df = gerar_query()
    print(df)

    opcao()

#-----------( Função para consultar o banco de dados )----------#

# Função para exibir os menus
def consultar_leads():

    print("### Acesso a consulta de Leads ###")

    # query para consulta do banco de dados. Aqui será onde a consulta vai ocorrer sem a necessidade de montar outras querys
    
    df = gerar_query()
    print(df)
    
    opcao()


#-----------( Função para adicionar o menu )----------#

# Função para adicionar um novo menu
def adicionar_conteudo():
    nome = input("Digite o nome do novo menu: ")
    link = input("Digite o link do novo menu: ")

    dados = carregar_dados()
    menus = dados.get('menus', [])

    novo_menu = {'id': len(menus) + 1, 'nome': nome, 'link': link}
    menus.append(novo_menu)

    dados['menus'] = menus
    salvar_dados(dados)

    print(f"Menu '{nome}' adicionado com sucesso!")

    opcao()

#-----------( Função para remover algum menu )----------#

# Função para remover um menu
def remover_conteudo():
    id_menu = int(input("Digite o ID do menu que deseja remover: "))

    dados = carregar_dados()
    menus = dados.get('menus', [])

    for menu in menus:
        if menu['id'] == id_menu:
            menus.remove(menu)
            dados['menus'] = menus
            salvar_dados(dados)
            print(f"Menu ID {id_menu} removido com sucesso!")
            return

    print(f"Nenhum menu encontrado com ID {id_menu}.")

    opcao()


#-----------( Função para fechar o programa )----------#

# Função para remover um menu
def sair_programa():
    print(f"Programa encerrado.")
    exit()


#-----------( Função para o menu de opções )----------#
# Menu de opções
def menu_principal():
    while True:
        print("\n### Menu de Administração para funcionários ###")
        print("1. Exibir Menus do site")
        print("2. Adicionar conteúdo")
        print("3. Remover conteúdo")
        print("4. Consultar Banco de dados logs - visitantes")
        print("5. Consultar Banco de dados logs - clientes")
        print("6. Consultar Banco de dados formulário")
        print("7. Consultar Leads")
        print("8. Sair")

        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            exibir_menus()
        elif opcao == "2":
            adicionar_conteudo()
        elif opcao == "3":
            remover_conteudo()
        elif opcao == "4":
            consultar_banco_visitantes()
        elif opcao == "5":
            consultar_banco_clientes()
        elif opcao == "6":
            consultar_banco_formularios()
        elif opcao == "7":
            consultar_leads()
        elif opcao == "8":
            sair_programa()
            break            
        else:
            print("Opção inválida. Tente novamente.")

#-----------( Função para chamar as demais funções )----------#

# Iniciar o menu principal - Aqui vou rodar todos os processos
if __name__ == "__main__":
    menu_principal()
