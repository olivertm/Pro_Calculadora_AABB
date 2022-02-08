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
  
            stage ('Checkout Github') {
                steps {
                 checkout([
                     branches: [[name: 'main']],
                     url: 'https://github.com/olivertm/Pro_Calculadora_AABB.git'
                 ])
                }

            }
        }
}
