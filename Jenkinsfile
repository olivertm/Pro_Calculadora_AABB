pipeline {
    agent { label 'master'}

        stages {
 
            stage ('Unit Tests') {
                steps {
                    sh "mvn clean compile test"
                }
            }

            stage ('Compile Pro_CalculadoraAABB') {
                steps {
                    sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"   
                }
            }
 
        }
}
