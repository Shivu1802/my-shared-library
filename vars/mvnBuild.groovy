// Building the project using Maven
def call(){
    sh 'mvn clean install -DskipTests'
}