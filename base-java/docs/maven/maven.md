# Um pouco Sobre Maven

## Instalação

Para instalar o maven, é relativamente fácil, basta baixar o binário mais [neste link](https://maven.apache.org/download.cgi). Descompactar em alguma pasta do seu computador. Para deixar a execução dele mais fácil, basta colocar o caminhinho `diretório-maven/bin` no **PATH** de seu SO.

Para testar execute:

```bash
mvn --version

Apache Maven 3.9.1 (2e178502fcdbffc201671fb2537d0cb4b4cc58f8)
Maven home: U:\GIT\util\maven
Java version: 17.0.10, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows server 2019", version: "10.0", arch: "amd64", family: "windows"
```

## Criar um projeto

Primeiro, devemos acessas a pasta na qual iremos criar o projeto. Depois utilizando a linha de comando, devemos fazer o seguinte.

Se quisermos usar o modo **interativo**

```bash
mvn org.apache.maven.plugins:maven-archetype-plugin:generate

Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 2110: # para escolher o tipo de projeto
Choose org.apache.maven.archetypes:maven-archetype-quickstart version: # para escolher a versão de maven-archetype-quickstart
1: 1.0-alpha-1
2: 1.0-alpha-2
3: 1.0-alpha-3
4: 1.0-alpha-4
5: 1.0
6: 1.1
7: 1.3
8: 1.4
Choose a number: 8: 8
Define value for property 'groupId': com.rogon # definir o groupId do projeto
Define value for property 'artifactId': demo # definir o artifactId
Define value for property 'version' 1.0-SNAPSHOT: : # definir a versão do projeto
Define value for property 'package' com.rogon: :
Confirm properties configuration:
groupId: com.rogon
artifactId: demo
version: 1.0-SNAPSHOT
package: com.rogon
 Y: : # confirmar tudo o que foi escolhido
```

Ou, podemos passar algumas informações direto no cli

```bash
mvn org.apache.maven.plugins:maven-archetype-plugin:generate -DarchetypeArtifactId="maven-archetype-quickstart" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4" -DgroupId="com.rogon" -DartifactId="demo" 
```

Onde:
- `org.apache.maven.plugins:maven-archetype-plugin`: Plugin que irá auxiliar na criação do POM
- `generate`: goal do plugin para gerar um projeto a partir de um arquivo de modelo
- `DarchetypeArtifactId`: Indica qual é o modelo que será utilizado
- `DarchetypeGroupId`: Indica a qual grupo o modelo pertence
- `DarchetypeVersion`: Indica a versão do modelo
- `DartifactId`: Indica qual é o nome do seu projeto, ao menos é assim que eu uso, por exemplo *meu-projeto-java-lindo*, *laboratorio*, etc
- `DarchetypeGroupId`: Indica quem está desenvolvendo o projeto, por exemplo, na empresa que trabalho uso *br.com.nomedaempresa* em meus particulares uso *com.rogon*

## POM

É no `pom.xml` que a mágica acontece. Existe bastatante coisas nele, até mesmo nesse simples que é criado no inicio. Vamos as que precisamos saber nesse momento.

```xml
<modelVersion>Versão do modelo utilizado pelo maven</modelVersion>

<groupId>Mesmo que foi definido ao criar o projeto -DarchetypeGroupId</groupId>
<artifactId>Mesmo que foi definido ao criar o projeto -DartifactId</artifactId>
<version>Versão do projeto</version>

<url>URL do site do projeto</url>
<name>Nome do projeto, mesmo que artifactId</name>
<properties>Contém as propriedades do projeto</properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<maven.compiler.source>1.17</maven.compiler.source>
<maven.compiler.target>1.17</maven.compiler.target>

<packaging>: tipo de empacotamento que o Maven irá utilizar quando o usuário quiser fazer a distribuição do projeto.

<name>: nome do projeto. Diferentemente do artifactId, não faz parte da identificação do projeto. O valor padrão é o valor do artifactId.

```


## Referências

- [Andeson Gome - Maven Criando um Projeto Maven Simples](https://medium.com/@andgomes/criando-um-projeto-maven-simples-a2ad88b25e78)
- [Maven](https://maven.apache.org/ref/3.9.6/maven-model/maven.html)

https://medium.com/@andgomes/maven-gerando-jars-execut%C3%A1veis-com-projetos-com-depend%C3%AAncias-5bcd022058ee
https://medium.com/@andgomes/gerando-jars-execut%C3%A1veis-b8492eab3671
https://medium.com/@andgomes/maven-protegendo-informa%C3%A7%C3%B5es-sens%C3%ADveis-em-projetos-compartilhados-1b4834befdca
https://medium.com/@andgomes/maven-java-lendo-arquivos-de-resource-a-partir-de-programas-java-a357bb193da0
https://medium.com/@andgomes/maven-centralizando-declara%C3%A7%C3%B5es-de-depend%C3%AAncias-ac4cb137b988
https://medium.com/@andgomes/maven-instalando-um-artefato-no-reposit%C3%B3rio-local-bdf2c599e301
https://medium.com/@andgomes/tipos-de-escopo-de-depend%C3%AAncia-4ef1168ee5dd
https://medium.com/@andgomes/maven-adicionando-os-javadocs-ao-site-de-um-projeto-b3352207bfbc
https://medium.com/@andgomes/gerando-os-javadocs-de-um-projeto-b7f03c30dc6e
https://medium.com/@andgomes/maven-gerando-a-p%C3%A1gina-web-de-um-projeto-cd3e97ee29b3
https://medium.com/@andgomes/maven-gerando-a-p%C3%A1gina-web-de-um-projeto-cd3e97ee29b3
https://medium.com/@andgomes/utilizando-a-heran%C3%A7a-entre-projetos-2bb1c8981ba9
https://medium.com/@andgomes/maven-gerando-um-arquivo-jar-execut%C3%A1vel-435b7135e400
https://medium.com/@andgomes/maven-agregando-projetos-468986793705
https://medium.com/@andgomes/gerando-o-arquivo-distribu%C3%ADvel-de-um-projeto-c5d6821be059
https://medium.com/@andgomes/adicionando-depend%C3%AAncias-c081e8086c11
https://medium.com/@andgomes/ativando-profiles-atrav%C3%A9s-de-properties-cc18d2999d49
https://medium.com/@andgomes/criando-profiles-18e827223122
https://medium.com/@andgomes/controlando-a-verbosidade-do-build-d628ebcfa2c5
https://medium.com/@andgomes/configurando-o-source-encoding-de-um-projeto-d988c8883b65
https://medium.com/@andgomes/visualizando-o-effective-pom-de-um-projeto-109321bd44e7
https://medium.com/@andgomes/alterando-a-localiza%C3%A7%C3%A3o-do-reposit%C3%B3rio-local-419a1a03b58c
https://medium.com/@andgomes/filtrando-arquivos-de-recurso-36f82b856c12
https://medium.com/@andgomes/copiando-arquivos-de-recurso-com-o-plugin-resources-948a4b76118
https://medium.com/@andgomes/os-ciclos-de-vida-do-maven-cefc18ba8ff3
https://medium.com/@andgomes/executando-testes-unit%C3%A1rios-com-o-plugin-surefire-ffdac17601a1
https://medium.com/@andgomes/limpando-diret%C3%B3rios-adicionais-com-o-plugin-clean-56405bc48d83
https://medium.com/@andgomes/limpando-o-build-automaticamente-com-o-plugin-clean-a69a413dabeb
https://medium.com/@andgomes/limpando-o-build-com-o-plugin-clean-2ed8ab63d239
https://medium.com/@andgomes/compilando-com-um-jdk-diferente-3778869b85ca
https://medium.com/@andgomes/compilando-com-o-plugin-compiler-do-maven-13c4afe12858