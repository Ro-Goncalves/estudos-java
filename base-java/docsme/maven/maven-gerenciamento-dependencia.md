# Maven Gerenciamento de Dependências

dentro da tag `project` colocamos a `dependencies` e dentro dela a `dependency`

Scop -Compile - Somente em tempo de compilação
     -provided - Não precisa dela no Build, já está no servidor
     -runtime - somente em tempo de execução
     -test - somente na fase de teste
     -system - é uma dependência que vem do sistema operacional ou outra fonte.

Por padrão o maven busca lib no repositório local, depois no central, o mvn repository.

Para incluir um novo repository.

```xml
<repositories>
    <repositoty>
        <id>id-local</id>
        <url>http://localhost:8081/artifactory/libs-release</url>
        <url>file://local/seu/computador</url>
    </repository>
</repositories>
```

O repositório local é uma pasta .m2 que fica no pc. Ele mantem uma versão de tudo o que já foi baixado.