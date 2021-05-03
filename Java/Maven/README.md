## New Maven Project
1. Create Project
    - New --> Project --> Maven --> Maven Project
    - In the `New Maven Project Menu`
        - check the box for creating a simple maven project
        - Location: Use the Browse option to Create a folder in the directory to hold project
2. Let Maven Know your Java version
    - in the pom.xml file add your java version
    ```
        <properties>
            <maven.compiler.source>1.8</maven.compiler.source>
            <maven.compiler.target>1.8</maven.compiler.target>
        </properties>
    ```

3. Add dependecies
    - in the pom.xml file
    ```
    <dependencies>
		<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.7.1</version>
			<scope>test</scope>
		</dependency>

	</dependencies>
    ```


____________________________________
