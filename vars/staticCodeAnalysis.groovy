#getting credentials as a parameter in the function then running sonar cmd
def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'mvn clean package sonar:sonar'
    }
}