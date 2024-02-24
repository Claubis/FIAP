import re
import pandas as pd

# Lista para armazenar os cadastros. Ela vai iniciar em branco.
usuarios = []

# Nome: cadastrar_usuario
# Descrição: Realiza o cadastro de um novo usuário solicitando nome, e-mail, senha e confirmação de senha. Realiza validações nos dados inseridos. Os dados aqui serão inseridos na lista Usuario [] que foi iniciado em branco.
# Dependência: Nenhuma

def cadastrar_usuario():
    print("Cadastro de Usuário")
    
    # Loop para garantir que o nome seja inserido corretamente
    while True:
        nome = input("Digite seu nome: ")
        if nome.isalpha():
            break
        else:
            print("O nome não pode conter números ou estar vazio. Tente novamente.")


    email = input("Digite seu e-mail: ")
    while not re.match(r"[^@]+@[^@]+\.[^@]+", email):
        print("E-mail inválido. Deve conter '@' e '.'.")
        email = input("Digite seu e-mail novamente: ")

    senha = input("Digite sua senha: ")
    while not (any(char.isalpha() for char in senha) and any(char.isdigit() for char in senha)):
        print("A senha deve conter letras e números.")
        senha = input("Digite sua senha novamente: ")

    confirmar_senha = input("Confirme sua senha: ")
    while senha != confirmar_senha:
        print("As senhas não coincidem. Tente novamente.")
        confirmar_senha = input("Confirme sua senha novamente: ")

    usuario = {'nome': nome, 'email': email, 'senha': senha}
    usuarios.append(usuario)
    print("Cadastro realizado com sucesso!")

# Nome: listar_usuarios
# Descrição: Lista todos os usuários cadastrados, exibindo nome e e-mail.
# Dependência: Ela precisa que o cadastrar_usuário tenha ocorrido para gerar dados dentro da lista de usuarios[]. Se não for executada, não teremos nenhum dado disponível.

def listar_usuarios():
    print("\nLista de Usuários:")
    for usuario in usuarios:
        print(f"Nome: {usuario['nome']}, E-mail: {usuario['email']}, Senha: {usuario['senha']}")
    print()

# Nome: fazer_login
# Descrição: Realiza o login do usuário solicitando e-mail e senha, verificando se as credenciais são válidas.
# Dependência: Precisa que tenhamos dados dentro da lista de usuarios[] para que ela possa validar os dados.

def fazer_login():
    print("Login")
    email = input("Digite seu e-mail: ")
    senha = input("Digite sua senha: ")

    for usuario in usuarios:
        if usuario['email'] == email and usuario['senha'] == senha:
            print(f"Login realizado com sucesso, bem-vindo {usuario['nome']}!")
            return usuario
    print("Não foi possível fazer login. E-mail ou senha incorretos.")
    return None

# Nome: alterar_senha
# Descrição: Altera a senha do usuário logado, solicitando a senha atual e a nova senha, realizando validações.
# Dependência: Necessita que o usuário esteja logado. A função Login já terá diso executada.

usuario_logado = None

def alterar_senha(usuario_logado):
    if usuario_logado:
        print(f"Alterar Senha para o usuário {usuario_logado['nome']}")
        
        while True:
            senha_atual = input("Digite a senha atual: ")
            if senha_atual == usuario_logado['senha']:
                break
            else:
                print("Senha atual incorreta. Tente novamente.")

        while True:
            nova_senha = input("Digite a nova senha: ")
            if any(char.isalpha() for char in nova_senha) and any(char.isdigit() for char in nova_senha):
                break
            else:
                print("A senha deve conter letras e números. Tente novamente.")

        while True:
            confirmar_senha = input("Confirme a nova senha: ")
            if nova_senha == confirmar_senha:
                break
            else:
                print("As senhas não coincidem. Tente novamente.")

        usuario_logado['senha'] = nova_senha
        print("Senha alterada com sucesso!")
    else:
        print("Usuário não encontrado. Não é possível alterar a senha.")


# Nome: alterar_dados_cadastrais
# Descrição: Permite ao usuário logado alterar seu nome ou e-mail.
# Dependência: Necessita que o usuário esteja logado.

usuario_logado = None

