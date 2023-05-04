# Intelbras
### Descrição: Passo a passo da utilização do Git Bash.

Utilizando o gitbash

-------Clonando Repositório----------
1) Na página do seu repositório, clicar em '< >Code' e copiar o endereço https do seu repositório;
2) Criar uma pasta no seu computador local, abrir o git bash dentro da pasta criada;
3) utilizar comando 'git clone endereço https copiado do seu repositório.git';
-------------------------------------

------Commit e Push------------------
1) Entrar na pasta clonada através do git bash;
2) Configurar seu nome de usuário através do comando 'git config --global user.name "seu nome de usuário aqui" (o nome que aparece na página do github, nessa etapa o git pode pedir para você autorizar na página, utilizando a sua senha de acesso);
3) Comando 'git remote remove origin';
4) Comando 'git add .' ;
5) Criar uma token de acesso pessoal clicando no seu perfil>settings>Developer settings>Personal access tokens>Tokens>Generate new token (dar todos os acessos, gerar e copiar);
6) Comando 'git remote add origin https://COLAR A TOKEN AQUI@link https copiado do seu repositório .git'
7) Comando 'git commit -m "Versão atual do projeto";
8) Comando 'git push --set-upstream origin main'
-------------------------------------
