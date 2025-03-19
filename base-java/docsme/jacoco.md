# JACOCO

## Missão

>JaCoCo deve fornecer a tecnologia padrão para análise de cobertura de código em ambientes baseados em Java VM. O foco é fornecer uma biblioteca leve, flexível e bem documentada para integração com várias ferramentas de construção e desenvolvimento.

## Definição do produto

### Recursos

- Análise de cobertura de instruções (C0), ramos (C1), linhas, métodos, tipos e complexidade ciclomática.
- Baseado no código byte Java e, portanto, funciona também sem arquivos de origem.
- Integração simples por meio de instrumentação on-the-fly baseada em agente Java. Outros cenários de integração, como carregadores de classe personalizados, são possíveis por meio da API.
- Independente de estrutura: integra-se perfeitamente com aplicativos baseados em Java VM, como programas Java simples, estruturas OSGi, contêineres da web ou servidores EJB.
- Compatível com todas as versões de arquivo de classe Java lançadas.
- Suporte para diferentes linguagens JVM.
- Vários formatos de relatório (HTML, XML, CSV).
- Protocolo remoto e controle JMX para solicitar despejos de dados de execução do agente de cobertura a qualquer momento.
- Tarefas Ant para coletar e gerenciar dados de execução e criar relatórios de cobertura estruturados.
- Plug-in Maven para coletar informações de cobertura e criar relatórios em builds Maven.

### Características não funcionais

- Uso e integração simples com scripts e ferramentas de construção existentes.
- Bom desempenho com sobrecarga mínima de tempo de execução, especialmente para projetos de grande escala.
- Implementação leve com dependências mínimas de bibliotecas e recursos do sistema externos.
- Documentação abrangente.
- APIs totalmente documentadas ( JavaDoc ) e exemplos de integração com outras ferramentas.
- Testes de regressão com cobertura de teste funcional completa baseada em casos de teste JUnit.

## Contadores de Cobertura

Contadores de Cobertura JaCoCo usa um conjunto de diferentes contadores para calcular as métricas de cobertura. Todos esses contadores são derivados de informações contidas em arquivos de classe Java, que basicamente são instruções de byte code Java e informações de depuração opcionalmente embutidas nos arquivos de classe. Essa abordagem permite uma instrumentação e análise eficientes em tempo de execução de aplicações, mesmo quando não há código fonte disponível. Na maioria dos casos, as informações coletadas podem ser mapeadas de volta ao código fonte e visualizadas até o nível de granularidade de linha. De qualquer forma, há limitações para essa abordagem. Os arquivos de classe devem ser compilados com informações de depuração para calcular a cobertura de linha e fornecer realce de fonte. Nem todas as construções da linguagem Java podem ser diretamente compiladas para o byte code correspondente. Em tais casos, o compilador Java cria o chamado código sintético, que às vezes resulta em resultados de cobertura de código inesperados.

### Instruções (Cobertura C0)

A menor unidade que JaCoCo conta são instruções individuais de byte code Java. A cobertura de instrução fornece informações sobre a quantidade de código que foi executado ou perdido. Essa métrica é completamente independente do formato da fonte e sempre disponível, mesmo na ausência de informações de depuração nos arquivos de classe.

### Ramos (Cobertura C1)

 JaCoCo também calcula a cobertura de ramo para todas as instruções if e switch. Essa métrica conta o número total de tais ramos em um método e determina o número de ramos executados ou perdidos. A cobertura de ramo está sempre disponível, mesmo na ausência de informações de depuração nos arquivos de classe. Observe que o tratamento de exceções não é considerado como ramos no contexto desta definição de contador. Se os arquivos de classe foram compilados com informações de depuração, os pontos de decisão podem ser mapeados para linhas de origem e realçados de acordo:

- Sem cobertura: Nenhum ramo na linha foi executado (diamante vermelho)
- Cobertura parcial: Apenas uma parte dos ramos na linha foi executada (diamante amarelo)
- Cobertura total: Todos os ramos na linha foram executados (diamante verde)

### Complexidade Ciclomática

JaCoCo também calcula a complexidade ciclomática para cada método não abstrato e resume a complexidade para classes, pacotes e grupos. De acordo com sua definição por McCabe1996, a complexidade ciclomática é o número mínimo de caminhos que podem, em combinação (linear), gerar todos os caminhos possíveis por meio de um método. Assim, o valor da complexidade pode servir como uma indicação para o número de casos de teste de unidade para cobrir totalmente um determinado pedaço de software. As figuras de complexidade podem sempre ser calculadas, mesmo na ausência de informações de depuração nos arquivos de classe. A definição formal da complexidade ciclomática v(G) é baseada na representação do gráfico de fluxo de controle de um método como um gráfico direcionado:

>v(G) = E - N + 2

Onde E é o número de arestas e N o número de nós. JaCoCo calcula a complexidade ciclomática de um método com a seguinte equação equivalente baseada no número de ramos (B) e no número de pontos de decisão (D):

>v(G) = B - D + 1

Com base no status de cobertura de cada ramo, JaCoCo também calcula a complexidade coberta e perdida para cada método. A complexidade perdida é novamente uma indicação para o número de casos de teste faltando para cobrir totalmente um módulo. Observe que, como JaCoCo não considera o tratamento de exceções como ramos, os blocos try/catch também não aumentarão a complexidade.

### Linhas

Para todos os arquivos de classe que foram compilados com informações de depuração, as informações de cobertura para linhas individuais podem ser calculadas. Uma linha de origem é considerada executada quando pelo menos uma instrução atribuída a essa linha foi executada. Devido ao fato de que uma única linha normalmente compila para várias instruções de byte code, o realce do código fonte mostra três status diferentes para cada linha que contém código fonte:

