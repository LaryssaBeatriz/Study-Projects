[◄ back](../README.md)

# Comandos GIT 

### A seguir alguns dos principais comandos git e sua função, levando em consideração o conhecimento de termos como staged, merge e branch

- `git init`: usado quando uma pasta está na máquina e quer se iniciar um versionamento naquele diretório.

- `git add`: retira o arquivo do estado unmodified e o põe na "visão" do git, os transformando em modified.

- `git status`: mostra o estado dos arquivos e pastas do repositório, demonstrando quais arquivos e pastas foram modificados, quais estão sendo visiveis pelo git, entre outras informações.

- `git commit -m`: insere os arquivos que estão no estado modified na branch com um comentário

- `git pull <linkdorepo>`: faz um download do repo na sua máquina, atualizando a versão local com as novas branchs e novos commits feitos. Ou você pode apenas acessar o seu repositório local e a partir dele fazer o pull sem o link do repositório remoto.

- `git checkout -b <nomeBranch>`: cria uma nova branch ou em caso de já existência da branch ela reinicia seu status

