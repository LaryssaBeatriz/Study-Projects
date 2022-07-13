# Git

[◄ back](../README.md)

## Introdução

...

## Comandos Git

### Comandos Inicais

- Inicializando um repositório/pasta com Git.

    ```bash
    git init
    ```

- Clonar repositório/pasta.
    
    ```bash
    git clone <URL>
    ```

- Retira o arquivo do estado unmodified e o põe na "visão" do Git, os transformando em modified.

    ```bash
    git add <arquivo/pasta>
    ```

- Mostra o estado dos arquivos e pastas do repositório, demonstrando quais arquivos e pastas foram modificados, quais estão sendo visiveis pelo Git, entre outras informações.

    ```bash
    git status
    ```

- Insere os arquivos que estão no estado modified na branch com um comentário.

    ```bash
    git commit -m "mensagem"
    ```

- Faz download (puxa) das modificações do repositório remoto definido na `origin` para o repositório local.

    ```bash
    git pull origin <branch>
    ```

- Faz upload (envia) das modificações do repositório local para o repositório remoto definido na `origin`.

    ```bash
    git push origin <branch>
    ```

- Verificar `origin` (fetch & push) do repositório/pasta.
    
    ```bash
    git remote -v
    ```

---

### Comandos de Configuração

- Dinifindo globalmente o nome e e-mail do autor.

    ```bash
    git config --global user.name <name>
    ```

    ```bash
    git config --global user.email <my@mail.com>
    ```

    **Obs:** Para definir localmente, limitando ao respositório/pasta em questão, retire a flag `--global`.

- Configurar branch inicial p/ repositórios.
    
    ```bash
    git config --global init.defaultBranch <name>
    ```
    
- Definindo editor de texto padrão para o Git.
    
    ```bash
    git config --global core.editor <nome-do-editor>
    ```

### Chave SSH

...

[▲ top](#git)