- Sem cobertura: Nenhuma instrução na linha foi executada (fundo vermelho)
- Cobertura parcial: Apenas uma parte da instrução na linha foi executada (fundo amarelo)
- Cobertura total: Todas as instruções na linha foram executadas (fundo verde)

Dependendo do formato da fonte, uma única linha de um código fonte pode se referir a vários métodos ou várias classes. Portanto, a contagem de linhas de métodos não pode ser simplesmente adicionada para obter o total para a classe que os contém. O mesmo vale para as linhas de várias classes dentro de um único arquivo de origem. JaCoCo calcula a cobertura de linha para classes e arquivos de origem com base nas linhas de origem reais cobertas.

### Métodos

Cada método não abstrato contém pelo menos uma instrução. Um método é considerado executado quando pelo menos uma instrução foi executada. Como JaCoCo trabalha no nível de byte code, também construtores e inicializadores estáticos são contados como métodos. Alguns desses métodos podem não ter uma correspondência direta no código fonte Java, como construtores padrão implícitos e, portanto, gerados ou inicializadores para constantes.

### Classes

Uma classe é considerada executada quando pelo menos um de seus métodos foi executado. Observe que JaCoCo considera construtores, bem como inicializadores estáticos, como métodos. Como os tipos de interface Java podem conter inicializadores estáticos, essas interfaces também são consideradas como classes executáveis.

## Maven Plug-in

O plug-in JaCoCo Maven fornece o agente de execução JaCoCo para seus testes e permite a criação de relatórios básicos.

>Se você deseja incluir informações de número de linha nos relatórios de cobertura ou se deseja destacar o código-fonte, os arquivos de classe do alvo de teste devem ser compilados com informações de depuração.

>Ao usar os plugins **maven-surefire-plugin** ou **maven-failsafe-plugin**, você não deve definir um **forkCount** de 0 ou configurar o **forkMode** como **never**, pois isso impediria a execução dos testes com o **javaagent** definido e nenhuma cobertura seria registrada.

### Exemplo

Para executar testes JUnit sob cobertura de código e criar um relatório de cobertura (target/site/jacoco/index.html).

```xml
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.11</version>
    <executions>
        <execution>
            <id>default-prepare-agent</id>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>default-report</id>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
        <execution>
            <id>default-check</id>
            <goals>
                <goal>check</goal>
            </goals>
            <configuration>
            <rules>
                <rule>
                    <element>BUNDLE</element>
                    <limits>
                        <limit>
                            <counter>COMPLEXITY</counter>
                            <value>COVEREDRATIO</value>
                            <minimum>0.60</minimum>
                        </limit>
                    </limits>
                </rule>
            </rules>
            </configuration>
        </execution>
    </executions>
</plugin>
```

Para executar testes de unidade e testes de integração sob cobertura de código e criar dois relatórios de cobertura: um para testes de unidade (target/site/jacoco/index.html) e outro para testes de integração (target/site/jacoco-it/index.html).

```xml
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.12-SNAPSHOT</version>
    <executions>
        <execution>
            <id>default-prepare-agent</id>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>default-prepare-agent-integration</id>
            <goals>
                <goal>prepare-agent-integration</goal>
            </goals>
        </execution>
        <execution>
            <id>default-report</id>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
        <execution>
            <id>default-report-integration</id>
            <goals>
                <goal>report-integration</goal>
            </goals>
        </execution>
        <execution>
            <id>default-check</id>
            <goals>
                <goal>check</goal>
            </goals>
            <configuration>
                <rules>
                    <rule>
                        <element>BUNDLE</element>
                        <limits>
                            <limit>
                                <counter>COMPLEXITY</counter>
                                <value>COVEREDRATIO</value>
                                <minimum>0.60</minimum>
                            </limit>
                        </limits>
                    </rule>
                </rules>
            </configuration>
        </execution>
    </executions>
</plugin>
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.16</version>
</plugin>
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-failsafe-plugin</artifactId>
    <version>2.16</version>
    <executions>
        <execution>
            <id>default-integration-test</id>
            <goals>
                <goal>integration-test</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

- O exemplo completo está localizado na pasta ./doc/examples/build da distribuição.

### Pré-requisitos

O plug-in JaCoCo Maven requer:

- Maven 3.0 ou superior
- Java 1.8 ou superior para o tempo de execução do Maven, Java 1.5 ou superior para o executor de teste.

### Uso

O plug-in Maven pode ser incluído em sua construção com a seguinte declaração. Verifique aqui a versão de lançamento mais recente no repositório.

```xml
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.12-SNAPSHOT</version>
</plugin>
```

Para obter uma lista completa de metas e parâmetros disponíveis, você pode usar o maven-help-plugin:

```console
mvn help:describe -Dplugin=org.jacoco:jacoco-maven-plugin -Ddetail
```

O uso do plugin em conjunto com o maven-site-plugin sem seleção explícita de relatórios pode resultar na geração de relatórios agregados redundantes. Para evitar isso, especifique os reportSets explicitamente:

```xml
<project>
  <reporting>
    <plugins>
      <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <reportSets>
          <reportSet>
            <reports>
              <!-- select non-aggregate reports -->
              <report>report</report>
            </reports>
          </reportSet>
        </reportSets>
      </plugin>
    </plugins>
  </reporting>
</project>
```

## Goals

O plug-in Maven JaCoCo define os seguintes objetivos:

- [help](https://www.jacoco.org/jacoco/trunk/doc/help-mojo.html)
- prepare-agent
- prepare-agent-integration
- merge
- report
- report-integration
- report-aggregate
- check
- dump
- instrument
- restore-instrumented-classes
