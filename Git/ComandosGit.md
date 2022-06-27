# Comandos GIT

[◄ back](../README.md)

### Criação de chave SSH para o Github:

- Com Git instalado na máquina, execute o seguinte comando dentro do seu terminal:

  `ssh-keygen -t ed25519 -C <seu@email>`

- Agora é preciso vincular sua chave pública (arquivo com extensão `.pub`) do SSH ao Github, para isso basta executar:

  `cat ~/.ssh/id_ed25519.pub`

- Depois de colar a saída do comando anteior no Github, em `Settings` > `SSH and GPG keys` > `New SSH key`.

- Feito isso, teste o vinculo com o Github usando o comando a seguir no seu terminal:

  `ssh -T git@github.com`

### A seguir alguns dos principais comandos git e sua função, levando em consideração o conhecimento de termos como staged, merge e branch

- `git init`: usado quando uma pasta está na máquina e quer se iniciar um versionamento naquele diretório.

- `git add`: retira o arquivo do estado unmodified e o põe na "visão" do git, os transformando em modified.

- `git status`: mostra o estado dos arquivos e pastas do repositório, demonstrando quais arquivos e pastas foram modificados, quais estão sendo visiveis pelo git, entre outras informações.

- `git commit -m`: insere os arquivos que estão no estado modified na branch com um comentário

- `git pull <linkdorepo>`: faz um download do repo na sua máquina, atualizando a versão local com as novas branchs e novos commits feitos. Ou você pode apenas acessar o seu repositório local e a partir dele fazer o pull sem o link do repositório remoto.

- `git checkout -b <nomeBranch>`: cria uma nova branch ou em caso de já existência da branch ela reinicia seu status