def alterar_dados_cadastrais(usuario_logado):
    if usuario_logado:
        print("Alterar Dados Cadastrais")
        print("1. Alterar Nome")
        print("2. Alterar E-mail")
        escolha = input("Digite o número da opção desejada: ")

        if escolha == '1':
            novo_nome = input("Digite o novo nome: ")
            while any(char.isdigit() for char in novo_nome):
                print("O nome não pode conter números.")
                novo_nome = input("Digite o novo nome novamente: ")
            usuario_logado['nome'] = novo_nome
            print("Nome alterado com sucesso!")

        elif escolha == '2':
            novo_email = input("Digite o novo e-mail: ")
            while not re.match(r"[^@]+@[^@]+\.[^@]+", novo_email):
                print("E-mail inválido. Deve conter '@' e '.'.")
                novo_email = input("Digite o novo e-mail novamente: ")
            usuario_logado['email'] = novo_email
            print("E-mail alterado com sucesso!")

        else:
            print("Opção inválida.")
    else:
        print("Usuário não encontrado. Não é possível alterar os dados cadastrais.")

# Nome: opcao
# Descrição: Exibe um menu de opções para o usuário, permitindo voltar ao menu anterior ou encerrar o programa.
# Dependência: Nenhuma

def opcao():
    print("Para voltar ao menu anterior, digite 0 ou 1 para encerrar o programa")
    opcao = input("Escolha uma opção: ")
    opcao = int(opcao)

    if opcao == 0:
        print("Você definiu a opção de voltar ao menu principal")
    elif opcao == 1:
        print("Encerrando o programa...")
        exit()
    else:
        pass

# -----------( Função para realizar a consulta no banco, através de conexão ao banco )----------#

# Nome: conectar_sql
# Descrição: Estabelece uma conexão com um banco de dados SQL Server.
# Dependência: Nenhuma

def conectar_banco_dados():
    print("Ainda está em construção. Será entregue na próxima Sprint")
    
    #return

# Nome: gerar_query
# Descrição: Gera uma consulta no banco de dados através de uma conexão SQL e retorna os dados em um DataFrame do Pandas.
# Dependência: Necessita da função conectar_sql.

def gerar_query():

    print("Ainda estamos criando este processo. Será entregue na próxima sprint")
    
    # return 

# -----------( Funções adicionais para consulta no banco de dados )----------#

# Nome: consultar_banco_experiencia_usuario
# Descrição: Realiza uma consulta no banco de dados - Logs de clientes e sua experiência - e exibe os resultados.
# Dependência: Necessita da função gerar_query.

def consultar_banco_experiencia_usuario():
    print("### Acesso ao banco de dados - Logs de clientes e sua experiência ###")
    print("Ainda estamos criando este processo. Será entregue na próxima sprint")
    
    opcao()


# Nome: consultar_banco_formularios
# Descrição: Realiza uma consulta no banco de dados - Formulários preenchidos - e exibe os resultados.
# Dependência: Necessita da função gerar_query.

def consultar_banco_formularios():
    print("### Acesso ao banco de dados - Formulários preenchidos ###")
    print("Ainda estamos criando este processo. Será entregue na próxima sprint")
    
    opcao()

# Nome: consultar_leads
# Descrição: Realiza uma consulta no banco de dados - Leads - e exibe os resultados.
# Dependência: Necessita da função gerar_query.

def consultar_leads():
    print("### Acesso a consulta de Leads ###")
    print("Ainda estamos criando este processo. Será entregue na próxima sprint")
  
    opcao()

# Exemplo de uso
while True:
    print("\nEscolha uma opção:")
    print("1. Cadastrar usuário")
    print("2. Listar usuários")
    print("3. Fazer login")
    print("4. Consultar no banco de dados - Logs de clientes e sua experiência")
    print("5. Consultar no banco de dados - Formulários preenchidos")
    print("6. Consultar leads")
    print("7. Alterar senha")
    print("8. Alterar dados cadastrais")
    print("9. Sair")

    escolha = input("Digite o número da opção desejada: ")

    if escolha == '1':
        cadastrar_usuario()
        opcao()
    elif escolha == '2':
        listar_usuarios()
        opcao()
    elif escolha == '3':
        usuario_logado = fazer_login()
        opcao()
    elif escolha == '4':
        consultar_banco_experiencia_usuario()
    elif escolha == '5':
        consultar_banco_formularios()
    elif escolha == '6':
        consultar_leads()
    elif escolha == '7':
        alterar_senha(usuario_logado)
        opcao()
    elif escolha == '8':
        alterar_dados_cadastrais(usuario_logado)
        opcao()
    elif escolha == '9':
        print("Saindo do programa. Até mais!")
        break
    else:
        print("Opção inválida. Tente novamente.")
