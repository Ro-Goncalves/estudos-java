# Build do projeto

- mvn package

```xml
<build>
  <plugins>
      <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <encoding>UTF-8</encoding>
                <source>${java.version}</source>
                <target>${java.version}</target>
                <release>${java.version}</release>					
            </configuration>
            </plugin>
    </plugins>
</build>

````