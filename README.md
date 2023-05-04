# 📲 Squad Apps
### Autora: Letícia Beatriz Souza
Repositório criado com o intuito de armazenar as atividades desenvolvidas durante a prática do programa Jovem Aprendiz de Programação Back-End na equipe Squad Apps.
#

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" width="40" height="40"/>

## Utilizando o GitBash

### 🤔 Clonando Repositório:
```
1- Na página do seu repositório, clicar em '< >Code' e copiar o endereço https do seu repositório;
2- Criar uma pasta no seu computador local, abrir o git bash dentro da pasta criada;
3- utilizar comando 'git clone endereço https copiado do seu repositório.git';
```

### 😮 Commit e Push:
```
1- Entrar na pasta clonada através do git bash;
2- Configurar seu nome de usuário através do comando 'git config --global user.name "seu nome de usuário aqui" (o nome que aparece na página do github, nessa etapa o git pode pedir para você autorizar na página, utilizando a sua senha de acesso);
3- Comando 'git remote remove origin';
4- Comando 'git add .' ;
5- Criar uma token de acesso pessoal clicando no seu perfil>settings>Developer settings>Personal access tokens>Tokens>Generate new token (dar todos os acessos, gerar e copiar);
6- Comando 'git remote add origin https://COLAR A TOKEN AQUI@link https copiado do seu repositório .git'
7- Comando 'git commit -m "Versão atual do projeto";
8- Comando 'git push --set-upstream origin main'
```

### 😎 Outros comandos:

- **git config --global user.{name || email} {informação} ->** define nome de usuário ou endereço de e-mail
- **git help {comando} ->** pedir ajuda com comandos git
- **git clone {url} ->** clona um repositório
- **git add {arquivo} ->** monitora um novo arquivo (agora o arquivo faz parte do commit)
- **git status {arquivo} ->** vê se o arquivo está sendo monitorado (se está no commit)
- **git commit -m {"mensagem} ->** usado depois do git add | armazena o conteúdo do índice de um commit
- **git reset --hard HEAD~1 ->** retorna ao último commit
- **git reset --soft HEAD~1 ->** retorna ao último commit, mas mantém os arquivos no Stage
- **git rm -f {arquivo} ->** remove um arquivo do Git
- **git mv {arquivo origem} {arquivo destino} ->** renomeia um arquivo
- **git branch {nome} ->** cria um novo branch
- **git checkout {nome branch} ->** muda para um branch existente
- **git checkout -b {nome branch} ->** cria um novo branch e já muda para ele
- **git log ->** histórico de commits
- **git fech origin ->** pega dados de projetos remotos
- **git pull origin {nome branch} ->** incorpora as alterações de um repositório remoto no branch atual
- **git push {nome do repositório remoto} {nome da branch local} ->** transfere commits através de um repositório local para um repositório remoto

-> Para mais informações sobre os comandos Git consulte [aqui](https://comandosgit.github.io/).
